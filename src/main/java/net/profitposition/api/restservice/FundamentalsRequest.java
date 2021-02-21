package net.profitposition.api.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class FundamentalsRequest {

    @Autowired
    RestTemplate restTemplate;

    public String apiKey2 = System.getProperty("api_key2");
    public String responseBody1;
    public String responseBody2;
    public String responseBody3;

    public String fetch(String ticker) throws IOException{
        ResponseEntity<String> response1 = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/income-statement/"+ticker+"?period=quarter&limit=4&apikey="+apiKey2), String.class);
        ResponseEntity<String> response2 = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/balance-sheet-statement/"+ticker+"?period=quarter&limit=4&apikey="+apiKey2), String.class);
        ResponseEntity<String> response3 = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/cash-flow-statement/"+ticker+"?period=quarter&limit=4&apikey="+apiKey2), String.class);

        responseBody1 = response1.getBody();
        responseBody2 = response2.getBody();
        responseBody3 = response3.getBody();

        return "{\"data\":["+responseBody1+","+responseBody2+","+responseBody3+"]}";
    }
}
