
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){

        String longest = null;
        int lengthOfLongest = 0;
        int indexPosition = 0;

        lengthOfLongest = arr[0].length();

        for(int i = 1; i < arr.length; i++){
           
            if(arr[i].length() > lengthOfLongest){
                lengthOfLongest = arr[i].length();
                indexPosition = i;
                
            }   longest = arr[indexPosition];
        }
        System.out.println(longest);
        return longest;
    }

    public static void main(String[] args) {
        ReturnLongestString longest = new ReturnLongestString();
        String[] sj = {"abc", "def", "hijk"};
        longest.longest(sj);
    }
}
