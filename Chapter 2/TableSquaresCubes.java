//// This program does squares and cubes
//Exercise 2.31 (Table of Squares and Cubes)

public class TableSquaresCubes {
    public static void main(String[] args) {
        System.out.println("Number  Square  Cube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
        }
    }
}
