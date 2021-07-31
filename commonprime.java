import java.util.*;
public class queuestack
{
    public static class MyQueue<T> 
{
        Stack<T> stack1 = new Stack<T>();
        Stack<T> stack2 = new Stack<T>();

        public void enqueue(T value) 
{
            stack1.push(value);
        }

        public T peek() 
{
             if (stack2.isEmpty())
 {
                 while (!stack1.isEmpty())
 {
                     stack2.push(stack1.pop());
                 }
             }
            return stack2.peek();
        }

        public T dequeue() 
{
            if (stack2.isEmpty()) 
{
                while(!stack1.isEmpty()) 
{
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }

    
    public static void main(String[] args)
 {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) 
{
            int operation = scan.nextInt();
            if (operation == 1) 
{
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) 
{
                queue.dequeue();
            } else if (operation == 3) 
{
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}