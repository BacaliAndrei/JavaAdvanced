package DesignPatterns._8_Observer;

public class SportsChannel implements Channel {
    private String sportNews;

    @Override
    public void update(String s) {
        this.sportNews = s;
    }

    public String getSportNews() {
        return sportNews;
    }

    public void setSportNews(String sportNews) {
        this.sportNews = sportNews;
    }
}
