package net.profitposition.api.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class QuoteRequest {

    @Autowired
    RestTemplate restTemplate;

    public String apiKey = System.getProperty("api_key");

    public String fetch(String ticker) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://api.twelvedata.com/quote?symbol="+ticker+"&interval=1day&apikey="+apiKey+"&series_type=close"), String.class);

        String responseBody = response.getBody();

        return responseBody;
    }

}
