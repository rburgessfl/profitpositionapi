package net.profitposition.api.RestService;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class RequestHandler {

    @Autowired
    RestTemplate restTemplate;

    public String apiKey = System.getProperty("apikey");
    public String apiKey2 = System.getProperty("apikey2");
    public String atr;
    public String atrData;
    public String atrValue;
    public String bbands;
    public String bbandsData;
    public String bbandsValues;
    public String companyProfile;
    public String companyProfileValue;

    public String getAtr(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://api.twelvedata.com/atr?interval=1day&time_period=14&outputsize=1&symbol="+symbol+"&apikey="+apiKey), String.class);
        atr = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.readValue(atr, ObjectNode.class);
        atrData = String.valueOf(node.get("values"));
        ObjectNode[] node1 = mapper.readValue(atrData, ObjectNode[].class);
        System.out.println("Symbol: "+symbol+" - Average True Range");
        atrValue = String.valueOf(node1[0]);
        return atrValue;
    }

    public String getBbands(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://api.twelvedata.com/bbands?interval=1day&ma_type=SMA&outputsize=1&sd=2&time_period=20&symbol="+symbol+"&apikey="+apiKey), String.class);
        bbands = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.readValue(bbands, ObjectNode.class);
        bbandsData = String.valueOf(node.get("values"));
        ObjectNode[] node1 = mapper.readValue(bbandsData, ObjectNode[].class);
        System.out.println("Symbol: "+symbol+" - Bollinger Bands");
        bbandsValues = String.valueOf(node1[0]);
        return bbandsValues;
    }

    public String getCompanyProfile(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/profile/"+symbol+"?apikey="+apiKey2), String.class);
        companyProfile = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode[] node = mapper.readValue(companyProfile, ObjectNode[].class);
        System.out.println("Symbol: "+symbol+" - Company Profile");
        companyProfileValue = String.valueOf(node[0]);
        return companyProfileValue;
    }

}