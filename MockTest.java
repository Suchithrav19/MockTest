1
package com.xworkz.test;

public class MaxMin {

		void max(int []a,int as)
		{
	
				int i;
				int max = a[0];

				for (i = 0; i < as; i++) {
					if (a[i] > max) {
						max = a[i];
					}
					System.out.println("the maximum number is"+max);
				}	
			}
		void min(int []a,int as)
		{
	
				int i;
				int max = a[0];

				for (i = 0; i < as; i++) {
					if (a[i] < max) {
						max = a[i];
					}
					System.out.println("the min number is"+max);
				}	
			}

			public static void main(String[] args)
			{
				int[] a = { 45,333,76,29,900,23,474,654,29,454 };
				MaxMin  ma=new MaxMin();
				ma.max(a,a.length);
				ma.min(a,a.length);
	
			}

	}


2
package com.xworkz.test;

public class TimmySarah {
		  public static boolean isLove(final int flower1, final int flower2) {
			  
		    boolean inLove = false;
		    		if (flower1 % 2 == 0 && flower2%2==0) {
		      inLove = true;
		    }
		    return inLove;
		  }  
		
public static void main(String args[])
{
	TimmySarah love=new TimmySarah();
	
	System.out.println("In the love is "+love.isLove(2,2));


}

}

3.
 Class which tells the main features but not the specific details. The classes situated at the top of the inheritance hierarchy can be said as General.

A class which is very particular and states the specific details. The classes situated at the bottom of the inheritance hierarchy can be said as Specific.

4.

a.
We should declared your class as final. But you can't define your class as final, if it is an abstract class. A class declared as final can't be extended by any other class.


b.
eg for final classes:

java.lang.String,  java.lang.Math are final classes

c.
Delegation

5.

6.
Linked list:
*LinkedList internally uses a doubly linked list to store the elements
*Manipulation with LinkedList is faster .
*LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
*LinkedList is better for manipulating data.




ArrayList:
*ArrayList internally uses a dynamic array to store the elements.
* Manipulation with ArrayList is slow .
* An ArrayList class can act as a list only because it implements List only.
*ArrayList is better for storing and accessing data.


7.
ListIterator:
*Can traverse elements present in Collection both in forward and backward directions.
*Can only traverse List and not the other two.
*It has methods like nextIndex() and previousIndex() to obtain indexes of elements at any time while traversing List.
*We can modify or replace elements with the help of set(E e)
*Can easily add elements to a collection at any time.
*Certain methods of ListIterator are next(), previous(), hasNext(), hasPrevious(), add(E e).

Iterator:
*Can traverse elements present in Collection only in the forward direction.
*Helps to traverse Map, List and Set.
*Indexes cannot be obtained by using Iterator.
*Cannot modify or replace elements present in Collection
*Cannot add elements and it throws ConcurrentModificationException.
*Certain methods of Iterator are next(), remove() and hasNext().

8.

The covariant method overriding approach, implemented in Java 5, helps to remove the client-side typecasting by enabling you to return a subtype of the overridden method's actual return type. Covariant Method overriding means that when overriding a method in the child class, the return type may vary.

9.



10.
static polimorphism : when there are multiple functions with the same name but different parameters then these functions are said to be overloaded.
dynamic polimorphism: if sub class has the same method as declared in the parent class with the same parameters is said to be override.

eg:
