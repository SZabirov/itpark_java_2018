package ru.itpark;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\projects\\Lesson12\\abc.txt");
        boolean b = f.exists();//возвращает true, если такой файл есть
        System.out.println(b);
        f.delete();//удаляет файл
        f.createNewFile();
        String s = f.getName();//получение имени файла
    }
}
