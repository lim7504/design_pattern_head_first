package observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

    public ObserverA(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        String str = (String) o;
        System.out.println("ObserverA : " + str);
    }
}
