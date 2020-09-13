import java.util.Arrays;
import java.util.Scanner;

public class MinMatrix {
    public static int[][] minMatrix(int[][] array){
        if(array.length == 1){
            return array;
        }
        int index = 0,i = 1;
        for(; i < array.length; i++){
            if(Arrays.equals(array[0],array[i])){
                index = i / 2;
                break;
            }
        }
        if(i == array.length){
            return array;
        }
        int[][] result = new int[index + 1][];
        for(int j = 0; j <= index; j++){
            result[j] = array[j];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] array = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    array[i][j] =sc.nextInt();
                }
            }
            int[][] result = minMatrix(array);
            for(int i = 0; i < result.length; i++){
                for (int j = 0; j < result[i].length; j++){
                    System.out.println(result[i][j]);
                }
            }
        }
    }

}
