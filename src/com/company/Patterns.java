package com.company;

public class Patterns {
    private int lines;
    private String symbol;

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void normalTriangle(){
        for(int i=1;i<=lines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(getSymbol());
            }
            System.out.println("");
        }
    }
    public void midStartTriangle(){
        int space=getLines()-1;
        for(int i=1;i<=getLines();i++)
        {


            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(getSymbol()+" ");
            }
            System.out.println("");
            space-=1;
        }
    }
    public void rectangle(){
        for(int i=1;i<=getLines();i++){
            for (int j=1;j<=getLines();j++){
                System.out.print(getSymbol());
            }
            System.out.println();
        }
    }
    void rightArroyFildTriangle(int lines){
        for (int i = 1; i <=lines ; i++) {
            for (int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int k=lines-1;k>=1;k--) {
            for (int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    void rightArroyFiled(int lines){
        for (int i = 1; i <=lines ; i++) {
            for (int l=1;l<=i;l++){
                System.out.print("*_");
            }
            System.out.println("");
        }
        for (int m = 1; m <=10; m++) {
            System.out.print("*_");
        }
        System.out.println();
        for (int k=4;k>=1;k--) {
            for (int j=1;j<=k;j++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
