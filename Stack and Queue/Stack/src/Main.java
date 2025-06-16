/*
 *
 *@author Jacky
 * 
 * Topic: Stack
 * Description: This program implements a stack data structure using an array.
 * It allows users to push (insert) and pop (delete) string data, as well as list the current contents of the stack.
 * Version 1
 * Update date: June 16,2025
 *
 */

import java.util.Scanner;

class Stack{
    Scanner sc=new Scanner(System.in);
    int Max=10;
    String[] st=new String[20];
    int top;

    Stack(){
        top=-1;
    }

    public void push(){
        if(top>=Max-1){
            System.out.print("\n    Stack is full!\n");
        }else{
            top++;
            System.out.println("Please enter a piece of data (in string format).");
            st[top]=sc.nextLine();
        }
        System.out.println("");
    }

    public void pop(){
        if(top<0){
            System.out.print("\n    Stack is empty!\n");
        }else{
            top--;
            System.out.printf("\n    %s The object has already been deleted!\n",st[top]);
            st[top]=sc.nextLine();
        }
        System.out.println("");
    }

    public void list_f(){
        if(top<0){
            System.out.print("\n    Stack is empty!\n");
        }else{
            int count=0;
            System.out.println("-----------------");
            for(int i=top;i>=0;i--){
                System.out.println(st[i]);
                count++;
            }
            System.out.print("-----------------");
            if(count>1){
                System.out.print("There are "+count+" data entries in the stack.");
            }
        }

    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        Stack obj=new Stack();
        do{
            System.out.println("***** choices for stack *****");
            System.out.println("      1. Insert      ");
            System.out.println("      2. Delete      ");
            System.out.println("      3. List      ");
            System.out.println("      4. Exit      ");
            System.out.println("******************************");
            System.out.print("   Please enter the item you want to execute:");
            num=sc.nextInt();
            System.out.println("");
            if(num==1){
                obj.push();
            }else if(num==2){
                obj.pop();
            }else if(num==3){
                obj.list_f();
            }else{
                 break;
            }

        }while(num!=4);
    }
}