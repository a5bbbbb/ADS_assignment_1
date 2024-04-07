
import solutions.*;

import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    private static final ArrayList<SolutionInterface> solutions = new ArrayList<>(
        Arrays.asList(
                new SolutionTask1(),
                new SolutionTask2(),
                new SolutionTask3(),
                new SolutionTask4(),
                new SolutionTask5()
            )
    );

    private static void printHello(){
        System.out.println("""
                Hello!
                This is an application made to test the solutions to assignment 1.
                """);
    }

    private static SolutionInterface getSolution(int taskNumber) throws Exception {

        for (SolutionInterface solution : solutions)

            if (solution.getTaskNumber() == taskNumber)

                return solution;

        throw new Exception("No task with number " + taskNumber + " found.");
    }

    private static String readArguments(int numberOfLines){
        System.out.println("Enter input (" + numberOfLines + " lines):");
        StringBuilder total = new StringBuilder();
        for(int i = 0; i < numberOfLines + 1; i++){
            total.append(' ');
            total.append(scan.nextLine());
        }
        return total.toString();
    }

    private static void executeSolution(){
        System.out.print("""
                Please enter number of a task that you wish to test:""");

        int taskNumber = scan.nextInt();
        SolutionInterface solution;
        try {
            solution = getSolution(taskNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(solution.getParametersDescription());
        String response = solution.execute(readArguments(solution.getNumberOfInputLines()));
        System.out.println("Output:");
        System.out.println(response);
    }

    public static void main(String[] args) {
        printHello();
        executeSolution();
    }
}
