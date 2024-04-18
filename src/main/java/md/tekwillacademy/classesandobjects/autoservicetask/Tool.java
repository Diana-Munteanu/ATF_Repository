package md.tekwillacademy.classesandobjects.autoservicetask;

public class Tool {
    String nameOfTheTool;
    String material;

    public Tool(String enteredNameOfTool) {
        nameOfTheTool = enteredNameOfTool;
        System.out.println("The constructor with 1 param was used and material is still null");
    }
}
