package algorithms;

public class SelectionSort {
    public int[] selectionSort(int[] arr) {
       int min_index=0;
        int temp=0;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min_index]>arr[j]) {
                    min_index=j;
                }
            }
            temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
