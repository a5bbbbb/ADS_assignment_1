package solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionTask5 implements SolutionInterface{
    @Override
    public String getParametersDescription() {
        return "Enter a single number n.";
    }

    @Override
    public int getTaskNumber() {
        return 5;
    }

    @Override
    public int getNumberOfInputLines() {
        return 1;
    }

    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int n;
        try{
            n = scan.nextInt();
        }catch (Exception ignored){
            return "Input is incorrect";
        }
        BigInteger fibonacci = BigInteger.ONE, prevFibonacci = BigInteger.ZERO;
        for(int i = 2; i <= n; i++) {
            BigInteger newFibonacci = fibonacci.add(prevFibonacci);
            prevFibonacci = fibonacci;
            fibonacci = newFibonacci;
        }
        return String.valueOf(fibonacci);
    }
}
