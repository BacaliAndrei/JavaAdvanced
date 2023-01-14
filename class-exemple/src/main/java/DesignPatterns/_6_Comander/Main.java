package DesignPatterns._6_Comander;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor executor=new TextFileOperationExecutor();

        System.out.println(executor.executeAction(new OpenFileOperation(new TextFile("file1.txt"))));
        System.out.println( executor.executeAction(new SaveFileOperation(new TextFile("file1.txt"))));

    }
}
