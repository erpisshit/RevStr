import java.util.*;
class main
{
  public static void main(String[] args)
  {
    Scanner jk = new Scanner(System.in);
    String io = jk.nextLine();
    System.out.println("Input String "+io);
    if (io.length%2==0)
    {
      Collections.reverse(io);
      System.out.println("Output Reverse "+io);
    }
    else
    {
      System.out.println("Output Reverse "+io);
    }
  }
}
