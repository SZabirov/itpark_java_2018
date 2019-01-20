package ru.itpark;

import java.io.File;

public class FileTest2 {
    public static void main(String[] args) {
        File f = new File("C:\\projects\\Lesson12");
        File[] arr = f.listFiles();
        int n = arr.length;
        //печатает список всего, что есть в папке
        //с их именами и укзанием того, это папка или нет
        for (int i = 0; i < n; i++) {
            File file = arr[i];
            boolean b = file.isDirectory();
            System.out.println(file.getName() + " " + b);
        }
    }
}
