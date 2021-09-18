package state;

public class LowerCase implements WritingState {
    @Override
    public void write(String word) {
        System.out.println(word.toLowerCase());
    }
}
