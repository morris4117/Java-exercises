public class Throwsexception {

    public int ad(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }


    public static void main(String[] args)throws ArithmeticException {
         Throwsexception te = new Throwsexception();

         try{
             System.out.println("Division "+te.div(5,0));
         }catch (ArithmeticException ae){
             System.out.println(ae.getMessage());
         }
        System.out.println("Addition "+te.ad(5,10));
        System.out.println("Subtraction "+te.sub(15,10));
    }
}