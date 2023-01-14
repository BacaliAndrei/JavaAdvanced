package DesignPatterns._9_Template;

public class Main {
    public static void main(String[] args) {
        Game game =new FotballGame();
        game.play();
        Game game1=new HandballGame();
        game1.play();
    }
}
