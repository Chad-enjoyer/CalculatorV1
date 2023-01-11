import java.util.Scanner;

public class Massive {
    /* private public default */private Scanner sc;  // private???

    private int[] numbersStorage;

    public Massive(int[] numbersStorage) {
        System.out.println("Массив создался епта");
        this.sc = new Scanner(System.in);
        this.numbersStorage = numbersStorage;
    }

    // static цэ плоха
    public int[] getNumbersStorage() {
        System.out.println("getNumber");
        return numbersStorage;
    }

    public void setNumbersStorage(int[] numbersStorage) {
        Massive.numbersStorage = numbersStorage;
    }
    public int[] massiveArr(int length){ // название плохое((
        System.out.println("Введите количество чисел");

        return new int[length];
    }
    public void numbersTaker() {  // ???
        System.out.println("Vvedi");
        massiveArr(sc.nextInt());
        System.out.println("Введите числа");
        for (int i = 0; i < numbersStorage.length; i++) {
            numbersStorage[i] = sc.nextInt();
        }
    }
}
