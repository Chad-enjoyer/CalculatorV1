public class MethodeChoice extends MathMethods{
    private static int userChoice;
    public static void setUserChoice() {
        System.out.println("Выберите необходимую операцию\n1.Суммирование\n2.Умножение\n3.Поделить\n4.Вычитание");
        userChoice = sc.nextInt();
    }
    public static int getUserChoice() {
        return userChoice;
    }
} // Sum methode for chosen numbers
