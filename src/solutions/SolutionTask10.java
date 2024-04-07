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
