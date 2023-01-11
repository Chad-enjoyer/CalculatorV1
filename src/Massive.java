import java.util.Scanner;

public class Massive {
    static Scanner sc = new Scanner(System.in);
    private static int[] numbersStorage;

    public static int[] getNumbersStorage() {
        return numbersStorage;
    }

    public static void setNumbersStorage(int[] numbersStorage) {
        Massive.numbersStorage = numbersStorage;
    }
    public static void massiveArr(){
        System.out.println("Введите количество чисел");
        Massive.setNumbersStorage(new int[sc.nextInt()]);
    }
    public static void numbersTaker() {
        System.out.println("Введите числа");
        for (int i = 0; i < numbersStorage.length; i++) {
            numbersStorage[i] = sc.nextInt();
        }
    }
}
