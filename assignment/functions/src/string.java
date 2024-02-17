import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        //System.out.println(56);
        //System.out.println("kunal");
        //System.out.println(Arrays.toString(new int[]{4,5,6,7,8,9,0,10}));
        //Arrays.toString() method helps to convert array given as input to human readable form

        //toString is a method =. which converts obj to string and array calls array to
        int array[][] = {
                {4,5,6,7} ,
                {11,45,63,647},
                {32,64,86,978}
        } ;
        System.out.println(Arrays.toString(array));
    }


    public static String valueOf(Object obj){
        return (obj == null) ? "null" : obj.toString() ;
        //obj.tostring =>
    }
}
