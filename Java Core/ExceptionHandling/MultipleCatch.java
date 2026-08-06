// chaining of catch block 
    public class MultipleCatch{
    public static void main(String[] args) {
        // code with multiple catch 
        // jvm goes top to bottom 
        // so start with specific exceptions and then generic exception

        try {
            System.out.println(5/0);
            String s = null;
            System.out.println(s.length());

        } catch (ArithmeticExceptionDemo e) {
            System.out.println("divide by zero is not allowed");
        }
        catch(NullPointerException e){
            System.out.println("nulls are not allowed");
        }
        /*
        after java 7
        catch(ArithmeticException | NullPointerException e)
        */
        catch(Exception e){
            System.out.println("Generic exception");
        }

    }


}