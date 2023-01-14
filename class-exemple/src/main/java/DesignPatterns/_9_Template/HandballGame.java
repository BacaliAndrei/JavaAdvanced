package DesignPatterns._9_Template;

public class HandballGame extends Game{
    @Override
    void initialize() {
        System.out.println("Handball game has been initialized .");
    }

    @Override
    void startPlay() {
        System.out.println("Handball game has been started .");
    }

    @Override
    void endPlay() {
        System.out.println("Handball game has been ended .");
    }
}
