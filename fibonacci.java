public class Demo
{
   static int fibo(int num)
{
      int first = 0, second = 1, temp;
      if (num == 0)
      return first;
      if (num == 1)
      return second;
      for (int i = 2; i <= num; i++)
{
         temp = first + second;
         first = second;
         second = temp;
      }  
      return second;
   }
   public static void main(String args[]){
      int num = 7;
      System.out.print("The 7th fibonacci number is : ");
      System.out.println(fibo(num));
   }
}

Output
The 7th fibonacci number is : 13