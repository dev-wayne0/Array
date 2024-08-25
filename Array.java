import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50} ;


          int max=Arrays.stream(numbers).max().getAsInt();
        System.out.println("The maximum number is:"+max);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

    }


}
