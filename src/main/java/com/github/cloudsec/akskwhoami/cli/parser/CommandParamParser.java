package com.github.cloudsec.akskwhoami.cli.parser;

import com.github.cloudsec.akskwhoami.cli.domain.TestTaskExecutorConfig;
import com.github.cloudsec.akskwhoami.executor.selector.AllServiceProviderSelector;
import com.github.cloudsec.akskwhoami.service.base.ServiceProvider;
import com.github.cloudsec.akskwhoami.service.domain.NetworkMode;
import org.apache.commons.cli.*;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * 用于解析命令行参数
 *
 * @author CC11001100
 */
public class CommandParamParser {

    /**
     * 指定access key的短命令
     */
    public static final String COMMAND_PARAM_ACCESS_KEY_SHORT = "ak";

    /**
     * 指定access key的长命令
     */
    public static final String COMMAND_PARAM_ACCESS_KEY_LONG = "access-key";

    /**
     * 指定security key的短命令
     */
    public static final String COMMAND_PARAM_SECURE_KEY_SHORT = "sk";

    /**
     * 指定security key的长命令
     */
    public static final String COMMAND_PARAM_SECURE_KEY_LONG = "secure-key";

    /**
     * 列出目前支持的所有云平台（短选项）
     */
    public static final String COMMAND_PARAM_LIST_SHORT = "l";

    /**
     * 列出目前支持的所有云平台（长选项）
     */
    public static final String COMMAND_PARAM_LIST_LONG = "list";

    /**
     * 打印帮助信息的短命令
     */
    public static final String COMMAND_PARAM_HELP_SHORT = "h";

    /**
     * 打印帮助信息的长命令
     */
    public static final String COMMAND_PARAM_HELP_LONG = "help";

    /**
     * 构建命令行参数
     *
     * @return
     */
    private Options buildOptions() {
        Options options = new Options();

        // ak
        Option akOptions = new Option(COMMAND_PARAM_ACCESS_KEY_SHORT, COMMAND_PARAM_ACCESS_KEY_LONG, true, "Specify the access key to be tested");
        akOptions.setRequired(false);
        options.addOption(akOptions);

        // sk
        Option skOptions = new Option(COMMAND_PARAM_SECURE_KEY_SHORT, COMMAND_PARAM_SECURE_KEY_LONG, true, "Specify the secret key to be tested");
        skOptions.setRequired(false);
        options.addOption(skOptions);

        // list
        Option listOptions = new Option(COMMAND_PARAM_LIST_SHORT, COMMAND_PARAM_LIST_LONG, false, "List all the cloud platforms currently supported for detection.\n");
        listOptions.setRequired(false);
        options.addOption(listOptions);

        // help
        Option helpOptions = new Option(COMMAND_PARAM_HELP_SHORT, COMMAND_PARAM_HELP_LONG, false, "Print help information");
        helpOptions.setRequired(false);
        options.addOption(helpOptions);

        return options;
    }


    /**
     * 解析命令行参数
     *
     * @param args
     * @return
     */
    public TestTaskExecutorConfig parse(String[] args) throws CommandParamParserException {
        TestTaskExecutorConfig config = new TestTaskExecutorConfig();
        Options options = this.buildOptions();
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);

            // 打印支持的云平台列表
            if (cmd.hasOption(COMMAND_PARAM_LIST_LONG)) {
                this.showSupportServiceProviderList();
                return null;
            }

            // 打印帮助信息
            if (cmd.hasOption(COMMAND_PARAM_HELP_LONG)) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("CommandLineArgs", options);
                return null;
            }

            config.setAccessKey(cmd.getOptionValue(COMMAND_PARAM_ACCESS_KEY_LONG));
            config.setSecretKey(cmd.getOptionValue(COMMAND_PARAM_SECURE_KEY_LONG));

            return config;
        } catch (ParseException e) {
            throw new CommandParamParserException(e);
        }
    }

    /**
     * 列出当前支持的云平台列表
     */
    private void showSupportServiceProviderList() {
        List<ServiceProvider> serviceProviderList = new AllServiceProviderSelector().select(null);
        System.out.printf("Total: %d%n", serviceProviderList.size());
        for (ServiceProvider serviceProvider : serviceProviderList) {

            StringBuilder msg = new StringBuilder();

            msg.append(serviceProvider.getName());

            List<NetworkMode> supportNetworkModeList = serviceProvider.getSupportNetworkModeList();
            if (CollectionUtils.isNotEmpty(supportNetworkModeList)) {
                msg.append("（");
                for (int i = 0; i < supportNetworkModeList.size(); i++) {
                    msg.append(supportNetworkModeList.get(i).toString().toLowerCase());
                    if (i != supportNetworkModeList.size() - 1) {
                        msg.append(",");
                    }
                }
                msg.append("）");
            }

            msg.append(" - ").append(serviceProvider.getProductUrl());
            System.out.println(msg);

        }
    }

}
