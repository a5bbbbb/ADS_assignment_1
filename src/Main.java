
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
                new SolutionTask5(),
                new SolutionTask6(),
                new SolutionTask7(),
                new SolutionTask8(),
                new SolutionTask9(),
                new SolutionTask10()
            )
    );

    private static void printHello(){
        System.out.println("""
                Hello!
                This is an application made to test the solutions to assignment 1.
                """);
    }

    /*
    * This is just a linear search through the list of solutions.
    *
    * Time complexity: O(solutions.length())
    *
    * @param taskNumber number of the task required to be found.
    *
    * @return SolutionInterface a solution with corresponding task number.
     */
    private static SolutionInterface getSolution(int taskNumber) throws Exception {

        for (SolutionInterface solution : solutions)

            if (solution.getTaskNumber() == taskNumber)

                return solution;

        throw new Exception("No task with number " + taskNumber + " found.");
    }

    /*
    * This method reads certain number of line from console, and returns them as a single String object.
    *
    * Time complexity: O(numberOfLines)
    *
    * @param numberOfLines numbers of line that needs to be read from the console.
    *
    * @return String object containing concatenation of read lines.
     */
    private static String readArguments(int numberOfLines){

        System.out.println("Enter input (" + numberOfLines + " lines):");

        StringBuilder total = new StringBuilder();

        for(int i = 0; i < numberOfLines + 1; i++){

            total.append(' ').append(scan.nextLine());

        }

        return total.toString();
    }

    private static int askTaskNumber(){

        System.out.print("""
                Please enter number of a task that you wish to test:""");

        return scan.nextInt();
    }

    /*
    * executeSolution
    *
    * Executes the solution with corresponding task number.
    *
    * @param taskNumber number of the task for which solution is expected to be executed.
     */
    private static void executeSolution(int taskNumber){

        SolutionInterface solution;

        try {

            solution = getSolution(taskNumber);

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return;

        }

        System.out.println(solution.getParametersDescription());

        String arguments = readArguments(solution.getNumberOfInputLines());

        // Save time before execution.

        long time1 = System.currentTimeMillis();

        String response = solution.execute(arguments);

        // Save time after execution

        long time2 = System.currentTimeMillis();

        System.out.println("Output:");

        System.out.println(response);

        // Ascertain time spend by execution of the solution

        System.out.println("Execution time: " + (time2 - time1) + " ms.");

    }

    private static boolean askContinue(){
        System.out.println("Do you wish to continue testing solutions? y/n");
        String ans = scan.nextLine();
        return Objects.equals(ans, "y");
    }

    private static void runApplication(){
        printHello();

        do {

            executeSolution(askTaskNumber());

        }while(askContinue());

    }

    public static void main(String[] args) {
        runApplication();
    }
}
