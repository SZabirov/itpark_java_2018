package ru.itpark;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");

        JPanel panel = new JPanel();
        frame.setContentPane(panel);//прикрепили панель к фрейму

        JLabel label1 = new JLabel("Число 1:");
        panel.add(label1);
        JTextField field1 = new JTextField(25);//создаем поле для ввода
        panel.add(field1);//прикрепляем поле для ввода на панель

        JLabel label2 = new JLabel("Число 2:");
        panel.add(label2);
        JTextField field2 = new JTextField(25);
        panel.add(field2);

        JButton button = new JButton("Сумма");
        panel.add(button);
        CalculatorEngine e = new CalculatorEngine(null);
        button.addActionListener(e);

        frame.setSize(400, 300);//задали размер
        frame.setVisible(true);//сделали видимым
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
