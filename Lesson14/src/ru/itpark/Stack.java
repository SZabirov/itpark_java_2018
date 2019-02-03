package ru.itpark;

public class Stack {
    char[] symbols = new char[7];
    int n = 0;

    void push(char c) {
        symbols[n] = c;
        n++;
    }

    char pop() {
        n--;
        return symbols[n];
    }
}
