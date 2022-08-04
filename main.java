class stack_list
{
	Node top;
   static class Node
   {
	   int element;
	   Node next;
	   Node(int element)
	   {
		   this.element = element;
	   }
   }
   public boolean isEmpty()
   {
	  if(top == null)
	  {
		  return true;
	  }	
      else
	  {
		  return false;
	  }		  
   }
   public void push(int element)
   {
	   Node newNode = new Node(element);
	   if(top == null)
	   {
		   top = newNode;
	   }
	   else
	   {
		   Node temp = top;
		   top = newNode;
		   newNode = temp;
		   
	   }
	   System.out.println(element + ":is push to the linkedList");
	}
	public void pop()
	{
		if(isEmpty()==true)
		{
		  System.out.println("The stack is empty");
		  
		}
		else
		{
			System.out.println(top.element);
			top = top.next;
		}
	}
	public void peek()
	{
		if(isEmpty()==true)
		{
		  System.out.println("The stack is empty");
		  
		}
		else
		{
			System.out.println(top.element);
			
		}
	}
   










}
public class main
{
	public static void main(String args[])
	{
		stack_list n = new stack_list();
		n.pop();
		n.push(23);
		n.push(12);
		n.pop();
	}
}