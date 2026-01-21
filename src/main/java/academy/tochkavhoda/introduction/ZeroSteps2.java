package academy.tochkavhoda.introduction;

import java.util.Random;

public class ZeroSteps2 {
    public int sumSquares(int count){
        int total = 1;
        for(int i = 2; i <= count; i++){
            total += i*i;
        }
        return total;
    }
    public int sumOdds(int count){
        int total = 0;
        for (int i = 1; i <= count; i++){
            if(i % 2 == 1 || i == 1)
                total += i;
        }
        return total;
    }
    public double sumInverses(int count){
        double total;
        total = 1.0;
        for(double i = 2; i <= count; i++){
            total += 1/i;
        }
        return total;
    }
    public long factorial(int count) {
        long total = 1;

        for (int i = 1; i <= count; i++) {
            total *= i;
        }

        return total;
    }
    public int prodDigits(int value){
        int total = 1;

        if (value == 0) {
            return 0;
        }

        for (; value > 0; value /= 10) {
            total *= value % 10;
        }

        return total;
    }
    public int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= number; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
    public long sum2Powers(int max) {
        long sum = 0;
        long power = 1;
        for (int i = 0; i <= max; i++) {
            sum += power;
            power *= 2;
        }
        return sum;
    }
    public int sumSquaresWithBarrier(int count, int barrier) {
        int total = 1;
        for(int i = 2; i <= count; i++){
            total += i*i;
            if (total > barrier) {
                break;
            }
        }
        return total;
    }
    public int sumPairProd(int count1, int count2) {
        int total = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                total += i * j;
            }
        }
        return total;
    }
    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int total = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int prod = i * j;
                if (prod < barrier) {
                    total += prod;
                }
            }
        }
        return total;
    }
    public double sumInversePairProd(int count1, int count2) {
        double total = 0.0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                total += 1.0 / (i * j);
            }
        }
        return total;
    }
    public int sumTripleProd(int count1, int count2, int count3) {
        int total = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    total += i * j * k;
                }
            }
        }
        return total;
    }
    public double calculateE() {
        double total = 1.0;
        double term = 1.0;
        for (int n = 1; term >= 1E-6; n++) {
            term /= n;
            total += term;
        }
        return total;
    }
    public double calculatePi() {
        double total = 0.0;
        double term;
        int sign = 1;
        for (int i = 1; ; i += 2) {
            term = sign * (1.0 / i);
            if (Math.abs(term) < 1E-8) break;
            total += term;
            sign = -sign;
        }
        return 4 * total;
    }
    public double calculateCircleSquare(double length, int count) {
        Random rand = new Random();
        int k = 0;
        double radius = length / 2.0;
        double center;
        center = radius;
        for (int i = 0; i < count; i++) {
            double x = rand.nextDouble() * length;
            double y = rand.nextDouble() * length;

            double dx = x - center;
            double dy = y - center;

            if (dx * dx + dy * dy <= radius * radius) {
                k++;
            }
        }
        return length * length * k / (double) count;
    }

}