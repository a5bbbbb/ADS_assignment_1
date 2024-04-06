public interface SolutionInterface {
    String getParametersDescription();
    int getTaskNumber();
    int getNumberOfLines();
    String execute(String arguments);
}
