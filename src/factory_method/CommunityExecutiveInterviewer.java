package factory_method;

public class CommunityExecutiveInterviewer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Asking about community building");
    }
}
