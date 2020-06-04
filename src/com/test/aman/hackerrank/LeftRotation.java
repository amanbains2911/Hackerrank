package com.test.aman.hackerrank;

import java.io.*;
import java.util.*;

import java.util.regex.*;

public class LeftRotation {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    Matcher matcher = Pattern.compile(String.valueOf('a')).matcher(s);      
    int aInInput = 0;
    while (matcher.find()) {
        aInInput++;
    }
    long totalA = 0L;
    if (s.equals("a")) {
        return n;
    } else {
        totalA = totalA + ((n / s.length()) * aInInput);
        for (int i = 0; i < (n % s.length()); i++) {
            if (s.charAt(i) == 'a') {
                totalA++;
            }
        }
    }
    return totalA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}