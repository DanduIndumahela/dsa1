import java.util.Scanner;
public class Larg0
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=Math.max(a,b,c);
        System.out.println(max);
    }
}