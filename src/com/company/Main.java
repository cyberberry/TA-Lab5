package com.company;
public class Main {
    public static void main(String[] args) {

        double[] arr100k = new double[100000];
        double[] arr100k2 = new double[100000];
        double[] arr1m = new double[1000000];
        double[] arr1m2 = new double[1000000];


        for(int i = 0; i < 100000;i++) {
            arr100k[i] = Math.random();
        }

        for(int i = 0; i < 1000000;i++) {
            arr1m[i] = Math.random();
        }

        for(int i = 0; i < 100000;i++) { ;
            arr100k2[i] = i+1;
        }

        for(int i = 0; i < 1000000;i++) { ;
            arr1m2[i] = i+1;
        }


        //sorting

        long before100k = System.nanoTime();
        new QuickSort().quickSort(arr100k.clone(),0,99999);
        long after100k = System.nanoTime();
        System.out.println("Quick sort 100k random elements: " + (after100k - before100k) + " нс.");

        long before1m = System.nanoTime();
        new QuickSort().quickSort(arr1m.clone(),0,999999);
        long after1m = System.nanoTime();
        System.out.println("Quick sort 1 million random elements: " + (after1m - before1m) + " нс.");

        long before100k2 = System.nanoTime();
        new QuickSort().quickSort(arr100k2.clone(),0,99999);
        long after100k2 = System.nanoTime();
        System.out.println("\nQuick sort 100k successive elements: " + (after100k2 - before100k2) + " нс.");

        long before1m2 = System.nanoTime();
        new QuickSort().quickSort(arr1m2.clone(),0,999999);
        long after1m2 = System.nanoTime();
        System.out.println("Quick sort 1 million successive elements: " + (after1m2 - before1m2) + " нс.");

        System.out.println("-----------------------------------------");

        long before100kMS = System.nanoTime();
        new MergeSort().sort(arr100k.clone(),0,99999);
        long after100kMS = System.nanoTime();
        System.out.println("Merge sort 100k random elements: " + (after100kMS - before100kMS) + " нс.");

        long before1mMS = System.nanoTime();
        new MergeSort().sort(arr1m.clone(),0,999999);
        long after1mMS = System.nanoTime();
        System.out.println("Merge sort 1 million random elements: " + (after1mMS - before1mMS) + " нс.");

        long before100k2MS = System.nanoTime();
        new MergeSort().sort(arr100k2.clone(),0,99999);
        long after100k2MS = System.nanoTime();
        System.out.println("\nMerge sort 100k successive elements: " + (after100k2MS - before100k2MS) + " нс.");

        long before1m2MS = System.nanoTime();
        new MergeSort().sort(arr1m2.clone(),0,99999);
        long after1m2MS = System.nanoTime();
        System.out.println("Merge sort 1 million successive elements: " + (after1m2MS - before1m2MS) + " нс.");

        System.out.println("-----------------------------------------");

        long before100kSS = System.nanoTime();
        new ShellSort().shellsort(arr100k.clone());
        long after100kSS = System.nanoTime();
        System.out.println("Shell sort 100k random elements: " + (after100kSS - before100kSS) + " нс.");

        long before1mSS = System.nanoTime();
        new ShellSort().shellsort(arr1m.clone());
        long after1mSS = System.nanoTime();
        System.out.println("Shell sort 1 million random elements: " + (after1mSS - before1mSS) + " нс.");

        long before100k2SS = System.nanoTime();
        new ShellSort().shellsort(arr100k2.clone());
        long after100k2SS = System.nanoTime();
        System.out.println("\nShell sort 100k successive elements: " + (after100k2SS - before100k2SS) + " нс.");

        long before1m2SS = System.nanoTime();
        new ShellSort().shellsort(arr1m2.clone());
        long after1m2SS = System.nanoTime();
        System.out.println("Shell sort 1 million successive elements: " + (after1m2SS - before1m2SS) + " нс.");

        System.out.println("-----------------------------------------");

        long before100kHS = System.nanoTime();
        new HeapSort().heapSort(arr100k.clone());
        long after100kHS = System.nanoTime();
        System.out.println("Heap sort 100k random elements: " + (after100kHS - before100kHS) + " нс.");

        long before1mHS = System.nanoTime();
        new HeapSort().heapSort(arr1m.clone());
        long after1mHS = System.nanoTime();
        System.out.println("Heap sort 1 million random elements: " + (after1mHS - before1mHS) + " нс.");

        long before100k2HS = System.nanoTime();
        new HeapSort().heapSort(arr100k2.clone());
        long after100k2HS = System.nanoTime();
        System.out.println("\nHeap sort 100k successive elements: " + (after100k2HS - before100k2HS) + " нс.");

        long before1m2HS = System.nanoTime();
        new HeapSort().heapSort(arr1m2.clone());
        long after1m2HS = System.nanoTime();
        System.out.println("Heap sort 1 million successive elements: " + (after1m2HS - before1m2HS) + " нс.");

        System.out.println("-----------------------------------------");



    }
}