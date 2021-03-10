import java.util.Arrays;
import java.util.Random;

public class QuickSortP2R1 {


    public int partition(double arr[], int left, int right) {

        int pivotIdx = new Random().nextInt(right - left )+ left ;
        double pivotElem = arr[pivotIdx];

        double tmp = pivotElem;
        arr[pivotIdx] = arr[right];
        arr[right] = tmp;

        int i = left;
        int j = right-1;

        while (i <= j) {
            while (i <= right && arr[i] < pivotElem)
                i++;
            while (j >= left && arr[j] >= pivotElem)
                j--;
            if(i > j)
                break;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        if (i > j) {
            tmp = arr[i];
            arr[i] = arr[right];
            arr[right] = tmp;
        }


        return i;
    }


    public  void quickSort(double[] arr, int left, int right) {
        //Random random= new Random();
        //int pivot = left + random.nextInt(right - left + 1);

        if (left < right) {
            int pivotIdx = partition(arr, left, right);
            quickSort(arr, left, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, right);
            System.out.println("This is the pivot:" + pivotIdx);
        }

    }

    public static void main(String[] args) {
        QuickSortP2R1 rqs = new QuickSortP2R1();
        double[] arr = new double[]{5, 2, 9, 12, 6, 8, 3, 7};
        rqs.quickSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
