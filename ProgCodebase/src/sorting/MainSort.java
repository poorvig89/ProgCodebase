package sorting;

import common.Util;

import java.io.IOException;

public class MainSort {
    public static void main(String args[]) throws IOException {
        Integer[] unsortedArray = {100, 50, 70, 10, 40, 30, 20, 90, 60, 80};

//        MergeSort mergeSort = new MergeSort(unsortedArray);
//        mergeSort.sort(0, unsortedArray.length - 1);
//        Util.printArray(unsortedArray);

        QuickSort quickSort = new QuickSort(unsortedArray);
        quickSort.sort(0, unsortedArray.length - 1);
        Util.printArray(unsortedArray);
    }
}
