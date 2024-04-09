package solutions;

import java.util.Scanner;

public class SolutionTask7 implements SolutionInterface{

    private static Scanner scan;

    @Override
    public String getParametersDescription() {
        return "Enter n. Then enter n numbers on the second line.";
    }

    @Override
    public int getTaskNumber() {
        return 7;
    }

    @Override
    public int getNumberOfInputLines() {
        return 2;
    }

    /*
     * This is a method that prints list in back order using recursion.
     *
     * Time complexity: O(n)
     *
     * @param n is the number of integers remaining to be read.
     *
     * @return String numbers of the list in back order.
     */
    private static String recReadLazyLog(int n) throws Exception {
        if(n == 1)return String.valueOf(scan.nextInt());
        int r = scan.nextInt();
        return recReadLazyLog(n - 1) + " " + r;
    }

    @Override
    public String execute(String arguments) {
        scan = new Scanner(arguments);
        int n;
        try{
            n = scan.nextInt();
            return recReadLazyLog(n);
        }catch (Exception ignored){
            return "Input is incorrect";
        }
    }
}
