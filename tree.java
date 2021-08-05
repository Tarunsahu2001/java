public static void main(String[]args)   
{
        Arrays.fill(tree, 0);
        Arrays.fill(lazy, 0);
        int arr[] = { 1, 3, 5, 7, 9, 11 };
        int n = arr.length;
        build_tree(arr, n);
        System.out.printf("Sum of values in given range = %d\n", query(n, 1, 3));
        update_tree(n, 1, 5, 10);
        System.out.printf("Updated sum of values in given range = %d\n", query(n, 1, 3));
    }
}

Output: 
Sum of values in given range = 15
Updated sum of values in given range = 45