import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
     // float num=input.nextFloat();
    //System.out.println(num); 



    // type casting 
    int num= (int)(67.05f);
    System.out.println(num);

    // automatic type promotion in expression 
    int a=257;
    byte b=(byte)a; // 257%256=1 


    System.out.println(b);
}
}
