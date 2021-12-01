package mathematics;

import java.util.Scanner;

public class deficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum=0;
        //deficient number gfg
        for(int i=1; i<=x; i++){
            if(x%i ==0){
                sum+=i;
            }
        }
        if(sum < 2*x){
            System.out.println("YES");
        }
        else
        System.out.println("No");
    }
}
