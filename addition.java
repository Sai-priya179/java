import java.io.*;
class addition
{
public static void main(String args[]) throws IOException
{
BufferedReader br;
int a,b,c;
br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a value");
a=Integer.parseInt(br.readLine());
System.out.println("Enter b value");
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println("The sum of two values is="+c);
}
}
