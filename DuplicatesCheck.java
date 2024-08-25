import java.util.Arrays;

public class DuplicatesCheck {
    public static void main(String[] args) {
        //initializing first array
        int a[]={30,25,40,50,50,60};
        //initializing second array
        int b[]={30,25,40,50,50,60};
        boolean results= Arrays.equals(a,b);
        if (results==true){
            System.out.println("Two arrays are equal");
        }else {
            System.out.println("The arrays are not equal");
        }



    }











}
