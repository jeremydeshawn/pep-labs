
public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
    public void throwCustomException(int age){
        if(age<0){
            try {
                throw new CustomException("Age is a negative number");
            } catch (CustomException e) {
                System.out.println("please enter a positive number");
                e.printStackTrace();
            }
        } 
        else{System.out.println("Age makes sense");}
    }

}
