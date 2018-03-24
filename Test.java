import java.lang.Math;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    List<Integer> arbitrageLoop=Arbitrage.arbitrageOpportunity("C:\\Users\\dasto\\Desktop\\homework-4\\test\\files\\arbitrageLarge2.txt");
    for(int i:arbitrageLoop)
    {
      out.println(i);
    }
  }
}
