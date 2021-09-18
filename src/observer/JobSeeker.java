package observer;

import java.util.Observable;
import java.util.Observer;

public class JobSeeker implements Observer {

    private final String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        // Do something with the job posting
        if (arg instanceof JobPost) {
            System.out.println("Hi " + name + "! New job posted: " + ((JobPost) arg).getTitle());
        }
    }
}
