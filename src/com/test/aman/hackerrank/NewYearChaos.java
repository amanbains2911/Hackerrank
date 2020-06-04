/**
 * 
 */
package com.test.aman.hackerrank;



/**
 * @author amanb
 *
 */
public class NewYearChaos {
	 // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int n=q.length;
    	int bribes[] = new int[n];
        
    	
    	 boolean toomany = false;

         long bribeCount = 0;
         for (int j = 0; j < n && !toomany; j++)
         {
             boolean found = false;
             for (int i = 0; i < n-1 && !toomany; i++)
             {
                 if (q[i] > q[i+1])
                 {
                     found = true;
                     bribes[q[i-1]]++;
                     bribeCount++;
                     if (bribes[q[i-1]] > 2)
                     {
                         toomany = true;
                     }
                     int t = q[i];
                     q[i] = q[i+1];
                     q[i+1] = t;
                 }
             }
             if (!found) break;
         }
         if (toomany)
         {
             System.out.println("Too chaotic");
         }
         else
         {
             System.out.println(bribeCount);
         }
     }

  //  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//            int[] q = new int[n];
//
//            String[] qItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int i = 0; i < n; i++) {
//                int qItem = Integer.parseInt(qItems[i]);
//                q[i] = qItem;
//            }
            int[] q= { 2, 1, 5, 3, 4};
            minimumBribes(q);
        }

        //scanner.close();
    }
//}

