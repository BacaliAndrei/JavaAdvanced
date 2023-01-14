package DesignPatterns._1_EagerSingleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton e1=EagerSingleton.getInstance();
        EagerSingleton e2=EagerSingleton.getInstance();
        EagerSingleton e3=EagerSingleton.getInstance();
        EagerSingleton e4=EagerSingleton.getInstance();

        LazySingleton f1=LazySingleton.getInstance();
        LazySingleton f2=LazySingleton.getInstance();
        LazySingleton f3=LazySingleton.getInstance();
        LazySingleton f4=LazySingleton.getInstance();
    }
}
