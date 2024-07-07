public class arrays {
    public static void main(String[] args) {
        glocerry[] arr ;
        arr = new glocerry[2] ;
        arr[0] = new glocerry("milk", 20 , "no" , "no" ) ;

    }
}
//TIP creating a clocerries class with the product and price as an attributes
class glocerry
{
     String products ;
     int price ;
     String avaibality ;

     String delivery ;

     //glocerries class constructor ;
    glocerry(String products , int price , String avaibality , String delivery )
    {
        this.price = price ;
        this.products = products ;
        this.avaibality = avaibality ;
        this.delivery = delivery ;

    }
    public void display(){
        System.out.println("product is "  + products  + "its price is " + price + "avaibality is" + avaibality );
        System.out.println("delivery status : " +  delivery );
    }

}
