import java.util.Scanner;
class ArithmaticOperation
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the first integer value");
int fi = sc. nextInt();

System.out.println("Enter second integer value");
int si = sc. nextInt();

int a =fi+si;
int s=fi-si;
int m=fi*si;
double d=fi/si;

System.out.println("The Addition of two Integer no. is"+a);
System.out.println("The Substraction of two Integer no. is"+s);
System.out.println("The Multiplication of two Integer no. is"+m);
System.out.println("The Division of two Integer no. is"+d);
}

}
