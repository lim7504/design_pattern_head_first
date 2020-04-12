package observer2;

import java.util.Observable;

public class Subject extends Observable {

    String str;

    public void setData(String str) {
        this.str = str;
        setChanged();
        notifyObservers(str);
    }

}
