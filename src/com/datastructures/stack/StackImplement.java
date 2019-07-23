package com.datastructures.stack;

import java.util.Scanner;

/*  Class StackImplement  */
public class StackImplement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Stack Test\n");
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt();
		/* Creating object of class arrayStack */
		ArrayStack stk = new ArrayStack(n);
		/* Perform Stack Operations */
		char ch;
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. check full");
			System.out.println("6. size");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				try {
					stk.push(scan.nextInt());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.println("Popped Element = " + stk.pop());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element = " + stk.peek());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty status = " + stk.isEmpty());
				break;
			case 5:
				System.out.println("Full status = " + stk.isFull());
				break;
			case 6:
				System.out.println("Size = " + stk.getSize());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* display stack */
			stk.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
	}
}
