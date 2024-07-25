package com.github.cloudsec.akskwhoami.cli.parser;

import com.github.cloudsec.akskwhoami.cli.domain.TestTaskExecutorConfig;
import org.apache.commons.cli.*;

/**
 *
 * 用于解析命令行参数
 *
 * @author CC11001100
 */
public class CommandParamParser {

    public static final String ACCESS_KEY_SHORT = "ak";

    public static final String ACCESS_KEY_LONG = "access-key";

    public static final String SECURE_KEY_SHORT = "sk";

    public static final String SECURE_KEY_LONG = "secure-key";

    /**
     * @return
     */
    private Options buildOptions() {
        Options options = new Options();

        // ak
        Option akOptions = new Option(ACCESS_KEY_SHORT, ACCESS_KEY_LONG, true, "Specify the access key to be tested");
        akOptions.setRequired(false);
        options.addOption(akOptions);

        // sk
        Option skOptions = new Option(SECURE_KEY_SHORT, SECURE_KEY_LONG, true, "Specify the secret key to be tested");
        skOptions.setRequired(false);
        options.addOption(skOptions);

        // help
        Option helpOptions = new Option("h", "help", false, "Print this message");
        helpOptions.setRequired(false);
        options.addOption(helpOptions);

        return options;
    }


    /**
     * @param args
     * @return
     */
    public TestTaskExecutorConfig parse(String[] args) throws CommandParamParserException {
        TestTaskExecutorConfig config = new TestTaskExecutorConfig();
        Options options = this.buildOptions();
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("help")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("CommandLineArgs", options);
                return null;
            }

            config.setAccessKey(cmd.getOptionValue(ACCESS_KEY_LONG));
            config.setSecretKey(cmd.getOptionValue(SECURE_KEY_LONG));

            return config;
        } catch (ParseException e) {
            throw new CommandParamParserException(e);
        }
    }

}
