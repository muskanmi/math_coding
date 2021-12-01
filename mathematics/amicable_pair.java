package mathematics;

import java.util.Scanner;

public class amicable_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        //amicable pair gfg
        int sum=0;
        int sum2=0;
        for(int i=1; i<A; i++){
            if(A%i == 0){
                sum += i;
            }
        }
        for(int i=1; i<B; i++){
            if(B%i == 0){
                sum2 += i;
            }
        }
       if(sum == B && sum2 == A){
           System.out.println("1");
       }
       else{
           System.out.println("0");
       }
    }
}
