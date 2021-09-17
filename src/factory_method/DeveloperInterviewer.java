package factory_method;

public class DeveloperInterviewer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about design patterns!");
    }
}
