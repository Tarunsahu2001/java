import java.io.*;
import java.util.*;
class reverseprime
{
    static void reverseorder(int n)
    {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++){
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for (int i = n; i >= 2; i--)
            if (prime[i] == true)
                System.out.print(i + " ");
    }
    public static void main(String args[])
    {
        int N = 25;
        System.out.println("Prime number in reverse order");
        if (N == 1)
            System.out.println("No prime no exist in this range");
        else
            reverseorder(N);
    }
}

Output: 
Prime number in reverse order
23 19 17 13 11 7 5 3 2