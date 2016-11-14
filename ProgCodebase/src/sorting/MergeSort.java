package sorting;

public class MergeSort {

    private Integer[] input;

    MergeSort(Integer[] input) {
        this.input = input;
    }

    public void sort(int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int mid = startIndex + (endIndex - startIndex)/2;
            sort(startIndex, mid);
            sort(mid + 1, endIndex);
            merge(startIndex, mid, endIndex);
        }
    }

    private void merge(int startIndex, int mid, int endIndex) {
        Integer sortedArray[] = new Integer[endIndex-startIndex+1];

        int i = startIndex, j = mid+1, k=0;
        while(i<=mid && j<=endIndex) {
            if(input[i]<input[j]) {
                sortedArray[k++] = input[i++];
            } else {
                sortedArray[k++] = input[j++];
            }
        }

        while(i<=mid)
            sortedArray[k++] = input[i++];

        while(j<=endIndex)
            sortedArray[k++] = input[j++];

        for(int m = startIndex,n=0; m<=endIndex; m++) {
            input[m]=sortedArray[n++];
        }
    }
}
