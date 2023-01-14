package DesignPatterns._9_Template;

public class FotballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football game has been initialized .");
    }

    @Override
    void startPlay() {
        System.out.println("Football game has been started .");

    }

    @Override
    void endPlay() {
        System.out.println("Football game has been ended .");

    }
}
