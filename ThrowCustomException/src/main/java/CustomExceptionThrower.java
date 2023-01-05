import java.util.Scanner;



public class CustomExceptionThrower {

    static void checkAge(int age) throws CustomException{
            if(age < 18){
               throw new CustomException("you must be 18 or older");
            } else{
                System.out.println("Old enough to vote");
            }
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
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter your age");
            int age = sc.nextInt();
            checkAge(age);
        } catch (CustomException e) {
    
            System.out.println("A problem occurred"+ e);
        }
    }

}
