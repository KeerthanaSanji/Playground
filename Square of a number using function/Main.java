import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sos=squ(n);
      System.out.print(sos);
	} 
  public static int squ(int n){
    int r=n*n;
    return r;
}
}