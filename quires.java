class quires
{
static int calculate sum(int a, int N) 
{
    int m = N/a;
    int sum = m*(m + 1)/2;
    int ans = a*sum;
    return ans;
}
public static void main(String[] args) 
{
    int a = 7, N = 49;
    System.out.println("Sum of multiples of " + a + " up to " + N + " = " + calculate sum(a, N));
}
}

Output : 

Sum of multiples of 7 upto 49 = 196