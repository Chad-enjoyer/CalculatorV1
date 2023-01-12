public class NumbersRange extends MathMethods{
    public static void takeRange() {
        System.out.println("Введите диапазон чисел (первое значение имеет индекс 0");
        var choise = MethodeChoice.getUserChoice();
        if (choise == SUM) {
            int result;
            int result1;
            while (true) {
                try {
                    String userInput = sc.nextLine();
                    result = Integer.parseInt(userInput); // ????
                    String userInput1 = sc.nextLine();
                    result1 = Integer.parseInt(userInput1); // ??????
                    if (result < 0) {
                        continue;
                    }
                    if (result1 < 0) {
                        continue;
                    }
                    if (result > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    if (result1 > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    break;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException ignored) {
                }
            }
            System.out.println(sum(result, result1));
        }
        if (MethodeChoice.getUserChoice() == MULTIPLICATION) {
            int result;
            int result1; // DRY???
            while (true) {
                try {
                    String userInput = sc.nextLine();
                    result = Integer.parseInt(userInput);
                    String userInput1 = sc.nextLine();
                    result1 = Integer.parseInt(userInput1);
                    if (result < 0) {
                        continue;
                    }
                    if (result1 < 0) {
                        continue;
                    }
                    if (result > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    if (result1 > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    break;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException ignored) {
                }
            }
            System.out.println(multiplication(result, result1));
        }
        if (MethodeChoice.getUserChoice() == DIVIDE) {
            int result;
            int result1;
            while (true) {
                try {
                    String userInput = sc.nextLine();
                    result = Integer.parseInt(userInput);
                    String userInput1 = sc.nextLine();
                    result1 = Integer.parseInt(userInput1);
                    if (result < 0) {
                        continue;
                    }
                    if (result1 < 0) {
                        continue;
                    }
                    if (result > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    if (result1 > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    break;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException ignored) {
                }
            }
            System.out.println(divide(result, result1));
        }
        if (MethodeChoice.getUserChoice() == SUBTRACTION) {
            int result;
            int result1;
            while (true) {
                try {
                    String userInput = sc.nextLine();
                    result = Integer.parseInt(userInput);
                    String userInput1 = sc.nextLine();
                    result1 = Integer.parseInt(userInput1);
                    if (result < 0) {
                        continue;
                    }
                    if (result1 < 0) {
                        continue;
                    }
                    if (result > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    if (result1 > Massive.getNumbersStorage().length) {
                        continue;
                    }
                    break;
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException ignored) {
                }
            }
            System.out.println(subtraction(result, result1));
        }
    }
}
