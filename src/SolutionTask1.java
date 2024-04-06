import java.util.Scanner;

public class SolutionTask1 implements SolutionInterface{

    private Scanner scan;

    @Override
    public String getParametersDescription() {
        return "Enter n on first line. Then enter n numbers on second line.";
    }

    @Override
    public int getTaskNumber() {
        return 1;
    }

    @Override
    public int getNumberOfLines() {
        return 2;
    }

    @Override
    public String execute(String arguments) {
        scan = new Scanner(arguments);
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
