public class Paidui{
    public static int count = 0;

    public static void main(String[] args) {

        String input = "DBBAC";


//        int arr[] = { 6, 5, 4, 3, 2, 1 };
        //int[] result = sort_and_count(arr1);
        count = iPairs(input);
        System.out.println("逆序数："+count);

    }

    public static int iPairs(String input) {
        int array[] = new int[input.length()];
        int i = 0;
        for (char c : input.toCharArray()) {
            switch (c) {
                case 'D':
                    array[i] = 4;
                    break;
                case 'C':
                    array[i] = 3;
                    break;
                case 'B':
                    array[i] = 2;
                    break;
                case 'A':
                    array[i] = 1;
                    break;
            }
            i++;
        }
        // 创建辅助数组
        int length = array.length;
        int[] copy = new int[length];
        System.arraycopy(array, 0, copy, 0, length);
        int numberOfInversePairs = iPairs(array, copy, 0, length - 1);
        return numberOfInversePairs;
    }

    public static int iPairs(int[] array, int[] copy, int begin, int end) {
        if(begin == end)
            return 0;
        int mid = (begin + end) / 2;
        // 递归调用
        int left = iPairs(copy, array, begin, mid);
        int right = iPairs(copy, array, mid + 1, end);
        // 归并
        int i = mid, j = end, pos = end;
        int count = 0; // 记录相邻子数组间逆序数

        while(i >= begin && j >= mid + 1)
        {
            if(array[i] > array[j]) {
                copy[pos--] = array[i--];
                count += j - mid;
            } else
                copy[pos--] = array[j--];
        }

        while(i >= begin)
            copy[pos--] = array[i--];
        while(j >= mid + 1)
            copy[pos--] = array[j--];

        return left + right + count;
    }
}