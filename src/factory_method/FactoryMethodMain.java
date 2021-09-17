package factory_method;

public class FactoryMethodMain {


    public static void main(String[] args) {

        DevelopmentManager developmentManager = new DevelopmentManager();
        developmentManager.takeInterview();// Output: Asking about design patterns

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();// Output: Asking about community building.
    }

}
