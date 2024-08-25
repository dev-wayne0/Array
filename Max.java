import java.util.Arrays;

public class Max {

    public static void main(String[] args) {
        //Java stream to find the max number
        //Declaring Array
        int arr[]={10,324,45,90,9808};
        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println("The Largest Number:"+max);


    }

}
