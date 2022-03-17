package tuan5.buoi9.baitapquanlikhachsan;

import java.util.Scanner;

public class MainHoaDon {    
    public static void main(String[] args) {
    ListHoaDon lhd = new ListHoaDon();
    Scanner scanner = new Scanner(System.in);
    int key;
    do {
        System.out.println("=====================MENU======================");
        System.out.println(">>1. them hoa don theo gio ");
        System.out.println(">>2. them hoa don theo ngay ");
        System.out.println(">>3. hien thi danh sach hoa don");
        System.out.println(">>4. hien thi tong so luong cua cac hoa don ");
        System.out.println(">>5.  ");
        System.out.println(">>0. Exit. ");
        System.out.println("===============================================");
        System.out.print("Chọn chức năng: ");
        key = scanner.nextInt();
        switch(key){
            case 1: 
            lhd.ThemHD(1);
                break;
            case 2:
            lhd.ThemHD(2);
                break;
            case 3:
            lhd.HienThiHoaDon();
                break;
            case 4:
            lhd.Tongsoluong();
                break;
            case 5:
                break;
        }
}while(key!=0);
    System.out.println("");
}
}

