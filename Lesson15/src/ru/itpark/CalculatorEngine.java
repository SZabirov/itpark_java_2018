package ru.itpark;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    Calculator calc;
    double result = 0;
    char operation;

    public CalculatorEngine(Calculator calculator) {
        calc = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();//источник произошедшего действия
        JButton pressedButton = (JButton) o;//кнопка, которую нажали
        char c = pressedButton.getText().charAt(0);
        String text = calc.field.getText();

        if ('0' <= c & c <= '9' | c == '.') {
            calc.field.setText(text + c);
        }
        if (c == '+' | c == '-' | c == '*' | c == '/') {
            double d = Double.valueOf(text);
            result = d;
            operation = c;
            calc.field.setText("");
        }
        if (c == '=') {
            double d = Double.valueOf(text);
            if (operation == '+') {
                result = result + d;
            }
            if (operation == '-') {
                result = result - d;
            }
            calc.field.setText(String.valueOf(result));
        }
    }
}
