
import java.util.*;

public class pangram 
           {
                static boolean checkPangram(String str)
                      {
		          Set<Character> set = new HashSet<>();

		for (char ch : str.toCharArray()) 
                     {
                         if (ch >= 'a' && ch <= 'z')
			 set.add(ch);
                         if (ch >= 'A' && ch <= 'Z') 
                             {
			       ch = Character.toLowerCase(ch);
			       set.add(ch);
			      }
		      }

		
		return set.size() == 26;
	            }
public static void main(String[] args) 
{
  String str = "abcdefghijklmnopqrstuvwxy";
  if (checkPangram(str))
   System.out.println("It is a Pangram");
  else
      System.out.println("It is Not a Pangram");
}
}
