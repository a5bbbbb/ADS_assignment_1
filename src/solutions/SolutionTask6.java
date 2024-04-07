package solutions;

import java.util.Scanner;

public class SolutionTask6 implements SolutionInterface{
    @Override
    public String getParametersDescription() {
        return "Two numbers 'a' and 'n'.";
    }

    @Override
    public int getTaskNumber() {
        return 6;
    }

    @Override
    public int getNumberOfInputLines() {
        return 1;
    }

    private long calcPowerRec(int a, int n){

        if (n == 0) return 1;

        return calcPowerRec(a, n-1) * a;
    }

    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int n, a;
        try{
            a = scan.nextInt();
            n = scan.nextInt();
        }catch (Exception ignored){
            return "Input is incorrect";
        }
        return String.valueOf(calcPowerRec(a, n));
    }
}
