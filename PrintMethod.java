public class PrintMethod {
    public static void main(String[] args) {
        // Using print()
        System.out.print("\"Learning Java is Fun\"\n");
        System.out.print(" Hey, come and learn Java with me");

        // Using println()
        System.out.println();
        System.out.println("I want to tell you that Java is different from JavaScript");
        System.out.println("\tThis is the indented text");

        // Using printf()
        System.out.printf("My name is %s and I love %s. Good day everyone%n", "Bartholomew", "momo");
        System.out.printf("I am %d years old%n", 21);
        System.out.printf("I bought Java JDK with %.2f naira%n", 159.36);
        System.out.printf("I bought Java JDK with %s%.2f%n", "$", 136.55); // Fix for currency format

        boolean isJavaFun = true;
        System.out.printf("Is Java fun? %b%n", isJavaFun);
    }
}
