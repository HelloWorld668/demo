package com.demo.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;

public class HttpUtils {
    static Logger logger  =  Logger.getLogger(ChacterTypeUtil.class );
    public static String doGet(String url) {
        String result = "";
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet get = new HttpGet(url);
            HttpResponse response = httpclient.execute(get);
            HttpEntity entity = response.getEntity();
            int status = response.getStatusLine().getStatusCode();
            if (status == HttpStatus.SC_OK) {
                InputStream inSm = entity.getContent();
                BufferedReader br = new BufferedReader(new InputStreamReader(inSm, "utf-8"));
                for (String temp = br.readLine(); temp != null; result += temp, temp = br.readLine());
            }
        } catch (Exception e) {
            logger.error("HttpUtil doGet error: ", e);
        }
        return result;
    }
}   
