import java.io.*;
class Prime
{
public static void main(String arg[])
{
int i,n=6,count=0;
if(n==0||n==1)
{
System.out.println("the given number neither prime nor composite");
}
if(n==2)
{
System.out.println("given number is prime");
}
for(i=2;i<n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==0)
{
System.out.println("the given number is prime");
}
else
{
System.out.println("the given number is not prime");
}
}
}
