import java.util.Arrays;

public class HybridSort {

    public static int thres_val = 10;


    public void hybridSort (double [] arr, int left, int right) {

        if (right - left <= thres_val) {
            QuadraticSort qs = new QuadraticSort();
            System.out.println("qs");
            qs.quadraticSort(arr, left, right);
        } else {
            QuickSortP2R1 rqs = new QuickSortP2R1();
            rqs.quickSort(arr, left, right);
        }
    }





    public static void main(String[] args) {
        HybridSort hs= new HybridSort();
        double[] arr = {5, 2, 9, 12, 6, 8, 3, 7,11,23,44,55,66,77,100};
        hs.hybridSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }



}

