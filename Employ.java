import java.util.*;
public class Employ
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String company=sc.next();
        Switch(id){
            case 1:
            System.out.println("IT");
            break;
            case 2:
            System.out.println("management");
            break;
            case 3:
            System.out.println("names");
            Switch(company){
                case "kunal":
                System.out.println("kunal");
                case "rahul":
                System.out.pritnln("rahul");

            }
            default:
            System.out.println("enter correct details");
            
        }
    }
}