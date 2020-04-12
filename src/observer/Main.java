package observer;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        ObserverA observerA = new ObserverA(subject);
        ObserverB observerB = new ObserverB(subject);
        subject.setData(1,2);
        subject.setData(11,21);

    }
}
