package com.company;

public class Queue {
    private int lenghtOfArray;
    private int[] array;
    private int temp;
    private int tail;
    public void setLenghtOfArray(int lenghtOfArray) {
        this.lenghtOfArray = lenghtOfArray;
        this.array=new int[lenghtOfArray];
        this.tail=-1;
    }

    void push(int data){
        if(this.tail==this.lenghtOfArray-1){
            System.out.println("QueueOverFlow");
        }
        else{
            this.tail++;
            this.array[this.tail]=data;
        }

    }
    void pop(){
        if(this.tail==-1){
            System.out.println("QueueUnderFlow");
        }
        else{
            this.temp =this.array[0];
            for(int i=0;i<this.tail;i++){
                this.array[i]=this.array[i+1];
                System.out.println("arr item >>"+this.array[i]);
            }
           // System.out.println("POP item>>>"+temp);
            tail-=1;
        }
    }
    void diplay(){
        System.out.println("tail>>"+this.tail);
        for (int i = 0; i <=this.tail; i++) {
            System.out.println(this.array[i]);

        }
    }
    void peek(){
        System.out.println(this.array[tail]);
    }



}
