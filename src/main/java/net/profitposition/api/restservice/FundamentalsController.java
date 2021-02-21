package net.profitposition.api.restservice;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundamentalsController {

    @Autowired
    FundamentalsRequest service;

    @GetMapping("/fundamentals/{ticker}")
    public String execute(@PathVariable String ticker) throws IOException {
        return service.fetch(ticker);
    }
}
