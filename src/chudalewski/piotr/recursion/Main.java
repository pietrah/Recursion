package chudalewski.piotr.recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

    public static int recursiveFactorial(int num) {
        if(num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    public static int iterativeFactorial(int num) {
        if(num == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= num;
        }

        return factorial;
    }
}
