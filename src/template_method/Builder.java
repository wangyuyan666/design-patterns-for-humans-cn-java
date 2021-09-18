package template_method;

public abstract class Builder {
    final public void build() {
        test();
        lint();
        assemble();
        deploy();
    }

    abstract public void test();

    abstract public void lint();

    abstract public void assemble();

    abstract public void deploy();
}
