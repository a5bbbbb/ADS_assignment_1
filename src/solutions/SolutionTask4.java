package solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionTask4 implements SolutionInterface{
    @Override
    public String getParametersDescription() {
        return "Enter a single number n.";
    }

    @Override
    public int getTaskNumber() {
        return 4;
    }

    @Override
    public int getNumberOfInputLines() {
        return 1;
    }

    /*
     * This is a method that calculates nth factorial.
     *
     * Time complexity: O(n)
     *
     * @param arguments argument that contains 'n'.
     *
     * @return String nth factorial.
     */
    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int n;
        try{
            n = scan.nextInt();
        }catch (Exception ignored){
            return "Input is incorrect";
        }
        BigInteger factorial = BigInteger.ONE;
        for(int i = 2; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return String.valueOf(factorial);
    }
}
