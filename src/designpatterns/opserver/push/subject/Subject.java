package designpatterns.opserver.push.subject;

import designpatterns.opserver.push.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
