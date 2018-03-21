import java.util.Scanner;
class age
{
   public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      //Empty String
      String  primeNumbers = "";
      System.out.println("Enter your age");
      int n = scanner.nextInt();
      System.out.println("these numbers are prime");
      for(i;i<=n;i++){
      
      for(int j= i;j>=1;j++){
      
      if(i%j==0){
      num= num + 1;
      
      }}
      if(num == 2){
      System.out.println(i);
      }
      }}