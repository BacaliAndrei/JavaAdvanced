package DesignPatterns._6_Comander;

public class SaveFileOperation implements TextFileOperation{
    private TextFile textFile;

    public SaveFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }



    @Override
    public String execute() {
        return textFile.save();
    }
}
