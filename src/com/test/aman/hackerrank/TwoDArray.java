/**
 * 
 */
package com.test.aman.hackerrank;

/**
 * @author amanb
 *
 */
import java.io.*;


public class TwoDArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int sum;
        int largestSum = -999;

        for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
            	sum = 0;
            	sum += arr[i-1][j-1];
            	sum += arr[i-1][j];
            	sum += arr[i-1][j+1];
            	sum += arr[i][j];
            	sum += arr[i+1][j-1];
            	sum += arr[i+1][j];
            	sum += arr[i+1][j+1];
                if (sum > largestSum){
                    largestSum = sum;
                }

            }
        }
        return largestSum;
    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int[][] arr = new int[6][6];
    	int[][] arr = {{1,1,1,0,0,0},
    			       {0, 1, 0, 0, 0,0},
    			       {1, 1, 1, 0, 0, 0},
    			       {0, 0, 2, 4, 4, 0},
    			       {0, 0, 0, 2, 0, 0},
    			       {0, 0, 1, 2, 4, 0}};

//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
     //  }

        int result = hourglassSum(arr);
 System.out.println("end result-->"+result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}