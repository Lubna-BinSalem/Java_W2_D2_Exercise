import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Java_W2_D2_E1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Ïnput the first number:");
        int num1= input.nextInt();

        System.out.println("input your second number:");
        int num2=input.nextInt();

        System.out.println("Enter the operation:");
        String op=input.next();
        //System.out.println(op.equals('+'));

        if(op.charAt(0)==('+')){
            System.out.println(num1+num2);
        }else if(op.charAt(0)==('-')) {
            System.out.println(num1 - num2);
        }else if(op.charAt(0)==('*')) {
            System.out.println(num1 * num2);
        }else if(op.charAt(0)==('/')) {
            System.out.println(num1/num2);
        }else if(op.charAt(0)==('%')) {
            System.out.println(num1%num2);
        }else {
            System.out.println("Wrong operation");
        }
    }
}
