package com.cuba.converter.temperature.view;

import com.cuba.converter.view.Converter;

import javax.swing.*;

public class TemperatureView implements Converter {

    @Override
    public String getName() {
        return "Conversor de Temperatura";
    }

    @Override
    public void getConverterMenu() {
        showTemperatureMenu();
    }

    public void showTemperatureMenu() {
        JOptionPane.showMessageDialog(null, "Em desenvolvimento!",
                "Temperatura", JOptionPane.WARNING_MESSAGE);
    }
}
