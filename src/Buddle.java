import java.util.Scanner;

/**
 * Created by Bink on 15/9/16.
 */
public class Buddle {

    public static int Buddle(int[] a){

        int count = 0;

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int m = a[i];
                    a[i] = a[j];
                    a[j] = m;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] a = new int[input.length()];
        int[] b = new int[input.length()];


        System.out.println(Buddle(a));
        for (int i1 : a) {
            System.out.println(i1);
        }
    }

    private int[] char2num(char[] array,char zero) {
        int[] a = new int[array.length];
        int i = 0;
        for (char j : array) {
            if (j == zero) {
                a[i] = 0;
            }else{
                a[i] = 1;
            }
            i++;
        }
        return a;
    }
}
