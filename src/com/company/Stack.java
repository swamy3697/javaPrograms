package com.company;

public class Stack {
    private int lenghtOfArray;
    private int[] array;
    private int tail;
    public void setLenghtOfArray(int lenghtOfArray) {
        this.lenghtOfArray = lenghtOfArray;
        this.array=new int[lenghtOfArray];
        this.tail=-1;
    }

    void push(int data){
        if(this.tail==this.lenghtOfArray-1){
            System.out.println("stackOverFlow");
        }
        else{
            this.tail++;
            this.array[this.tail]=data;
        }

    }
    void pop(){
        if(this.tail==-1){
            System.out.println("StackUnderFlow");
        }
        else{
            this.tail--;
        }
    }
    void diplay(){
        int start=this.tail;
        for (int i = start+1; i >=0; i--) {
            System.out.println(this.array[i]);
        }
    }
    void peek(){
        System.out.println(this.array[tail]);
    }

}
