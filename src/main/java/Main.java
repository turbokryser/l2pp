

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x (от -1 до 1): ");
        BigDecimal x = scanner.nextBigDecimal();

        System.out.print("Введите значение k (натуральное число): ");
        int k = scanner.nextInt();

        BigDecimal epsilon = BigDecimal.valueOf(Math.pow(10, -(k+1)));
        TaylorSeriesCalculator calculator = new TaylorSeriesCalculator();
        BigDecimal result = calculator.calculateArctan(x, epsilon);

        System.out.printf("Приближенное значение arctan(%s) с точностью ε = 10^-%d: %s%n", x, k, result);
        System.out.printf("Проверка с Math.atan: %s%n", Math.atan(x.doubleValue()));
    }
}