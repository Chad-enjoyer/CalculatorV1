public class Main {
    public static void main(String[] args) {
        System.out.println("  ");

        Massive storage = new Massive(
                new int[] {10, 20}
        );
        storage.setNumbersStorage();
        //создавай объекты а не статика
        Massive.massiveArr();
        Massive.numbersTaker();
        MethodeChoice.setUserChoice();
        NumbersRange.takeRange();
    }
}