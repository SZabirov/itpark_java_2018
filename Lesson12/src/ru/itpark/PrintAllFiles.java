package ru.itpark;

import java.io.File;

public class PrintAllFiles {
    public static void main(String[] args) {
        File f = new File("C:\\projects");
        print(f);
    }

    static void print(File f) {
        if (f.isDirectory()) {
            File[] arr = f.listFiles();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                File file = arr[i];
                print(file);
            }
        } else {
            System.out.println(f.getName());
        }
    }
}




