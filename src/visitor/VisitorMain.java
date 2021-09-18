package visitor;

import visitor.animal.Dolphin;
import visitor.animal.Lion;
import visitor.animal.Monkey;

public class VisitorMain {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Dolphin dolphin = new Dolphin();

        Speak speak = new Speak();

        monkey.accept(speak); // Ooh oo aa aa!
        lion.accept(speak);   // Roaaar!
        dolphin.accept(speak);// Tuut tutt tuutt!
    }
}
