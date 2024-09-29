import java.util.*;
public class Switchmethod0
{
    public static void main(String args[])
    {
        System.out.println("eneter fruit");
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        Switch(fruit){
        case "apple"->System.out.pritnln("red fruit");
        case "mango"->System.out.pritnln("yellow fruit");
        case "banana"->System.out.pritnln("yellow fruit");
        case "grapes"->System.out.pritnln("green fruit");
        case "orange"->System.out.pritnln("orange fruit");
        default->System.out.println("invalid fruit");
        }
    }
}
