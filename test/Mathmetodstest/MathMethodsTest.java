import org.junit.jupiter.api.Assertions;

class MathMethodsTest {
    @org.junit.jupiter.api.Test
    public void sum() {
        Massive.setNumbersStorage(new int[]{10, 20});
        Assertions.assertEquals(30, MethodeChoice.sum(0,1));
    }

    @org.junit.jupiter.api.Test
    public void multiplication() {
        Massive.setNumbersStorage(new int[]{10, 20});
        Assertions.assertEquals(200, MathMethods.multiplication(0,1));
    }

    @org.junit.jupiter.api.Test
    public void subtraction() {
        Massive.setNumbersStorage(new int[]{10, 20});
        Assertions.assertEquals(-10, MathMethods.subtraction(0,1));
    }

    @org.junit.jupiter.api.Test
    public void divide() {
        Massive.setNumbersStorage(new int[]{10, 20});
        Assertions.assertEquals(0.5, MathMethods.divide(0,1));
    }
}