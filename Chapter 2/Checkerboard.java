// This program display shapes with asterisks
//Exercise 2.27 (Checkerboard Pattern of Asterisks)

public class Checkerboard {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0)
                System.out.println("* * * * * * * *");
            else
                System.out.println(" * * * * * * * *");
        }
    }
}
