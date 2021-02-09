package net.profitposition.api.restservice;

import java.io.IOException;

import net.profitposition.api.data.BbandsValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbandsController {

    @Autowired
    BbandsRequest service;

    @GetMapping("/bbands/{ticker}")
    public BbandsValues execute(@PathVariable String ticker) throws IOException {
        return service.fetch(ticker);
    }
}