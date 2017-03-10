//package sorting;
//
//import java.util.ArrayList;
//
//public class Temp {
//
//    private static int total;
//
//    private static void swap(final Comparable[] arr, final int a, final int b)
//    {
//        Comparable tmp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = tmp;
//    }
//
//    private static void heapify(final Comparable[] arr, final int i)
//    {
//        int lft = i * 2;
//        int rgt = lft + 1;
//        int grt = i;
//
//        if (lft <= total && arr[lft].compareTo(arr[grt]) > 0) grt = lft;
//        if (rgt <= total && arr[rgt].compareTo(arr[grt]) > 0) grt = rgt;
//        if (grt != i) {
//            swap(arr, i, grt);
//            heapify(arr, grt);
//        }
//    }
//
//    public static void sort(final Comparable[] arr)
//    {
//        total = arr.length - 1;
//
//        for (int i = total / 2; i >= 0; i--)
//            heapify(arr, i);
//
//        for (int i = total; i > 0; i--) {
//            swap(arr, 0, i);
//            total--;
//            heapify(arr, 0);
//        }
//    }
//
//
//
//    public static void main(final String[] args)
//    {
//        Integer[] arr = new Integer[] { 3, 2, 1, 5, 4 };
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(2);
//        list.add(4);
//        list.add(5);
//        System.out.println(java.util.Arrays.toString(arr));
//        sort(arr);
//        System.out.println(java.util.Arrays.toString(arr));
//        sort(list);
//    }
//
//}