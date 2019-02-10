package ru.itpark;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    CalculatorEngine engine;
    JPanel panel;
    JTextField field;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonMultiply;
    JButton buttonDivide;

    public Calculator() {
        engine = new CalculatorEngine(this);//создает энджин и передает ссылку на самого себя
        panel = new JPanel();
        BorderLayout b = new BorderLayout();
        panel.setLayout(b);
        field = new JTextField();
        panel.add("North", field);//добавил в самый верх поле

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonEqual = new JButton("=");

        //pastebin.com/2nYZmatR
        button0.addActionListener(engine);
        button1.addActionListener(engine);
        button2.addActionListener(engine);
        button3.addActionListener(engine);
        button4.addActionListener(engine);
        button5.addActionListener(engine);
        button6.addActionListener(engine);
        button7.addActionListener(engine);
        button8.addActionListener(engine);
        button9.addActionListener(engine);
        buttonPoint.addActionListener(engine);
        buttonPlus.addActionListener(engine);
        buttonMinus.addActionListener(engine);
        buttonDivide.addActionListener(engine);
        buttonMultiply.addActionListener(engine);
        buttonEqual.addActionListener(engine);

        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new GridLayout(4, 3));

        buttonPanel1.add(button0);
        buttonPanel1.add(button1);
        buttonPanel1.add(button2);
        buttonPanel1.add(button3);
        buttonPanel1.add(button4);
        buttonPanel1.add(button5);
        buttonPanel1.add(button6);
        buttonPanel1.add(button7);
        buttonPanel1.add(button8);
        buttonPanel1.add(button9);
        buttonPanel1.add(buttonPoint);
        buttonPanel1.add(buttonEqual);

        panel.add("Center", buttonPanel1);

        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new GridLayout(4, 1));

        buttonPanel2.add(buttonPlus);
        buttonPanel2.add(buttonMinus);
        buttonPanel2.add(buttonMultiply);
        buttonPanel2.add(buttonDivide);

        panel.add("East", buttonPanel2);

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(panel);
        frame.pack();//делает размер фрейма в размер контента
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
