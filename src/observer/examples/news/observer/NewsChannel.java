package observer.examples.news.observer;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object o) {
        news = (String) o;
        display();
    }

    void display() {
        System.out.println(news);
    }
}
