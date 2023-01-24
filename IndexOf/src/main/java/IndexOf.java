import org.eclipse.jetty.util.Index;

//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
       if(arr == null){
        return -1;
       }
       
       for(int i = 0; i < arr.length; i++){
        int index = 0;     
        if(arr[i] == n){
            index = i;
            System.out.println(index);
            return index;

            }
       }
    return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,5,8,14,20,23};
        IndexOf in = new IndexOf();
        in.getIndex(array, 20);
     }
}
