package observer2;

import java.util.Observable;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer observerA = new ObserverA(subject);
        Observer observerB = new ObserverB(subject);
        subject.setData("가나다");
        subject.setData("ABC");


    }
}
