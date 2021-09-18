package observer;

public class ObserverMain {
    public static void main(String[] args) {
        // Create subscribers
        JobSeeker john = new JobSeeker("John Doe");
        JobSeeker jane = new JobSeeker("Jane Doe");
        // Create publisher and add subscribers
        EmploymentAgency employmentAgency = new EmploymentAgency();
        employmentAgency.addObserver(john);
        employmentAgency.addObserver(jane);
        // Add a new job and see if subscribers get notified
        employmentAgency.notifyObservers(new JobPost("Software Engineer"));
        // Output
        // Hi John Doe! New job posted: Software Engineer
        // Hi Jane Doe! New job posted: Software Engineer
    }
}
