package tuan5.buoi9.baitapchuaxong.em_muon_di_bien;

import java.util.Scanner;

public abstract class Person {
    protected String HoTen;
    protected String DiaChi;

    Scanner in = new Scanner(System.in);

    protected Person(){

    }

    protected Person(String HoTen , String DiaChi ){
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        
    }
    protected void setHoTen(String HoTen){
        this.HoTen = HoTen;
    }

    protected String getHoTen(){
        return HoTen;
    }
    
    protected void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }

    protected String getDiaChi(){
        return DiaChi;
    }

    protected abstract void nhap();


    public abstract String toString();

}
