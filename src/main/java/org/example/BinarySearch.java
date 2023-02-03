package org.example;

import java.util.Arrays;

class BinarySearch {
    public int binarySearch(int[] arr, int digit) {
        Arrays.sort(arr);
        int start = 0;
        int finish = arr.length - 1;
        int mid;
        while (start <= finish) {
            mid = (start + finish) / 2;
            if (arr[mid] == digit)
                return digit;
            if (arr[mid] > digit)
                finish = mid - 1;
            if (arr[mid] < digit)
                start = mid + 1;
        }
        return -1;
    }
}