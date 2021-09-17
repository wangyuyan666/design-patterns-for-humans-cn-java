package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee someCoffee = new SimpleCoffee();
        System.out.println(someCoffee.getCost()); // 10
        System.out.println(someCoffee.getDescription()); // Simple Coffee

        someCoffee = new MilkCoffee(someCoffee);
        System.out.println(someCoffee.getCost()); // 12
        System.out.println(someCoffee.getDescription()); // Simple Coffee, milk

        someCoffee = new WhipCoffee(someCoffee);
        System.out.println(someCoffee.getCost()); // 17
        System.out.println(someCoffee.getDescription()); // Simple Coffee, milk, whip

        someCoffee = new VanillaCoffee(someCoffee);
        System.out.println(someCoffee.getCost()); // 20
        System.out.println(someCoffee.getDescription()); // Simple Coffee, milk, whip, vanilla
    }
}
