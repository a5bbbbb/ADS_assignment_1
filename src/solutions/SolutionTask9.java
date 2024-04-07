package solutions;

import java.util.Scanner;

public class SolutionTask9 implements SolutionInterface{
    @Override
    public String getParametersDescription() {
        return "Enter two number 'n' and 'k'.";
    }

    @Override
    public int getTaskNumber() {
        return 9;
    }

    @Override
    public int getNumberOfInputLines() {
        return 1;
    }

    private long c(int n, int k){
        if (k == 0 || k == n)return 1;
        return c(n - 1, k) + c(n - 1, k - 1);
    }

    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int n, k;
        try{
            n = scan.nextInt();
            k = scan.nextInt();
        }catch(Exception e){
            return "Input is incorrect.";
        }
        return String.valueOf(c(n, k));
    }
}
