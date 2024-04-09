package solutions;

import java.util.Scanner;

public class SolutionTask10 implements SolutionInterface{
    @Override
    public String getParametersDescription() {
        return "Enter two numbers two 'a' and 'b'.";
    }

    @Override
    public int getTaskNumber() {
        return 10;
    }

    @Override
    public int getNumberOfInputLines() {
        return 1;
    }

    /*
     * This method calculates gcd use Euclidean algorithm.
     *
     * Time complexity: O(log(n)) where n is the biggest number of the arguments.
     *
     * @param a.
     * @param b.
     *
     * @return gcd.
     */
    private int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a%b);
    }

    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int a, b;
        try{
            a = scan.nextInt();
            b = scan.nextInt();
        }catch (Exception e){
            return "Input is incorrect";
        }
        return String.valueOf(gcd(a, b));
    }
}
