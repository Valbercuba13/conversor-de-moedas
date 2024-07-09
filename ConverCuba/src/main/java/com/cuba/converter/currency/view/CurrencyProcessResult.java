package com.cuba.converter.currency.view;

import com.cuba.converter.currency.controller.CurrencyController;

import java.io.IOException;

public class CurrencyProcessResult {

    private final CurrencyController currencyController;
    private double exchangeResult;

    public CurrencyProcessResult() {
        this.currencyController = new CurrencyController();
    }

    public double performConversion(String currencies, double value) {


        try {
            exchangeResult = currencyController.processExchange(currencies, value);
        } catch (IOException e) {
            CurrencyErrorView.showError("Ocorreu um erro na solicitação da API: " + e.getMessage());

        } catch (InterruptedException e) {
            CurrencyErrorView.showError("A operação foi interrompida devido a uma ação do usuário ou uma situação inesperada. Por favor, tente novamente mais tarde." + e.getMessage());

        } catch (Exception e) {
            CurrencyErrorView.showError("Ocorreu um erro inesperado." + e.getMessage());

        }

        return exchangeResult;
    }

}
