package solutions;

import java.util.Scanner;

public class SolutionTask1 implements SolutionInterface{

    @Override
    public String getParametersDescription() {
        return "Enter n on first line. Then enter n numbers on second line.";
    }

    @Override
    public int getTaskNumber() {
        return 1;
    }

    @Override
    public int getNumberOfInputLines() {
        return 2;
    }
    /*
     * This is a method that finds a minimum value in a list.
     *
     * Time complexity: O(n)
     *
     * @param arguments string that contains 'n' and 'n' integers.
     *
     * @return String minimum value given in the list.
     */
    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        int n, min = Integer.MAX_VALUE;
        try{
            n = scan.nextInt();
            for(int i = 0; i < n; i++){
                int t = scan.nextInt();
                if(min > t)min = t;
            }
        }catch (Exception ignored){
            return "Input is incorrect";
        }
        return String.valueOf(min);
    }

}
