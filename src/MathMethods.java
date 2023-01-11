import java.util.Scanner;

public class MathMethods {
    static Scanner sc = new Scanner(System.in);
    static int SUM = 1;
    static int MULTIPLICATION = 2;
    static int DIVIDE = 3;
    static int SUBTRACTION = 4;
    public static int sum(int a, int b) {
        int sumNumbers = Massive.getNumbersStorage()[a];
        for (int c = a; c < b; c++) {
            sumNumbers += Massive.getNumbersStorage()[c + 1];
        }
        return sumNumbers;
    }
} // Sum methode for chosen numbers
    public static double multiplication(int a, int b) {
        double multiplication = Massive.getNumbersStorage()[a];
        for (int c = a; c < b; c++) {
            multiplication *= Massive.getNumbersStorage()[c + 1];
        }
        return multiplication;
    } // Multiplication methode for chosen numbers
    public static int subtraction(int a, int b) {
        int subtract = Massive.getNumbersStorage()[a];
        for (int c = a; c < b; c++) {
           subtract -= Massive.getNumbersStorage()[c + 1];
        }
        return subtract;
    }  // Subtraction methode for chosen numbers
    public static double divide(int a, int b) {
        double divider = Massive.getNumbersStorage()[a];
        for (int c = a; c < b; c++) {
            divider /= Massive.getNumbersStorage()[c + 1];
        }
        return divider;
    } // Divide methode for chosen numbers
}
