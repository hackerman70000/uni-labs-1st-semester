import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @org.junit.jupiter.api.Test
    void divide() {
      int a = 10;
      int b = 3;

      assertEquals(3,new Sample().divide(a,b));
    }

    @org.junit.jupiter.api.Test
    void testDivide() {
        double a = 0;
        double b = 7;

    }
}