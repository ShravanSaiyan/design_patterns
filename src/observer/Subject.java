package observer;


public interface Subject {
    void addObservers(Observer observer);

    void removeObservers(Observer observer);

    void notifyObservers();
}
