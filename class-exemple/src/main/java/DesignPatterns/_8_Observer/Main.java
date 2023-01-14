package DesignPatterns._8_Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        SportsChannel channel2 = new SportsChannel();

        observable.addObserver(channel1);
        observable.addObserver(channel2);
        observable.setNews("Noua stire");
        System.out.println("Channel1 "+channel1.getNews());
        System.out.println("Channel2 "+channel2.getSportNews());
    }
}
