/*
* File: MainController.java
* Author: Szép Andor
* Copyright: 2026, Szép Andor
* Group: Szoft IN
* Date: 2026-04-21
* Github: https://github.com/andorbandi/
* Licenc: MIT
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField r1Field;

    @FXML
    private TextField r2Field;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        this.startCalc();
    }

    void startCalc() {

        try {
            double r1 = Double.parseDouble(r1Field.getText());
            double r2 = Double.parseDouble(r2Field.getText());
            double height = Double.parseDouble(heightField.getText());

            double volume = Ellipse.calcVolume(r1, r2, height);
            volumeField.setText(String.format("%.3f", volume));

            Storage.save(r1, r2, height, volume);
        } catch(Exception e) {
            System.out.println("Hiba: " + e.getMessage());
        }
    }

}
