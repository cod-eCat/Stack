package com.kiddy.dataStructure;

public class MyStack<T> {

	/*
	 * Stack Implement with static Array
	 * @Author LwinPhyoAung(codeCat)
	 * 
	 * Methods :	push(T element)
	 * 				pop() : T
	 * 				top() : T
	 * 				
	 * 				isEmpty() : boolean
	 * 				isFull() : boolean
	 * 				size() : int
	 * 				displayStack() :
	 */
	
	private int maxSize;
	private int counter;
	private int top = -1;
	
	private Object[] stack;
	
	public MyStack(int size){
		stack = new Object[size];
		maxSize = size;
	}
	
	public void push(T element){
		
		if(isFull()){
			System.out.println("Stack Is Full");
		}else{
			top += 1;
			stack[top] = element;
			counter += 1;
		}
		
	}
	
	public T pop(){
		
		T result = null;
		if(isEmpty()){
			System.out.println("Stack Is Empty");
		}else{
			counter -= 1;
			result = (T)stack[top];
			top -= 1;
		}
		
		return result;
		
	}
	
	public T top(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty!");
			return null;
		}else{
		return (T)stack[top];
		}
		
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void displayStack(){
		System.out.println();
		for (int i = 0; i <= top; i++) {
			System.out.print(" " + stack[i] + " ");
		}
		System.out.println();
	}
	
	public boolean isFull(){
		return (top + 1) == maxSize;
	}
	
	public int size(){
		return counter;
	}
	
	
}
