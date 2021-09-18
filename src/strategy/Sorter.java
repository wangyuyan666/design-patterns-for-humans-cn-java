package strategy;

public class Sorter {

    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] array) {
        return sortStrategy.sort(array);
    }
}
