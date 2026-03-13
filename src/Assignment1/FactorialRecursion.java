package Assignment1;


class FactorialRecursion {

    int factorial(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        FactorialRecursion obj = new FactorialRecursion();
        System.out.println("Factorial = " + obj.factorial(5));
    }
}