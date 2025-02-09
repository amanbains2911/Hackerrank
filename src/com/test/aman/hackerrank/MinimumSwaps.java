package com.test.aman.hackerrank;

import java.io.*;


public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
      int swap=0;
      int l=arr.length;
      for (int i = 0; i < l; i++) { 
              while (i+1 != arr[i]) {
                 int temp = arr[arr[i] - 1];
                 arr[arr[i] - 1] = arr[i];
                 arr[i] = temp;
                 swap += 1;
          }
      }
      return swap;

    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[n];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
    	int[] arr = {1, 3, 5, 2, 4, 6, 7};
        int res = minimumSwaps(arr);
        System.out.println("Result--->"+res);
//
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
   }
}

