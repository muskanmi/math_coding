package mathematics;
import java.util.*;;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter =0;
        for(int i=1; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=j; k<n; k++){
                    for(int l=k; l<n; l++){
                        if(i+j+k+l == n){
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}

/*Given a positive integer N, count the number of possible ways to represent N as the sum of four positive integers.
 

Example 1:

Input:
N = 5
Output:
1
Explanation:
We can represent 5 as
a sum of 4 positive integers,
only in 1 way as 1+1+1+2 = 5*/
