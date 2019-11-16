import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int rem,sum=0,org,num;
    Scanner in=new Scanner(System.in);
    num=in.nextInt();
    while(num>0){
      rem=num%10;
      sum=sum*10+rem;
      num=num/10;
       }
    System.out.print(sum);
  }
}