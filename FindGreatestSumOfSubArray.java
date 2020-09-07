public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0],max = array[0];
        for(int i = 1;i<array.length;i++){
            if(sum+array[i]>array[i]){
                sum = sum + array[i];
            }else{
                sum = array[i];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
