public class NestedTryCatch{
    public static void main(String[] args){
        // Inner try handles its own exception 
        try{
            System.out.println("Outer try starts");
            try{
                System.out.println("inner try starts");
                System.out.println(5/0);
                System.out.println("inner try ends");

            }
            catch(Exception e){
                System.out.println("division by zero is not allowed : Inner ");
            }
            System.out.println("Inner try ends ");

        }
        catch(Exception e){
            System.out.println("division by zero is not allowed : Outer  ");

        }
    }
}