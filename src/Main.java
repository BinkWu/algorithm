import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * Created by Bink on 15/9/16.
 */
public class Main {
    public static void main(String[] args){
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        String input = "";
        try {
            input = scan.nextLine();
        }catch(Exception e){

        }
        String[] letterA = input.split("\\s+");
        int lengthA = 0;
        try {
           lengthA = Integer.parseInt(letterA[0]);
        }catch(Exception e){

        }
        int Max = 0;
        try {
            input = scan.nextLine();
        }catch(Exception e){

        }
        String[] letterB = input.split("\\s+");
        int lengthB = 0;
        try {
            lengthB = Integer.parseInt(letterB[0]);
        }catch (Exception e){

        }

        int[] a = new int[lengthA];
        int[] b = new int[lengthB];

        for(int i=0;i<lengthA;i++){
            try {
                a[i] = Integer.parseInt(letterA[i + 1]);
            }catch(Exception e){

            }
        }

        for(int i=0;i<lengthB;i++){
            try {
                b[i] = Integer.parseInt(letterB[i + 1]);
            }catch(Exception e){

            }
        }
        int sumA = 0;
        int sumB = 0;
        int maxThree = 0;
        for(int i:a){
            maxThree = i>maxThree?i:maxThree;
        }
        for(int j:b){
            maxThree = j>maxThree?j:maxThree;
        }
        int three = 0;
        while(three<=(maxThree+1)){
            sumA = 0;
            sumB = 0;


            for(int j = 0 ;j<a.length;j++){
                if(a[j]>=three){
                    sumA += 3;
                }else{
                    sumA += 2;
                }
            }

            for(int k= 0 ;k<b.length;k++){
                if(b[k]>=three){
                    sumB += 3;
                }else{
                    sumB += 2;
                }
            }

            Max = (sumA-sumB)>Max?(sumA-sumB):Max;
            three++;

        }
            System.out.println(Max);


        }
    }

