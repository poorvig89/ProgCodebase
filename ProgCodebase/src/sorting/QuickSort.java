package sorting;

public class QuickSort {
    private Integer[] input;

    QuickSort(Integer[] input) {
        this.input = input;
    }

    public void sort (int startIndex, int endIndex){

        int pivot = startIndex + (endIndex - startIndex) / 2;
        int p = quickSort(startIndex, pivot, endIndex);

        if(startIndex < p-1)
            sort(startIndex, p - 1);

        if(p < endIndex)
            sort(p, endIndex);

    }

    public int quickSort(int startIndex, int pivot,  int endIndex) {
        int i = startIndex;
        int j = endIndex;
        while (i<=j){
            while (input[i]<input[pivot])
                i++;

            while (input[j] > input[pivot])
                j--;

            if(i<=j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private void swap(int i , int j) {
        Integer temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
