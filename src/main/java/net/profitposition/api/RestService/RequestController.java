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

    @GetMapping("/atr/{symbol}")
    public String execute1(@PathVariable String symbol) throws IOException {
        return service.getAtr(symbol);
    }

    @GetMapping("/bbands/{symbol}")
    public String execute2(@PathVariable String symbol) throws IOException {
        return service.getBbands(symbol);
    }

    @GetMapping("/companyprofile/{symbol}")
    public String execute4(@PathVariable String symbol) throws IOException {
        return service.getCompanyProfile(symbol);
    }

}

