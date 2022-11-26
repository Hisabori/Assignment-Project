package com.kh.Assignment.Nov_24_2022.Merge_Sort;

public class Merge_Sort {
        public static void sort(int[] arr, int left, int right) {
            mergeSort(arr, left, right);
        }

        private static void mergeSort(int[] arr, int left, int right) {
            int mid = 0;
            if (left < right) {
                mid = (left + right) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        private static void merge(int[] arr, int left, int mid, int right) {
            int leftIndex = left;
            int rightIndex = mid + 1;
            int sortedIndex = left;
            int[] tmpSortedArray = new int[right + 1];


            while(leftIndex <= mid && rightIndex <= right) {
                // 오름차순 조건문
                if (arr[leftIndex] <= arr[rightIndex]) {
                    tmpSortedArray[sortedIndex++] = arr[leftIndex++];
                }
                else {
                    tmpSortedArray[sortedIndex++] = arr[rightIndex++];
                }
            }

            if (leftIndex > mid) {
                for(int i=rightIndex; i<=right; i++) {
                    tmpSortedArray[sortedIndex++] = arr[i];
                }
            }
            else {
                for(int i=leftIndex; i<=mid; i++) {
                    tmpSortedArray[sortedIndex++] = arr[i];
                }
            }

            for(int i=left; i<=right; i++) {
                arr[i] = tmpSortedArray[i];
            }
        }
    }

