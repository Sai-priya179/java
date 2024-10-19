class Interest
{
int p,t,r;
void getData()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter principle amount:");
p=sc.nextInt();
System.out.println("Enter time:");
t=sc.nextInt();
System.out.println("Enter rate of interest:");
r=sc.nextInt();
}
}
class Sim
{
float si;
si=p*t*r/100;
}
class SimInterest
{
public static void main(String args[])
{
si.getData();
System.out.println("Simple Interest:"+si);
}
}