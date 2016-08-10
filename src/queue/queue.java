package queue;

import java.util.LinkedList;

public class queue<T> {
	int front , rear;
	LinkedList<T> store;
	queue(){
		front = rear = 0;
		store = new LinkedList<T>();
	}
	public T pop()
	{
		if(front == rear)
		{
			System.out.println("╤сапн╙©у");
			return null;
		}
		T t = store.get(front);
	
		front++;
		return t;
	}
	public void push(T e)
	{
		store.add(e);
		rear ++;
	}
	public boolean isEmpty(){
		if(front == rear)
		{
			return true;
		}
		return false;
	}
}
