import java.io.*; 
import java.util.*; 
class prefixeven
{ 
static int[] pref = new int[1000];
static int isEvenParity(int num)
{
    int parity = 0;
    int x = num
    while (x != 0)
    {
        if ((x & 1) == 1)
            parity++;
        x = x >> 1;
    }
    if (parity % 2 == 0)
        return num;
    else
        return 0;
}
static void preCompute()
{
    for(int i = 1; i < 1000; i++)
    {
       pref[i] = pref[i - 1] + isEvenParity(i);
    }
}
static void printSum(int L, int R)
{
    System.out.println(pref[R] - pref[L - 1]);
}
static void printSum(int arr[][], int Q)
{
    preCompute();
    for(int i = 0; i < Q; i++) 
    {
       printSum(arr[i][0], arr[i][1]);
    }
}
public static void main(String[] args) 
{ 
    int N = 2;
    int[][] Q = { { 1, 10 },{ 121, 211 } };
    printSum(Q, N);
} 
}