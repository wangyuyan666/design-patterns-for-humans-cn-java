package visitor.animal;

import visitor.AnimalOperation;

public interface Animal {
    void accept(AnimalOperation operation);
}
