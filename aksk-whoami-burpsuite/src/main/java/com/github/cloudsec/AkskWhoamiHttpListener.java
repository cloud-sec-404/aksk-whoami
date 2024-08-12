package com.github.cloudsec;

import burp.IHttpListener;
import burp.IHttpRequestResponse;

/**
 * @author CC11001100
 */
public class AkskWhoamiHttpListener implements IHttpListener {

    @Override
    public void processHttpMessage(int i, boolean b, IHttpRequestResponse iHttpRequestResponse) {
        // TODO 2024-08-12 21:51:13 根据正则对流量中的aksk进行匹配
    }

}
