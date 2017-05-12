import java.util.Scanner;

/**
 * Created by Bink on 2017/4/7.
 */
public class Stack {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;

        if(k!=1) {
            while (n>=k) {
                n = n-k-1;
                count++;
            }
            System.out.println(count);
        }else{
            while(n>=3){
                n = n-3;
                count = count+2;
            }
            if(n!=0)
                count = count + 1;
            System.out.println(count);
        }
        scanner.close();
    }
}
