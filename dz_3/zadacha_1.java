//1.(Дополнительно) Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class zadacha_1 {
    public static void mergeSort(int[] arrA, int n) {
        if (n < 2) {
            return;
        }
        int midl = n / 2;
        int[] arrLeft = new int[midl];
        int[] arrRight = new int[n - midl];
    
        for (int i = 0; i < midl; i++) {
            arrLeft[i] = arrA[i];
        }
        for (int i = midl; i < n; i++) {
            arrRight[i - midl] = arrA[i];
        }
        mergeSort(arrLeft, midl);
        mergeSort(arrRight, n - midl);
    
        merge(arrA, arrLeft, arrRight, midl, n - midl);
    }

    public static void merge(int[] arrA, int[] arrLeft, int[] arrRight, int left, int right) { 
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (arrLeft[i] <= arrRight[j]) {
            arrA[k++] = arrLeft[i++];
        }
        else {
            arrA[k++] = arrRight[j++];
        }
    }
    while (i < left) {
        arrA[k++] = arrLeft[i++];
    }
    while (j < right) {
        arrA[k++] = arrRight[j++];
    }
}
        
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 1, 8, 5, 3, 2, 7, 6}; 
        System.out.println(Arrays.toString(arr));
        zadacha_1.mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));       
        
    }
}
