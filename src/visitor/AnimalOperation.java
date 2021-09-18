package visitor;

import visitor.animal.Dolphin;
import visitor.animal.Lion;
import visitor.animal.Monkey;

public interface AnimalOperation {
    void visitMonkey(Monkey monkey);

    void visitLion(Lion lion);

    void visitDolphin(Dolphin dolphin);
}
