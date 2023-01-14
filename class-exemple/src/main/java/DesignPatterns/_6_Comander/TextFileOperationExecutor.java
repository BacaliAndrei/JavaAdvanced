package DesignPatterns._6_Comander;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeAction(TextFileOperation operation) {

        textFileOperations.add(operation);
        return operation.execute();

    }



}
