package solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class SolutionTask9 implements SolutionInterface{
    public SolutionTask9() {
        calculated = new ArrayList<>();
    }

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

    private static ArrayList<ArrayList<Long>> calculated;

    /*
     * This method calculates combinations using recursion with memorization of calculated values.
     *
     * Time complexity: due to memorization O(n*k)
     *
     * @param n.
     * @param k.
     *
     * @return number of combinations.
     */
    private long c(int n, int k){

        if (k == 0 || k == n)return 1;

        if(calculated.size() < n)calculated.add(new ArrayList<>());

        if(calculated.get(n-1).size() < k)

            calculated.get(n-1).add(0L);

        if(calculated.get(n-1).get(k-1) == 0)

            calculated.get(n-1).set(k-1, c(n - 1, k) + c(n - 1, k - 1));

        return calculated.get(n-1).get(k-1);

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
