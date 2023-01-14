package DesignPatterns._5_Proxy;

public class ExpensiveObjetImpl implements ExpensiveObject {
    public ExpensiveObjetImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processing complete.");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration");
    }

}
