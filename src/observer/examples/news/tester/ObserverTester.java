package observer.examples.news.tester;

import observer.examples.news.observer.Channel;
import observer.examples.news.observer.NewsChannel;
import observer.examples.news.subject.NewsAgency;
import observer.examples.news.subject.Subject;

public class ObserverTester {
    public static void main(String[] args) {
        Subject subject = new NewsAgency();
        Channel channel = new NewsChannel();

        subject.addObserver(channel);
        subject.update("Updated news");

    }
}
