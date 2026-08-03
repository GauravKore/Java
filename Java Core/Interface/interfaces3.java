public class interfaces3{
    public static void main(String[] args){
        Payment p = new CreditCard();
        p.pay();


    }
}

interface Payment{
    void pay();
}

 class CreditCard implements Payment{
    public void pay(){
        System.out.println("paying via credit card ");
    }
}

class DebitCard implements Payment {
    public void pay(){
        System.out.println("paying via debit card");
    }
}