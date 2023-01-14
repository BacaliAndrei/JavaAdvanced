package DesignPatterns._8_Observer;

public class NewsChannel implements Channel{
    private String news;
    @Override
    public void update(String s) {
    this.news= s;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
