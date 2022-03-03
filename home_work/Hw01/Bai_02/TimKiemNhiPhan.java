package Bai_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TimKiemNhiPhan {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Integer> arr;
    
    public TimKiemNhiPhan(){
        this.arr = new ArrayList<Integer>();
    }
    
    public void NhapGiaTri(){
        System.out.print("Nhap So Luong Phan Tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            this.arr.add(sc.nextInt());
        }
        Collections.sort(this.arr);
    }
    
    private int binarySearch(int x) {
        int l = 0, r = this.arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (this.arr.get(m) == x)
                return m;

            if (this.arr.get(m) < x)
                l = m + 1;

            else
                r = m - 1;
        }
        return -1;
    }

    public void binarySearchAleart(){
        System.out.print("Giai Tri Can Tim: ");
        int x = sc.nextInt();

        int index = binarySearch(x);
        if (index == -1){
            System.out.println("Phan Tu Tim Kiem Khong Ton Tai");
        }else{
            System.out.println("Phan Tu "+x+" Duoc tim thay o vi tri: "+index);
        }
    }

    public static void main(String args[]) {
        TimKiemNhiPhan value = new TimKiemNhiPhan();
        value.NhapGiaTri();
        value.binarySearchAleart();
        
    }
}
