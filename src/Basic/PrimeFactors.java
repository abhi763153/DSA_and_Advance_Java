package Basic;

public class PrimeFactors {
    public static void main(String[] args) {

        primeFactors(250);
    }

    // Method to perform prime factorization
    public static void primeFactors(int number) {
        // Divide by 2 while the number is even
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        // Check for odd factors starting from 3
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        // If the number is a prime greater than 2
        if (number > 2) {
            System.out.print(number);
        }
    }
}
