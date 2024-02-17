public class question_on_linearsearch
    //q: a sting is given , we need to search a character in string 1
{
    public static void main(String[] args) {
        //application of charAt() method
        String str = "hello my name is abhijay subrata Das " ;
        char ch = str.charAt(10) ;

        System.out.println(ch);
        String name = "kunal" ;
        char letter = 'p' ;
        boolean answer = function1(name , letter) ;
        System.out.println(answer);
    }
    //function 1

    static boolean function1(String string , char letter){
        if ( string.length() == 0 ){
            return false ;
        }
        for (int i = 0  ; i <string.length() ; i++) {
            if (letter == string.charAt(i)) {
                //charAt( i )  = used to get
                return true;
            }
        }
        return false ;

    }
    //function 2
}
