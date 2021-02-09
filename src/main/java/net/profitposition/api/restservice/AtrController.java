package net.profitposition.api.restservice;

import java.io.IOException;

import net.profitposition.api.data.AtrValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtrController {

    @Autowired
    AtrRequest service;

    @GetMapping("/atr/{ticker}")
    public AtrValues execute(@PathVariable String ticker) throws IOException {
        return service.fetch(ticker);
    }
}