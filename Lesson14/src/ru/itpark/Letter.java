package ru.itpark;

public class Letter {
    char letter;

    Letter(char c) {
        if ('a' <= c | c >= 'z') {
            letter = c;
        } else {
            System.out.println("Это не буква");
        }
    }
}
