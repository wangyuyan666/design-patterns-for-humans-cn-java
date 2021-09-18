package state;

public class DefaultText implements WritingState {
    @Override
    public void write(String word) {
        System.out.println(word);
    }
}
