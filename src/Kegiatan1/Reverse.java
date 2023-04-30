package Kegiatan1;

import java.util.Scanner;

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan String: ");
        String input = sc.nextLine();

        int length = input.length();
        Stack stack = new Stack(length);

        for (int i = 0; i < length; i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Reversed: " + reversed);
    }
}
