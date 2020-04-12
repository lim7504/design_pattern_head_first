package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {

    List<Observer> observerList;

    private int a;
    private int b;

    public Subject() {
        observerList = new ArrayList<>();
    }

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;
        notified();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notified() {
        for (Observer observer : observerList) {
            observer.update(a,b);
        }
    }
}
