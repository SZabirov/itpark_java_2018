package com.company.shape;

public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }

    int perimeter() {

        int p = 2 * (length + width);
        return p;
    }
}
