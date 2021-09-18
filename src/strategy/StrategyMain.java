package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        int[] dataset = {1, 5, 4, 3, 2, 8};

        Sorter sorter = new Sorter(new BubbleSortStrategy()); // Output : Sorting using bubble sort
        sorter.sort(dataset);

        sorter = new Sorter(new QuickSortStrategy()); // Output : Sorting using quick sort
        sorter.sort(dataset);
    }
}
