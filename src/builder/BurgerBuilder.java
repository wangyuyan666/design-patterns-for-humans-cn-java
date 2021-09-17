package builder;

public class BurgerBuilder {

    protected int size;
    protected boolean cheese;
    protected boolean pepperoni;
    protected boolean lettuce;
    protected boolean tomato;

    public BurgerBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public BurgerBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public BurgerBuilder setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public BurgerBuilder setTomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
