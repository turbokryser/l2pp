// TaylorSeriesCalculatorBigDecimalTest.java
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.MathContext;
import static org.junit.jupiter.api.Assertions.*;

class TaylorSeriesCalculatorBigDecimalTest {
    private final TaylorSeriesCalculator calculatorBigDecimal = new TaylorSeriesCalculator();

    @Test
    void testcalculateArctan1() {
        BigDecimal x = BigDecimal.valueOf(0.5);
        int k = 6;
        BigDecimal epsilon = BigDecimal.valueOf(Math.pow(10, -k));
        BigDecimal result = calculatorBigDecimal.calculateArctan(x, epsilon);
        BigDecimal expected = BigDecimal.valueOf(Math.atan(x.doubleValue()));

        // Используем MathContext для округления до точности k
        MathContext mc = new MathContext(k);
        assertEquals(expected.round(mc), result.round(mc), "Результат должен совпадать с Math.asin с точностью " + k + " знаков");
    }

    @Test
    void testcalculateArctan2() {
        BigDecimal x = BigDecimal.valueOf(0.9);
        int k = 5;
        BigDecimal epsilon = BigDecimal.valueOf(Math.pow(10, -(k+1)));
        BigDecimal result = calculatorBigDecimal.calculateArctan(x, epsilon);
        BigDecimal expected = BigDecimal.valueOf(Math.atan(x.doubleValue()));

        // Используем MathContext для округления до точности k
        MathContext mc = new MathContext(k);
        assertEquals(expected.round(mc), result.round(mc), "Результат должен совпадать с Math.asin с точностью " + k + " знаков");
    }

    @Test
    void testcalculateArctan3() {
        BigDecimal x = BigDecimal.valueOf(0.0);
        int k = 6;
        BigDecimal epsilon = BigDecimal.valueOf(Math.pow(10, -k));
        BigDecimal result = calculatorBigDecimal.calculateArctan(x, epsilon);
        BigDecimal expected = BigDecimal.valueOf(Math.atan(x.doubleValue()));

        // Используем MathContext для округления до точности k
        MathContext mc = new MathContext(k);
        assertEquals(expected.round(mc), result.round(mc), "Результат должен совпадать с Math.asin с точностью " + k + " знаков");
    }

    @Test
    void testcalculateArctan4() {
        BigDecimal x = BigDecimal.valueOf(-0.5);
        int k = 6;
        BigDecimal epsilon = BigDecimal.valueOf(Math.pow(10, -k));
        BigDecimal result = calculatorBigDecimal.calculateArctan(x, epsilon);
        BigDecimal expected = BigDecimal.valueOf(Math.atan(x.doubleValue()));

        // Используем MathContext для округления до точности k
        MathContext mc = new MathContext(k);
        assertEquals(expected.round(mc), result.round(mc), "Результат должен совпадать с Math.asin с точностью " + k + " знаков");
    }
}