import java.io.*;
class prefixfactorial
{
static int MAX = 1000;
static int MOD = 1000;
static int []result = new int [MAX + 1];
static int []fact = new int [MAX + 1];
static void preCompute()
{
    fact[0] = 1;
    result[0] = 1;
    for (int i = 1; i <= MAX; i++) 
    {
        fact[i] = ((fact[i - 1] % MOD) * i) % MOD;
        result[i] = ((result[i - 1] % MOD) * 
                   (fact[i] % MOD)) % MOD;
    }
}
static void performQueries(int q[], int n)
{
    preCompute();
    for (int i = 0; i < n; i++)
        System.out.println (result[q[i]]);
}
public static void main (String[] args) 
{
    int q[] = { 4, 5 };
    int n = q.length;
    performQueries(q, n);
}
}