package Bai_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_value{
    Scanner sc = new Scanner(System.in);
    
    private ArrayList<Integer> arrayList;

    public Array_value() {
        this.arrayList = new ArrayList<Integer>();
    }

    public void GetValue(){
        System.out.print("Nhập Số lượng phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            this.arrayList.add(sc.nextInt());
        }
    }

    public void SortUp(){
        Collections.sort(this.arrayList);
    }

    public void SortDown(){
        Collections.sort(this.arrayList);
        Collections.reverse(this.arrayList);
    }

    public void PrintArray(){
        for (int i = 0; i < this.arrayList.size() ; i++) {
            System.out.print(this.arrayList.get(i).toString()+" ");
        }
    }
    

    public static void main(String[] args) {
        Array_value arr = new Array_value();
        arr.GetValue();

        System.out.println("Xap xep tang");
        arr.SortUp();
        arr.PrintArray();

        System.out.println("\nXap xep Giam");
        arr.SortDown();
        arr.PrintArray();
    }
}