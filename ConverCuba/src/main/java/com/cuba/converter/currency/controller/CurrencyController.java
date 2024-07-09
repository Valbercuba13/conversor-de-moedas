package com.cuba.converter.currency.controller;

import com.cuba.converter.currency.service.CurrencyService;

import java.io.IOException;


public class CurrencyController {

    private static final String API_URL = "https://economia.awesomeapi.com.br/last/BRL-USD,BRL-EUR,BRL-GBP,BRL-ARS,BRL-CLP,USD-BRL,EUR-BRL,GBP-BRL,ARS-BRL,CLP-BRL";

    private final CurrencyService currencyService;

    public CurrencyController() {
        this.currencyService = new CurrencyService();
    }


    public double processExchange(String currencies, double value) throws IOException, InterruptedException {
        return currencyService.calculateExchange(API_URL, currencies, value);
    }

}
