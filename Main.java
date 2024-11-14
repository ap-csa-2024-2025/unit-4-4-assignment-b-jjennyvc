import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
  }

  public static int countSub(String word, String target)
  {
    return 0;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    int N = target.length();
    for (int i = 0; i < word.length() - (N-1); i++)
    {
      String sub = word.substring(i, i+N);
      boolean beginOrSpaceBefore;
      boolean endOrSpaceAfter;
      int endOfTarget = i + target.length();

      if (endOfTarget == word.length())
      {
        endOrSpaceAfter = true;
      }
      else 
      {
        String after = word.substring(endOfTarget, endOfTarget+1);
        if (after.equals(" "))
        {
          endOrSpaceAfter = true;
        }
        else
        {
          endOrSpaceAfter = false;
        }
        }
      }
      endOrSpaceAfter = (enOfTarget == word.lenght()) || word.substring(endOfTarget1, endOfTarget+1).equals(" ")
      boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter;
      if (sub.equals(target) && properlyContained)
      {
        count++; 
      }
    }
    return 0;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
