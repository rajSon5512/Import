import java.util.*;


public class DelimiterDemo{


    public static void main(String arg[]) throws Exception
    {

        String i="hi I love Gandhi Surname.";
        Scanner sc=new Scanner(i).useDelimiter("\\s");

        System.out.println(sc.next());
        System.out.println(sc.next());

        Scanner spObj=new Scanner(System.in);

        System.out.printf("Number:");

        int r=spObj.nextInt();

        System.out.println("Enter  Number:"+r);

      
    }



}