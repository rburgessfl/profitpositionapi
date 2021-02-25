package net.profitposition.api.RestService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @Autowired
    RequestHandler service;

    @GetMapping("/datapackage/{symbol}")
    public String execute0(@PathVariable String symbol) throws IOException {
        return service.getDataPackage(symbol);
    }

    @GetMapping("/atr/{symbol}")
    public String execute1(@PathVariable String symbol) throws IOException {
        return service.getAtr(symbol);
    }

    @GetMapping("/bbands/{symbol}")
    public String execute2(@PathVariable String symbol) throws IOException {
        return service.getBbands(symbol);
    }

    @GetMapping("/dcf/{symbol}")
    public String execute3(@PathVariable String symbol) throws IOException {
        return service.getDcf(symbol);
    }

    @GetMapping("/companyprofile/{symbol}")
    public String execute4(@PathVariable String symbol) throws IOException {
        return service.getCompanyProfile(symbol);
    }

    @GetMapping("/financialratios/{symbol}")
    public String execute5(@PathVariable String symbol) throws IOException {
        return service.getFinancialRatios(symbol);
    }

    @GetMapping("/incomestatement/{symbol}")
    public String execute6(@PathVariable String symbol) throws IOException {
        return service.getIncomeStatement(symbol);
    }

    @GetMapping("/balancesheetstatement/{symbol}")
    public String execute7(@PathVariable String symbol) throws IOException {
        return service.getBalanceSheetStatement(symbol);
    }

    @GetMapping("/cashflowstatement/{symbol}")
    public String execute8(@PathVariable String symbol) throws IOException {
        return service.getCashFlowStatement(symbol);
    }

    @GetMapping("/incomestatementgrowth/{symbol}")
    public String execute9(@PathVariable String symbol) throws IOException {
        return service.getIncomeStatementGrowth(symbol);
    }

    @GetMapping("/balancesheetstatementgrowth/{symbol}")
    public String execute10(@PathVariable String symbol) throws IOException {
        return service.getBalanceSheetStatementGrowth(symbol);
    }

    @GetMapping("/cashflowstatementgrowth/{symbol}")
    public String execute11(@PathVariable String symbol) throws IOException {
        return service.getCashFlowStatementGrowth(symbol);
    }

}

