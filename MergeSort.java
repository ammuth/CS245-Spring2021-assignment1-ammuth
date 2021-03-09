import java.util.Random;

public class MergeSort {
    public static void mergeSort(double[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        double[] l = new double[mid];
        double[] r = new double[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);

    }



    public static void merge(double[] a, double[] l, double[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main(String[] args) {

        Random rd = new Random();
        double[] nums = new double[50000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt();
            // System.out.println(nums[i]);
        }
        long start = System.currentTimeMillis();
        mergeSort(nums, nums.length);
        long finish = System.currentTimeMillis();
        long currentTimeMillis = finish - start;
        System.out.println("Array sorted through merge sort with 50K: ");
        System.out.println("The run time is: " + currentTimeMillis);


//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_100K = new double[100000];
        for (int i = 0; i < nums_of_100K.length; i++) {
            nums_of_100K[i] = rd.nextInt();
        }
        long start_of_100k= System.currentTimeMillis();

        mergeSort( nums_of_100K, nums_of_100K.length);
        long finish_of_100k =System.currentTimeMillis();
        long currentTimeMillis_of_100k =finish_of_100k-start_of_100k;
        System.out.println("Array sorted through merge sort with 100K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_100k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_150K = new double[150000];
        for (int i = 0; i < nums_of_150K.length; i++) {
            nums_of_150K[i] = rd.nextInt();
        }
        long start_of_150k= System.currentTimeMillis();

        mergeSort( nums_of_150K, nums_of_150K.length);
        long finish_of_150k =System.currentTimeMillis();
        long currentTimeMillis_of_150k =finish_of_150k-start_of_150k;
        System.out.println("Array sorted through merge sort with 150K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_150k);

//
//        ////////////////////////////////////////////////////////////
        double [] nums_of_200K = new double[200000];
        for (int i = 0; i < nums_of_200K.length; i++) {
            nums_of_200K[i] = rd.nextInt();
        }
        long start_of_200k= System.currentTimeMillis();

        mergeSort( nums_of_200K, nums_of_200K.length);
        long finish_of_200k =System.currentTimeMillis();
        long currentTimeMillis_of_200k =finish_of_200k-start_of_200k;
        System.out.println("Array sorted through merge sort with 200K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_200k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_250K = new double[250000];
        for (int i = 0; i < nums_of_250K.length; i++) {
            nums_of_250K[i] = rd.nextInt();
        }
        long start_of_250k= System.currentTimeMillis();

        mergeSort(nums_of_250K, nums_of_250K.length);
        long finish_of_250k =System.currentTimeMillis();
        long currentTimeMillis_of_250k =finish_of_250k-start_of_250k;
        System.out.println("Array sorted through merge sort with 250K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_250k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_300K = new double[300000];
        for (int i = 0; i < nums_of_300K.length; i++) {
            nums_of_300K[i] = rd.nextInt();
        }
        long start_of_300k= System.currentTimeMillis();

        mergeSort(nums_of_300K, nums_of_300K.length);
        long finish_of_300k =System.currentTimeMillis();
        long currentTimeMillis_of_300k =finish_of_300k-start_of_300k;
        System.out.println("Array sorted through merge sort with 300K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_300k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_350K = new double[350000];
        for (int i = 0; i < nums_of_350K.length; i++) {
            nums_of_350K[i] = rd.nextInt();
        }
        long start_of_350k= System.currentTimeMillis();

        mergeSort(nums_of_350K, nums_of_350K.length);
        long finish_of_350k =System.currentTimeMillis();
        long currentTimeMillis_of_350k =finish_of_350k-start_of_350k;
        System.out.println("Array sorted through merge sort with 350K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_350k);

//        ////////////////////////////////////////////////////////////
//
//
        double [] nums_of_400K = new double[400000];
        for (int i = 0; i < nums_of_400K.length; i++) {
            nums_of_400K[i] = rd.nextInt();
        }
        long start_of_400k= System.currentTimeMillis();

        mergeSort(nums_of_400K, nums_of_400K.length);
        long finish_of_400k =System.currentTimeMillis();
        long currentTimeMillis_of_400k =finish_of_400k-start_of_400k;
        System.out.println("Array sorted through merge sort with 400K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_400k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_450K = new double[450000];
        for (int i = 0; i < nums_of_450K.length; i++) {
            nums_of_450K[i] = rd.nextInt();
        }
        long start_of_450k= System.currentTimeMillis();

        mergeSort(nums_of_450K, nums_of_450K.length);
        long finish_of_450k =System.currentTimeMillis();
        long currentTimeMillis_of_450k =finish_of_450k-start_of_450k;
        System.out.println("Array sorted through merge sort with 450K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_450k);

//        ////////////////////////////////////////////////////////////
//
//
        double [] nums_of_500K = new double[500000];
        for (int i = 0; i < nums_of_500K.length; i++) {
            nums_of_500K[i] = rd.nextInt();
        }

        long start_of_500k= System.currentTimeMillis();

        mergeSort(nums_of_500K, nums_of_500K.length);

        long finish_of_500k =System.currentTimeMillis();
        long currentTimeMillis_of_500k =finish_of_500k-start_of_500k;
        System.out.println("Array sorted through merge sort with 500K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_500k);

//
//
//
//
//    }


    }
}