package observer;

public class ObserverB implements Observer {

    public ObserverB(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(int a, int b) {
        System.out.println("ObserverB : a->" + a + " b->" + b);
    }
}
