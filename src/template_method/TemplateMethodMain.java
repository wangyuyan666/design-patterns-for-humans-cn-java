package template_method;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Builder builder = new AndroidBuilder();
        builder.build();
        // Output:
        // Running android tests
        // Linting the android code
        // Assembling the android build
        // Deploying android build to server
        builder = new IOSBuilder();
        builder.build();

        // Output:
        // Running ios tests
        // Linting the ios code
        // Assembling the ios build
        // Deploying ios build to server
    }
}
