import java.util.Random;

public class BubbleSort {
	
	    private static double[] bubbleSort(double nums[]) {
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1]) {

                    double temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {

        Random rd = new Random();
        double[] nums = new double[50000javac ja];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt();
            // System.out.println(nums[i]);
        }
        long start = System.currentTimeMillis();
        bubbleSort(nums);
        long finish = System.currentTimeMillis();
        long currentTimeMillis = finish - start;
        System.out.println("Array sorted through bubble sort with 50K: ");
        System.out.println("The run time is: " + currentTimeMillis);


//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_100K = new double[100000];
        for (int i = 0; i < nums_of_100K.length; i++) {
            nums_of_100K[i] = rd.nextInt();
        }
        long start_of_100k= System.currentTimeMillis();

        bubbleSort( nums_of_100K);
        long finish_of_100k =System.currentTimeMillis();
        long currentTimeMillis_of_100k =finish_of_100k-start_of_100k;
        System.out.println("Array sorted through bubble sort with 100K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_100k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_150K = new double[150000];
        for (int i = 0; i < nums_of_150K.length; i++) {
            nums_of_150K[i] = rd.nextInt();
        }
        long start_of_150k= System.currentTimeMillis();

        bubbleSort( nums_of_150K);
        long finish_of_150k =System.currentTimeMillis();
        long currentTimeMillis_of_150k =finish_of_150k-start_of_150k;
        System.out.println("Array sorted through bubble sort with 150K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_150k);

//
//        ////////////////////////////////////////////////////////////
        double [] nums_of_200K = new double[200000];
        for (int i = 0; i < nums_of_200K.length; i++) {
            nums_of_200K[i] = rd.nextInt();
        }
        long start_of_200k= System.currentTimeMillis();

        bubbleSort( nums_of_200K);
        long finish_of_200k =System.currentTimeMillis();
        long currentTimeMillis_of_200k =finish_of_200k-start_of_200k;
        System.out.println("Array sorted through bubble sort with 200K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_200k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_250K = new double[250000];
        for (int i = 0; i < nums_of_250K.length; i++) {
            nums_of_250K[i] = rd.nextInt();
        }
        long start_of_250k= System.currentTimeMillis();

        bubbleSort(nums_of_250K);
        long finish_of_250k =System.currentTimeMillis();
        long currentTimeMillis_of_250k =finish_of_250k-start_of_250k;
        System.out.println("Array sorted through bubble sort with 250K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_250k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_300K = new double[300000];
        for (int i = 0; i < nums_of_300K.length; i++) {
            nums_of_300K[i] = rd.nextInt();
        }
        long start_of_300k= System.currentTimeMillis();

        bubbleSort(nums_of_300K);
        long finish_of_300k =System.currentTimeMillis();
        long currentTimeMillis_of_300k =finish_of_300k-start_of_300k;
        System.out.println("Array sorted through bubble sort with 300K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_300k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_350K = new double[350000];
        for (int i = 0; i < nums_of_350K.length; i++) {
            nums_of_350K[i] = rd.nextInt();
        }
        long start_of_350k= System.currentTimeMillis();

        bubbleSort(nums_of_350K);
        long finish_of_350k =System.currentTimeMillis();
        long currentTimeMillis_of_350k =finish_of_350k-start_of_350k;
        System.out.println("Array sorted through bubble sort with 350K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_350k);

//        ////////////////////////////////////////////////////////////
//
//
        double [] nums_of_400K = new double[400000];
        for (int i = 0; i < nums_of_400K.length; i++) {
            nums_of_400K[i] = rd.nextInt();
        }
        long start_of_400k= System.currentTimeMillis();

        bubbleSort(nums_of_400K);
        long finish_of_400k =System.currentTimeMillis();
        long currentTimeMillis_of_400k =finish_of_400k-start_of_400k;
        System.out.println("Array sorted through bubble sort with 400K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_400k);

//
//        ////////////////////////////////////////////////////////////
//
        double [] nums_of_450K = new double[450000];
        for (int i = 0; i < nums_of_450K.length; i++) {
            nums_of_450K[i] = rd.nextInt();
        }
        long start_of_450k= System.currentTimeMillis();

        bubbleSort(nums_of_450K);
        long finish_of_450k =System.currentTimeMillis();
        long currentTimeMillis_of_450k =finish_of_450k-start_of_450k;
        System.out.println("Array sorted through bubble sort with 450K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_450k);

//        ////////////////////////////////////////////////////////////
//
//
        double [] nums_of_500K = new double[500000];
        for (int i = 0; i < nums_of_500K.length; i++) {
            nums_of_500K[i] = rd.nextInt();
        }

        long start_of_500k= System.currentTimeMillis();

        bubbleSort(nums_of_500K);

        long finish_of_500k =System.currentTimeMillis();
        long currentTimeMillis_of_500k =finish_of_500k-start_of_500k;
        System.out.println("Array sorted through bubble sort with 500K: ");
        System.out.println("The run time is: "+ currentTimeMillis_of_500k);

//
//
//
//
//    }


    }
}