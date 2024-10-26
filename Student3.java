import java.util.Scanner;
import java.io.*;
interface Stu
{
void getData();
}
interface Stu1
{
void cal();
}
class Stu2 implements Stu
{
public void getData()
{
Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.println("Enter marks of AI:");
a=sc.nextInt();
System.out.println("Enter marks of CD:");
b=sc.nextInt();
System.out.println("Enter marks of MEFA:");
c=sc.nextInt();
}
}
class Stu3 implements Stu1
{
public void cal()
{
int Total,a=85,b=90,c=70;
float avg;
Total=a+b+c;
avg=Total/3;
System.out.println("Total Marks:"+Total);
System.out.println("Avg Marks:"+avg);
if(avg>=80)
{
System.out.println("Grade A");
}
else if(avg>=70 && avg<80)
{
System.out.println("Grade B");
}
else if(avg>=60 && avg<70)
{
System.out.println("Grade C");
}
else if(avg>=40 && avg<60)
{
System.out.println("Grade D");
}
else
{
System.out.println("Grade F");
}
}
}
class Student3
{
public static void main(String args[])
{
Stu2 d = new Stu2();
Stu3 e = new Stu3();
d.getData();
e.cal();
}
}