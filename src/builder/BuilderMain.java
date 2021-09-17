package builder;

public class BuilderMain {
    public static void main(String[] args) {
        Burger burger = new BurgerBuilder()
                .setSize(100)
                .setCheese(true)
                .setTomato(true)
                .setPepperoni(false)
                .build();
    }
}
