package Sorting.SelectionSort;

class Main {
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort(5);
        ss.takeInput();
        ss.selectionSort();
        ss.display();
    }
}
