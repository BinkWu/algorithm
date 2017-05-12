import java.util.*;
import java.util.Stack;

/**
 * Created by Bink on 2017/5/7.
 */
public class Island {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m = scanner.nextInt();

        char[][] input =new char[n][m];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            input[i] = line.toCharArray();
        }

        int result = 0;

        Set set = new HashSet();

        boolean[][] isVisited = new boolean[n][m];

        for (int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!isVisited[i][j]&&input[i][j]=='1'){
                    result++;
//                    BFS(input, isVisited, i, j);
                    DFS(input, isVisited, i, j);
                }
            }
        }

        System.out.println(result);
        scanner.close();
    }

    private static void BFS(char[][] map,boolean[][] isVisited,int row,int col){
        if(row>=0&&row<map.length && col>=0 && col<map[0].length && !isVisited[row][col] && map[row][col] =='1'){
            isVisited[row][col] = true;
            BFS(map, isVisited, row - 1, col);
            BFS(map, isVisited, row, col + 1);
            BFS(map, isVisited, row + 1, col);
            BFS(map, isVisited, row, col - 1);
        }
    }

    private static  void DFS(char[][] map,boolean[][] isVisited,int row,int col){
        java.util.Stack<int[]> stack = new Stack();
        int[] current = {row, col};
        stack.push(current);
        while(!stack.isEmpty()){
            current = stack.peek();
            isVisited[current[0]][current[1]] = true;
            if((current[1]-1)>0 && map[current[0]][current[1]-1] == '1' && !isVisited[current[0]][current[1]-1]){
                int[] i = {current[0], current[1] - 1};
                stack.push(i);

            }else if((current[1]+1)<map[0].length && map[current[0]][current[1]+1] == '1' && !isVisited[current[0]][current[1]+1]){
                int[] i = {current[0], current[1] + 1};
                stack.push(i);

            }else if((current[0]-1)>0 && map[current[0]-1][current[1]] == '1' && !isVisited[current[0]-1][current[1]]){
                int[] i = {current[0]-1, current[1]};
                stack.push(i);

            }else if((current[0]+1)<map.length && map[current[0]+1][current[1]] == '1' && !isVisited[current[0]+1][current[1]]) {
                int[] i = {current[0]+1, current[1]};
                stack.push(i);
            }else{
                stack.pop();
            }
        }

    }
}
