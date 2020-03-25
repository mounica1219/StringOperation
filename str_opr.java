package TddJunit;
import java.util.*;
public class str_opr
{
    public static void main(String args[])
	{
          Scanner s=new Scanner(System.in);
	  String given_str=s.nextLine();
	  int length=given_str.length();
	   if(given_str.charAt(1)=='A')
		{
		  given_str=given_str.charAt(0)+given_str.substring(2,length);
		  length=length-1;
		}
	  if(given_str.charAt(0)=='A' )
		{
		  given_str=given_str.substring(1,length);
		  length=length-1;
		}
		
	 
		System.out.println(given_str);
	}
}
