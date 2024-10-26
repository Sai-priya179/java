import java.util.Scanner;
import java.io.*;
class Stu
{
public void getData()
{
int appno=0,m1=0,m2=0,m3=0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter application number:"+appno);
appno=sc.nextInt();

System.out.println("Enter marks of AI:"+m1);
m1=sc.nextInt();
System.out.println("Enter marks of CD:"+m2);
m2=sc.nextInt();
System.out.println("Enter marks of MEFA:"+m3);
m3=sc.nextInt();
}
}
class Stu1 extends Stu
{
public void cal()
{
int m1=1,m2=2,m3=1, tot;
float avg;
tot=m1+m2+m3;
avg=tot/3;
System.out.println("Total Marks:"+tot);
System.out.println("Avg Marks:"+avg);
if(avg>80 && avg<70)
{
System.out.println("Grade A");
}
else if(avg>70 && avg<60)
{
System.out.println("Grade B");
}
else if(avg>60 && avg<50)
{
System.out.println("Grade C");
}
else
{
System.out.println("Grade D");
}
}
}
class Student1
{
public static void main(String args[ ])
{

Stu1 obj1 = new Stu1();
obj1.getData();
obj1.cal();
}
}