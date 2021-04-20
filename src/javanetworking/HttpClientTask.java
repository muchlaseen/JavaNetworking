/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Native
 */
public class HttpClientTask {

    public void sendGetRequest() throws IOException {

        System.out.println("PHRASE 1 : HTTP GET Request\n");

        String url = "https://jedangoding.com/api/post";
        HttpGet request = new HttpGet(url);

        request.addHeader("custom-key", "jedangoding.com");
        request.addHeader(HttpHeaders.USER_AGENT, "jedangoding.com");

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
                CloseableHttpResponse response = httpClient.execute(request)) {

            System.out.println("URL to GET: " + url);
            System.out.println("Protocol Version: " + response.getProtocolVersion());
            System.out.println("Response Code: " + response.getStatusLine().getStatusCode());
            System.out.println("Phrase: " + response.getStatusLine().getReasonPhrase());
            System.out.println("Status: " + response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                String result = EntityUtils.toString(entity);
                System.out.println("\nResult:");
                System.out.println(result);

            }

        } catch (Exception e) {
        }
    }

    public void sendPostRequest() throws IOException {

        System.out.println("PHRASE 2 : HTTP POST Request\n");

        String result = "";
        String url = "https://jedangoding.com/api/post/save";
        HttpPost post = new HttpPost(url);

        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"id\":\"20\",");
        json.append("\"title\":\"Test\",");
        json.append("\"description\":\"Description Test\",");
        json.append("\"content\":\"-\",");
        json.append("\"author\":\"Admin\"");
        json.append("}");

        post.addHeader("Content-Type", "application/json");
        post.setEntity(new StringEntity(json.toString()));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
                CloseableHttpResponse response = httpClient.execute(post)) {

            System.out.println("URL to POST: " + url);
            System.out.println("Response Code: " + response.getStatusLine().getStatusCode());

            result = EntityUtils.toString(response.getEntity());
            System.out.println(result);
        }

        
    }
}
