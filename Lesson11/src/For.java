public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i = i + 1) {
            System.out.print(i);
            System.out.println("Какие-то действия для i = " + i);
        }
    }
}
