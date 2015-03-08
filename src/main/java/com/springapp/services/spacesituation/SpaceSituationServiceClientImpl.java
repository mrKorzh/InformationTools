package com.springapp.services.spacesituation;

import com.springapp.services.controlcenter.ControlServiceClient;
import org.apache.commons.io.IOUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class SpaceSituationServiceClientImpl implements SpaceSituationServiceClient {

    //@Value("${services.spacesituation.url}")
    private String spaceSituationServiceUrl = "http://192.168.1.157";

    @Autowired
    private ControlServiceClient controlServiceClient;

    @Override
    public void sendToSpaceSituationService(String json) {
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpPost httpPost = new HttpPost(spaceSituationServiceUrl + "/situation/getLast/");

            List<NameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("json", json));

            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8));

            try (CloseableHttpResponse response = httpclient.execute(httpPost)) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    try (InputStream inputStream = entity.getContent()) {
                        String vovan = IOUtils.toString(inputStream, "UTF-8");
                        System.out.println(vovan);
                        controlServiceClient.sendToControlCenter(vovan);
                    }
                }
            }
        } catch (IOException e) {}
    }

}