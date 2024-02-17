import java.util.Scanner;

public class Q25 {
    //making a depreciating value
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("enter a the type of material you want to check: car / mobile ");
        String Type_of_material = input.next() ; //type of material = car , mobile

        if (Type_of_material == "car" || Type_of_material == "Car" || Type_of_material == "car ") {
            //Depreciation Expense= (Initial Cost−Salvage Value)/ useful life approx (10 years)

            System.out.println("enter your vehical's price(MRP) :  ");
            int initial_cost  = input.nextInt() ;

            int salvage_cost  ;
            // salvage cost depends on km runs , petrol desiel electric ,


        }
    }
}
