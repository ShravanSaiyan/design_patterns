package observer.examples.news.subject;

import observer.examples.news.observer.Channel;

public interface Subject {
    public void addObserver(Channel channel);
    public void removeObserver(Channel channel);

    public void update(Object o);
}
