class stack
{
	int A[];
	int top;
	stack()
	{
		A = new int[5];
		top = -1;
	}
	boolean isEmpty()
	{
		return (top<0);
   
	}
	
	boolean isFull()
	{
	   return (top >= (A.length-1));
		
	}
	void push(int x)
	{
		if(isFull() == true)
		{
			System.out.println("The stack is full");
		}
		else
		{
			A[++top]=x;
			System.out.println(x + " :is push to the stack");
		}
	}
	int pop()
	{
		if(isEmpty()==true)
		{
		  System.out.println("The stack is empty");
		  return 0;
		}
		else
		{
		   int data = A[top];
		   top--;
		   System.out.println("The pop element is:");
		   return data;
           		   
		}
	}
	int peek()
	{
		if(isEmpty()==true)
		{
		  System.out.println("The stack is empty");
		  return 1;
		}
		else
		{
			int y = A[top];
			System.out.print("The peek is :");
			return y;
		}
	}
	void print()
	{
		for(int i = 0;i<A.length;i++)
		{
			System.out.print(A[i]+",");
		}
		System.out.println("\b\t");
	}
	public static void main(String args[])
	{
		stack element = new stack();
		element.pop();
		element.push(10);
		element.push(25);
		element.print();
		System.out.println(element.peek());
		System.out.println(element.pop());
		System.out.println(element.peek());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}