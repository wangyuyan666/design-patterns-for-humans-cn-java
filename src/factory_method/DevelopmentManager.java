package factory_method;

public class DevelopmentManager extends HiringManager {
    @Override
    protected Interviewer makeInterviewer() {
        return new DeveloperInterviewer();
    }
}
