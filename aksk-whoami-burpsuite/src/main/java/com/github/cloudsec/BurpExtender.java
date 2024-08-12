package com.github.cloudsec;

import burp.IBurpExtender;
import burp.IBurpExtenderCallbacks;

import java.io.OutputStream;

/**
 * @author CC11001100
 */
public class BurpExtender implements IBurpExtender {

    /**
     * burp插件的名字
     */
    public static final String EXTENSION_NAME = "Aksk whoami";

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks iBurpExtenderCallbacks) {

        // 设置插件信息
        iBurpExtenderCallbacks.setExtensionName(EXTENSION_NAME);

        // 注册http请求监听器
        AkskWhoamiHttpListener httpListener = new AkskWhoamiHttpListener();
        iBurpExtenderCallbacks.registerHttpListener(httpListener);
//        iBurpExtenderCallbacks.addSuiteTab();

        // 打印插件初始化信息
        OutputStream stdout = iBurpExtenderCallbacks.getStdout();



    }

}
