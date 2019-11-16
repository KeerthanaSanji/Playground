import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
      System.out.println(power_of_no(base,exponent));
    }
  public static int power_of_no(int base,int exponent){
    int power=1;
    while(exponent>=1)
    {
      power=base*power;
      exponent--;
    }
    return power;
  }
}