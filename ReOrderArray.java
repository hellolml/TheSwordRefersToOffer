
public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        if(array!=null){
            int newA[] = new int[array.length];
            int countOld = 0;
            int countNew = 0;
            for(int i=0;i<array.length;i++) {
                if (array[i] % 2 != 0) {
                    array[countOld++] = array[i];
                } else {
                    newA[countNew++] = array[i];
                }
            }
            for(int i =0;i<countNew;i++){
                array[countOld+i] = newA[i];
            }
        }
    }
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5,6,7};
        reOrderArray(a);
    }
}
