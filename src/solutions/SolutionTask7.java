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

    private static String recReadLazyPrint(int n) throws Exception {
        if(n == 1)return String.valueOf(scan.nextInt());
        int r = scan.nextInt();
        return recReadLazyPrint(n - 1) + " " + r;
    }

    @Override
    public String execute(String arguments) {
        scan = new Scanner(arguments);
        int n;
        try{
            n = scan.nextInt();
            return recReadLazyPrint(n);
        }catch (Exception ignored){
            return "Input is incorrect";
        }
    }
}
