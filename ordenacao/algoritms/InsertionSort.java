package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        //TODO Implementar
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
