package observer;

public class ObserverA implements Observer {

    public ObserverA(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(int a, int b) {
        System.out.println("ObserverA : a->" + a + " b->" + b);
    }
}
