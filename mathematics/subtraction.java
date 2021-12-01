package mathematics;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count=0;
        //subtraction and two numbers gfg
        while(A!= 0 && B!= 0){
            if(A>B){
                A = A-B;
            }
            else{
                B=B-A;
            }
            count++;
        }
        System.out.println(count);
    }
}
