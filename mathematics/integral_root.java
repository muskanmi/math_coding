package mathematics;

import java.util.Scanner;

public class integral_root {
    public static void main(String[] args) {
        /*You are given a integer N and another integer K. You have to find how many integers (n) are possible such that N is the integeral part of Kth root of the integer (n).

Example 1:

Input: N = 3, K = 2
Output: 7
Explaination: 9, 10, 11, 12, 13, 14, 15 
have 3 as integral part of there square root.*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long p = (long)Math.pow(n, k);
        long q = (long)Math.pow(n+1, k);
        System.out.println(q-p);
    }
    
}
