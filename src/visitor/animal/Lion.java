package visitor.animal;

import visitor.AnimalOperation;

public class Lion implements Animal {
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitLion(this);
    }

    public void roar() {
        System.out.println("Roaaar!");
    }
}
