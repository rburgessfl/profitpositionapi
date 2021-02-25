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
    public String dcf;
    public String dcfValue;
    public String companyProfile;
    public String companyProfileValue;
    public String financialRatios;
    public String financialRatiosValues;
    public String incomeStatements;
    public String balanceSheetStatements;
    public String cashFlowStatements;
    public String incomeStatementsGrowth;
    public String balanceSheetStatementsGrowth;
    public String cashFlowStatementsGrowth;

    public String getDataPackage(String symbol) throws IOException{
        String a = getCompanyProfile(symbol);
        String b = getDcf(symbol);
        String c = getBbands(symbol);
        String d = getAtr(symbol);
        String e = getFinancialRatios(symbol);
        String f = getIncomeStatement(symbol);
        String g = getBalanceSheetStatement(symbol);
        String h = getCashFlowStatement(symbol);
        String i = getIncomeStatementGrowth(symbol);
        String j = getBalanceSheetStatementGrowth(symbol);
        String k = getCashFlowStatementGrowth(symbol);

        return "["+a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+j+","+k+"]";
    }

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

    public String getDcf(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/discounted-cash-flow/"+symbol+"?apikey="+apiKey2), String.class);
        dcf = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode[] node = mapper.readValue(dcf, ObjectNode[].class);
        System.out.println("Symbol: "+symbol+" - Discounted Cash Flow");
        dcfValue = String.valueOf(node[0]);
        return dcfValue;
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

    public String getFinancialRatios(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/ratios-ttm/"+symbol+"?apikey="+apiKey2), String.class);
        financialRatios = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode[] node = mapper.readValue(financialRatios, ObjectNode[].class);
        System.out.println("Symbol: "+symbol+" - Financial Ratios");
        financialRatiosValues = String.valueOf(node[0]);
        return financialRatiosValues;
    }

    public String getIncomeStatement(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/income-statement/"+symbol+"?period=annual&limit=5&apikey="+apiKey2), String.class);
        incomeStatements = response.getBody();
        System.out.println("Symbol: "+symbol+" - Income Statement");
        return incomeStatements;
    }

    public String getBalanceSheetStatement(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/balance-sheet-statement/"+symbol+"?period=annual&limit=5&apikey="+apiKey2), String.class);
        balanceSheetStatements = response.getBody();
        System.out.println("Symbol: "+symbol+" - Balance Sheet Statements");
        return balanceSheetStatements;
    }

    public String getCashFlowStatement(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/cash-flow-statement/"+symbol+"?period=annual&limit=5&apikey="+apiKey2), String.class);
        cashFlowStatements = response.getBody();
        System.out.println("Symbol: "+symbol+" - Cash Flow Statements");
        return cashFlowStatements;
    }
    public String getIncomeStatementGrowth(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/income-statement-growth/"+symbol+"?period=annual&limit=5&apikey="+apiKey2), String.class);
        incomeStatementsGrowth = response.getBody();
        System.out.println("Symbol: "+symbol+" - Income Statement Growth");
        return incomeStatementsGrowth;
    }

    public String getBalanceSheetStatementGrowth(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/balance-sheet-statement-growth/"+symbol+"?period=annual&limit=5&apikey="+apiKey2), String.class);
        balanceSheetStatementsGrowth = response.getBody();
        System.out.println("Symbol: "+symbol+" - Balance Sheet Statements Growth");
        return balanceSheetStatementsGrowth;
    }

    public String getCashFlowStatementGrowth(String symbol) throws IOException{
        ResponseEntity<String> response = restTemplate.getForEntity(
                ("https://financialmodelingprep.com/api/v3/cash-flow-statement-growth/"+symbol+"?period=annual&limit=5&apikey="+apiKey2), String.class);
        cashFlowStatementsGrowth = response.getBody();
        System.out.println("Symbol: "+symbol+" - Cash Flow Statements Growth");
        return cashFlowStatementsGrowth;
    }

}