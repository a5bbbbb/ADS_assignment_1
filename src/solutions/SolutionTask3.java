package solutions;

import java.util.Scanner;

public class SolutionTask3 implements SolutionInterface {
    @Override
    public String getParametersDescription() {
        return "Enter a single number n.";
    }

    @Override
    public int getTaskNumber() {
        return 3;
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
        boolean prime = true;
        for(int i = 2; i * i <= n; i++)
            if (n % i == 0) {
                prime = false;
                break;
            }
        return prime ? "Prime" : "Composite";
    }
}
