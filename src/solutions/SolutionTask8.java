package solutions;

import java.util.Scanner;

public class SolutionTask8 implements SolutionInterface{
    @Override
    public String getParametersDescription() {
        return "Input a single string without spaces.";
    }

    @Override
    public int getTaskNumber() {
        return 8;
    }

    @Override
    public int getNumberOfInputLines() {
        return 1;
    }

    /*
     * This method checks that all symbols in the string are digits using recursion.
     *
     * Time complexity: O(n)
     *
     * @param string that is checked.
     * @param index of the symbol that is checked.
     *
     * @return boolean true if all symbols in the string are digits.
     */
    private boolean isAllDigits(String s, int i){
        if(i == s.length())return true;
        return Character.isDigit(s.charAt(i)) && isAllDigits(s, i + 1);
    }

    /*
     * This is a convenience method that calls isAllDigits(s, 0).
     *
     * @param string that is checked.
     *
     * @return boolean true if all symbols in the string are digits.
     */
    private boolean isAllDigits(String s){
        return isAllDigits(s, 0);
    }

    @Override
    public String execute(String arguments) {
        Scanner scan = new Scanner(arguments);
        String s;
        try{
            s = scan.nextLine().strip();
            if(s.isEmpty())
                throw new Exception();
        }catch (Exception ignored){
            return "Input is incorrect";
        }
        return isAllDigits(s) ? "Yes" : "No";
    }
}
