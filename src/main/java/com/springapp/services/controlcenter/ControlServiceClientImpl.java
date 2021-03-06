package com.springapp.services.controlcenter;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class ControlServiceClientImpl implements ControlServiceClient {

    //@Value("${services.controlcenter.url}")
    private String controlCenterServiceUrl = "http://localhost:8080";

    @Override
    public void sendToControlCenter(String json) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(controlCenterServiceUrl + "/ControlCenterService/fromInfoTools");

            List<NameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("targets", json));

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8));

            try (CloseableHttpResponse response = httpclient.execute(httpPost)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    try (InputStream inputStream = entity.getContent()) {
                    }
                }
            }
        } catch (IOException e) {}
    }
}
