import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by Bink on 15/9/11.
 */
public class QuickSort {
    public static void quickS(int[] args,int h,int t){


        int m = quick(args,h,t);
        if(m-1>h)
            quickS(args,h,m-1);
        if(m+1<t)
            quickS(args,m+1,t);


    }

    private static int quick(int[] args,int h,int t){
        int pivot = args[h];
        int i = h;


        for(int m=h+1;m<=t;m++){
            int j = args[m];
            if(j<pivot){
               int temp =  args[++i];
                args[i] = args[m];
                args[m] = temp;
            }else{

            }
        }

        int temp =  args[h];
        args[h] = args[i];
        args[i] = temp;

        return i;
    }



    public static void main(String args[]) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line1 = "";
        String line2 = "";
        try {
            line1 = bf.readLine();
        }catch(Exception e){

        }
        String[] s1 = line1.split("\\s+");
        try {
            line2 = bf.readLine();
        }catch(Exception e){

        }
        String[] s2 = line2.split("\\s+");
        int[] point = new int[Integer.parseInt(s1[0])];
        for(int i = 0;i<point.length;i++){
            try {
                point[i] = Integer.parseInt(s2[i]);
            }catch(Exception e){

            }
        }

        quickS(point,0,point.length-1);


        double max = 0;

        for(int j = 1;j<point.length;j++){
            max = (Math.abs(point[j]-point[j-1]))>max?(Math.abs(point[j]-point[j-1])):max;
        }


        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(max/2));
    }
}
