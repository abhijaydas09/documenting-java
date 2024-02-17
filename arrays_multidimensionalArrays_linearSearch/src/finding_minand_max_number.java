import java.util.Arrays;
//super clear

public class finding_minand_max_number {
    public static void main(String[] args) {
        int[] array = {32,35,64,78,9,7,57} ;
        System.out.println(Min_Number(array));
        System.out.println(Max_Number(array));
    }

    static int Min_Number(int[] array){

        int answer = array[0] ;
        for(int index = 0; index < array.length ; index++ ) {
            if(array[index] < answer ){
                answer = array[index] ;
            }

        }
        return answer ;
    }
    static int Max_Number(int[] array ){
        int answer_max = array[0] ;
        for (int index = 0; index < array.length; index++) {
            if (array[index]> answer_max ){
                answer_max = array[index] ;
            }

        }
        return  answer_max ;
    }
}
