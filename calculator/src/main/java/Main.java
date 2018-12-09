public class Main {
    public static void main(String[] args) {
        String[] names = new String[100];
        names[0] = "Иванов";
        names[1] = "Петров";
        //...
        names[99] = "Забиров";
        String[] newNames = new String[200];
        for (int i = 0; i < 100; i++) {
            newNames[i] = names[i];
        }
        newNames[100] = "Петров";
    }
}
