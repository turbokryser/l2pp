import java.math.BigDecimal;

public class TaylorSeriesCalculator {
    public BigDecimal calculateArctan(BigDecimal x, BigDecimal epsilon) {
        BigDecimal sum = x;
        BigDecimal sum1 = BigDecimal.ZERO;
        BigDecimal term = x;
        BigDecimal xSquared = x.multiply(x);
        int n = 1;

        while (sum.subtract(sum1).abs().compareTo(epsilon) >= 0) {
            sum1=sum;
            term = term.multiply(xSquared).multiply(BigDecimal.valueOf(-1));
            BigDecimal term1 = term.divide(BigDecimal.valueOf(2 * n + 1), epsilon.scale() + 1, BigDecimal.ROUND_HALF_UP);
            sum = sum.add(term1);
            n++;
        }

        return sum;
    }
}