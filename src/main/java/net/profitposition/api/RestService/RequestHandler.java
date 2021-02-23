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
    public String companyOverview;
    public String incomeStatement;
    public String balanceSheetStatement;
    public String cashFlowStatement;
    public String quote;
    public String metaData;
    public String lastRefreshed;
    public String atr;
    public String atrData;
    public String atrValues;
    public String bbands;
    public String bbandsData;
    public String bbandsValue;

    public String getCompanyOverview(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=OVERVIEW&symbol="+symbol+"&apikey="+ apiKey), String.class);
        companyOverview = response.getBody();
        return companyOverview;
    }

    public String getIncomeStatement(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=INCOME_STATEMENT&symbol="+symbol+"&apikey="+ apiKey), String.class);
        incomeStatement = response.getBody();
        return incomeStatement;
    }

    public String getBalanceSheet(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=BALANCE_SHEET&symbol="+symbol+"&apikey="+ apiKey), String.class);
        balanceSheetStatement = response.getBody();
        return balanceSheetStatement;
    }

    public String getCashFlow(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=CASH_FLOW&symbol="+symbol+"&apikey="+ apiKey), String.class);
        cashFlowStatement = response.getBody();
        return cashFlowStatement;
    }

    public String getQuote(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol="+symbol+"&apikey="+ apiKey), String.class);
        quote = response.getBody();
        return quote;
    }

    public String getAtr(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=ATR&symbol="+symbol+"&interval=daily&time_period=14&datatype=json&apikey="+ apiKey), String.class);
        atr = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.readValue(atr, ObjectNode.class);
        metaData = String.valueOf(node.get("Meta Data"));
        ObjectNode node1 = mapper.readValue(metaData, ObjectNode.class);
        lastRefreshed = String.valueOf(node1.get("3: Last Refreshed"));
        atrData = String.valueOf(node.get("Technical Analysis: ATR"));
        ObjectNode node2 = mapper.readValue(atrData, ObjectNode.class);
        atrValues = String.valueOf(node2.get(lastRefreshed.substring(1,11)));
        return atrValues;
    }

    public String getBbands(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://www.alphavantage.co/query?function=BBANDS&symbol="+symbol+"&interval=daily&time_period=20&series_type=close&matype=0&nbdevup=2&nbdevdn=2&apikey="+ apiKey), String.class);
        bbands = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.readValue(bbands, ObjectNode.class);
        metaData = String.valueOf(node.get("Meta Data"));
        ObjectNode node1 = mapper.readValue(metaData, ObjectNode.class);
        lastRefreshed = String.valueOf(node1.get("3: Last Refreshed"));
        bbandsData = String.valueOf(node.get("Technical Analysis: BBANDS"));
        ObjectNode node2 = mapper.readValue(bbandsData, ObjectNode.class);
        bbandsValue = String.valueOf(node2.get(lastRefreshed.substring(1,11)));
        return bbandsValue;
    }

}
