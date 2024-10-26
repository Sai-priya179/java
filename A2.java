interface sum
{
int sm=90;
void suma();
}
interface add
{
int ad=89;
void adda();
}
class A1 implements add,sum
{
public void suma()
{
System.out.println("interface 1"+sm);
}
public void adda()
{
System.out.println("interface 2"+ad);
}
}

class A2
{
public static void main(String args[])
{
A1 n = new A1();
n.adda();
n.suma();
}
}