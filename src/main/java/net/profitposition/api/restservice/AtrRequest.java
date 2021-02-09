package net.profitposition.api.restservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.profitposition.api.data.AtrValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class AtrRequest {

    @Autowired
    RestTemplate restTemplate;

    public String apiKey = System.getProperty("api_key");
    public String atrPackage;

    public AtrValues fetch(String ticker) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://api.twelvedata.com/atr?symbol="+ticker+"&interval=1day&apikey="+apiKey+"&series_type=close"), String.class);

        String responseBody = response.getBody();
        atrPackage = responseBody.substring(responseBody.indexOf("values"));
        atrPackage = atrPackage.substring(atrPackage.indexOf(":")+1);
        int end = atrPackage.length()-15;
        atrPackage = atrPackage.substring(0, end);

        ObjectMapper mapper = new ObjectMapper();
        AtrValues[] ATRdata = mapper.readValue(atrPackage, AtrValues[].class);

        return ATRdata[0];
    }

}
