package observer.examples.news.subject;


import observer.examples.news.observer.Channel;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private final List<Channel> channels = new ArrayList<>();

    public void update(Object o) {

        for (Channel channel : channels) {
            channel.update(o);
        }
    }

    public void addObserver(Channel channel) {
        channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        channels.remove(channel);
    }
}
