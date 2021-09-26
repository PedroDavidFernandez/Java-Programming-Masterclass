package com.example.currencyconversionservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    // http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
    public CurrencyConversionController calculateCurrencyConversion(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity
    ) {
        return new CurrencyConversion(
                1001L,
                from,
                to,
                quantity,
                BigDecimal.ONE,
                BigDecimal.ONE,
                ""
        );
    }
}
