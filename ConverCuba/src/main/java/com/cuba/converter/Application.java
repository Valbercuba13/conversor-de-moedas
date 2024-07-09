package com.cuba.converter;


import com.cuba.converter.view.MainView;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainView window = new MainView();
            window.showConverterMenu();
        });
    }
}
