package visitor.animal;

import visitor.AnimalOperation;

public class Monkey implements Animal {
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }

    public void shout() {
        System.out.println("Ooh oo aa aa!");
    }
}
