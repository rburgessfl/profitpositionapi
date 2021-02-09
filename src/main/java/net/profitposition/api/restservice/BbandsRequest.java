package net.profitposition.api.restservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.profitposition.api.data.BbandsValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class BbandsRequest {

    @Autowired
    RestTemplate restTemplate;

    public String apiKey = System.getProperty("api_key");
    public String BbandsPackage;

    public BbandsValues fetch(String ticker) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://api.twelvedata.com/bbands?symbol="+ticker+"&interval=1day&apikey="+apiKey+"&series_type=close"), String.class);

        String responseBody = response.getBody();
        BbandsPackage = responseBody.substring(responseBody.indexOf("values"));
        BbandsPackage = BbandsPackage.substring(BbandsPackage.indexOf(":")+1);
        int end = BbandsPackage.length()-15;
        BbandsPackage = BbandsPackage.substring(0, end);

        ObjectMapper mapper = new ObjectMapper();
        BbandsValues[] Bbandsdata = mapper.readValue(BbandsPackage, BbandsValues[].class);

        return Bbandsdata[0];
    }

}
