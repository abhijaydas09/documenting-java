import java.util.Arrays;
import java.util.Objects;

public class StringBuilderrs {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder() ;
        String name  = "KunaL Kushwaha " ;
        String lower_case = name.toLowerCase() ;
        System.out.println(lower_case);

        System.out.println(Arrays.toString(name.toCharArray()));
        int new_var = name.length() ;
        System.out.println(new_var);
        String new_var2 = name.strip();
        System.out.println(new_var2);

    }
}
