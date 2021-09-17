package builder;

public class Burger {

    private final int size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean lettuce;
    private final boolean tomato;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }
}
