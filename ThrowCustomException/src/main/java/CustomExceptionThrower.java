import java.util.Scanner;



public class CustomExceptionThrower {

    static void evenNumber(int num) throws CustomException{
        if(num % 2 == 0){
            System.out.println("even number");
        }else{System.out.println("odd number");}
    }
    
    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
    
   
    public void throwCustomException(){
        try {
            Scanner n = new Scanner(System.in);
            int num = n.nextInt();
            System.out.println("enter a number");
            evenNumber(num);


        } catch (CustomException e) {
    
            System.out.println("A problem occurred"+ e);
        }
    }

}
