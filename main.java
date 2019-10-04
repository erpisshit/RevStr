import java.util.*;
class main
{
  public static void main(String[] args)
  {
    Scanner jk = new Scanner(System.in);
    String io = jk.nextLine();
    System.out.println("Input String "+io);
    Collections.reverse(io);
    System.out.println("Output Reverse "+io);
  }
}
