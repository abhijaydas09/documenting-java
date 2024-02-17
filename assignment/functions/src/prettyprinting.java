public class prettyprinting {
    public static void main(String[] args) {
        float a = 453.122435f;
        System.out.println('a'+'b');
        System.out.printf("formatted number is %.2f",a);
        System.out.println(Math.PI);
        System.out.printf("pie: %.4f " , Math.PI);
        System.out.println("a" + "b"); //concatinates more than one string

        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        String series = "" ;
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i ) ;
            System.out.println(ch);
            series = series  + ch ; //series = series+ch

        }
        System.out.println(series);
        String new_series = "" ;
        for (int i = 0; i < 26; i++) {
            //till now it would have iterate for 26 times , therefore time complexity of
            //O(n^2) , time complexity
            char alp = (char) + ('i' + i) ;
            new_series = new_series + alp ;

        }
        System.out.println(new_series);
    }
}
