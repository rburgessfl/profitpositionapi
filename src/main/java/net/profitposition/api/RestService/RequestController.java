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

    @GetMapping("/companyoverview/{symbol}")
    public String execute0(@PathVariable String symbol) throws IOException {
        return service.getCompanyOverview(symbol);
    }

    @GetMapping("/incomestatement/{symbol}")
    public String execute1(@PathVariable String symbol) throws IOException {
        return service.getIncomeStatement(symbol);
    }

    @GetMapping("/balancesheet/{symbol}")
    public String execute2(@PathVariable String symbol) throws IOException {
        return service.getBalanceSheet(symbol);
    }

    @GetMapping("/cashflow/{symbol}")
    public String execute3(@PathVariable String symbol) throws IOException {
        return service.getCashFlow(symbol);
    }

    @GetMapping("/quote/{symbol}")
    public String execute4(@PathVariable String symbol) throws IOException {
        return service.getQuote(symbol);
    }

    @GetMapping("/atr/{symbol}")
    public String execute5(@PathVariable String symbol) throws IOException {
        return service.getAtr(symbol);
    }

    @GetMapping("/bbands/{symbol}")
    public String execute6(@PathVariable String symbol) throws IOException {
        return service.getBbands(symbol);
    }

}

