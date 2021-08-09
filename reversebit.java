class reversebit
{
    public static int reverseBits(int n)
    {
        int pos = Integer.SIZE - 1;    
        int reverse = 0;
        while (pos >= 0 && n != 0)
        {
            if ((n & 1) != 0)
{
                reverse = reverse | (1 << pos);
            }
            n >>= 1;                 
            pos--;               
        }
        return reverse;
    }
    public static String toBinaryString(int n)
    {
        return String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0");
    }
    public static void main(String[] args)
    {
        int n = -100;
        System.out.println(n + " in binary is " + toBinaryString(n));
        System.out.println("On reversing bits " + toBinaryString(reverseBits(n)));
    }
}

Output:
-100 in binary is 11111111111111111111111110011100
On reversing bits 00111001111111111111111111111111