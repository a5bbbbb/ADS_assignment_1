package solutions;

public interface SolutionInterface {
    String getParametersDescription();
    int getTaskNumber();
    int getNumberOfInputLines();
    String execute(String arguments);
}
