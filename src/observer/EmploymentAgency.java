package observer;

import java.util.Observable;

public class EmploymentAgency extends Observable {

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
}
