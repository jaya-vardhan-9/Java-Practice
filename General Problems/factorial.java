
    public class factorial {
        public static int factorial(int n) {
            if (n == 0 || n == 1) { // If the number is 0 or 1, the factorial is always 1.
                return 1;
            } else {
                return n * factorial(n - 1); // Otherwise, we multiply the number by the factorial of the number one less than it.
            }
        }
    
        public static void main(String[] args) {
            int n = 5; // We can change this number to find the factorial of different numbers.
            System.out.println("Factorial of " + n + " is: " + factorial(n));
        }
    }
    

