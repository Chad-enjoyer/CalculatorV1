import java.util.Scanner;

public class MathMethods {
    static Scanner sc = new Scanner(System.in);
    static final int SUM = 1; // final uzai
    static final int MULTIPLICATION = 2;
    static final int DIVIDE = 3;
    static final int SUBTRACTION = 4;

    // можно из ренжи а можно выбрать конкретные значения
    // сложение
    // 1 5

//    public static int sumDoubleNum(int firstNum, int secondNum) {
//        var storage = Massive.getNumbersStorage();
//        return storage[firstNum] + storage[secondNum];
//    }
    public static int sum(int a, int b) {
        int sumNumbers = Massive.getNumbersStorage()[a]; // result
        for (int c = a; c < b; c++) {
            sumNumbers += Massive.getNumbersStorage()[c + 1];
        }
        return sumNumbers;
    }
 // Sum method for chosen numbers
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
        double divider = Massive.getNumbersStorage()[a]; // ???
        for (int c = a; c < b; c++) {
            divider /= Massive.getNumbersStorage()[c + 1];
        }
        return divider;
    } // Divide methode for chosen numbers
}
