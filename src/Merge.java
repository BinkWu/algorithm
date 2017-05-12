///**
// * Created by Bink on 15/9/16.
// */
//public class Merge {
//    public int[] merge(int[] a){
//        int mid = a.length/2;
//        if(mid==0){
//            return a;
//        }
//        int f[] = new int[mid];
//        int s[] = new int[a.length-mid];
//        int length = a.length;
//
//        System.arraycopy(a,0,f,0,mid);
//        System.arraycopy(a,mid,s,0,length-mid);
//        f = merge(f);
//        s = merge(s);
//
//        return mergeSort(f,s);
//
//    }
//
//    public int countInverse(int[] a){
//
//    }
//
//    private int[] mergeSort(int[] f,int[] s){
//        int[] c = new int[f.length+s.length];
//
//        int j = 0;
//        int i = 0;
//
//        for(int k = 0;k<c.length;k++){
//            if(i<f.length&&j<s.length){
//                if(f[i]>s[j]){
//                    c[k] = s[j];
//                    j++;
//                }else{
//                    c[k] = f[i];
//                    i++;
//                }
//            }else{
//                if(j<s.length){
//                    c[k] = s[j];
//                    j++;
//                }else if(i<f.length){
//                    c[k] = f[i];
//                    i++;
//                }
//            }
//        }
//
//        return c;
//    }
//
//
//
//    public static void main(String args[]){
//        int[] a = {4,2,3,2,5};
//
//        Merge m = new Merge();
//        a = m.merge(a);
//        for(int i : a) {
//            System.out.println(i);
//        }
//    }
//}
