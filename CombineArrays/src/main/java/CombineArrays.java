
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            combined[i] = arr1[i];
        }

        for(int i = 0; i < arr2.length; i++){
            combined[i + arr1.length] = arr2[i];
        }

        return combined;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        CombineArrays ca = new CombineArrays();
        
    }
}
