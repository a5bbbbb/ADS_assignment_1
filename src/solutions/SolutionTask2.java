package solutions;

import java.util.Scanner;

public class SolutionTask2 implements SolutionInterface{

    @Override
    public String getParametersDescription() {
        return "Enter n on first line. Then enter n numbers on second line.";
    }

    @Override
    public int getTaskNumber() {
        return 2;
    }

    @Override
    public int getNumberOfInputLines() {
        return 2;
    }

    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int n, sum = 0;
        try{
            n = scan.nextInt();
            for(int i = 0; i < n; i++){
                int t = scan.nextInt();
                sum += t;
            }
        }catch (Exception ignored){
            return "Input is incorrect";
        }
        double average = (double) sum / n;
        return String.valueOf(average);
    }
}
