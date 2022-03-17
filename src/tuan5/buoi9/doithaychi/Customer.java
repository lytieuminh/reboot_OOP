package tuan5.buoi9.baitapchuaxong.em_muon_di_bien;

import java.util.Scanner;

public class Customer extends Person {
    
    private String TenCongTy;
    private int DanhGia;
    protected Double TriGiaHD;
    Scanner in = new Scanner(System.in);

    public Customer(){

    }

    public Customer(String TenCongTy , int DanhGia , Double TriGiaHD){
        super();
        this.TenCongTy = TenCongTy;
        this.DanhGia = DanhGia;
        this.TriGiaHD = TriGiaHD;
  
    }

    public void seta(String TenCongTy){
        this.TenCongTy = TenCongTy;
    }

    protected String geta(){
        return TenCongTy;
    }
    
    protected void setDanhGia(int DanhGia){
        this.DanhGia = DanhGia;
    }

    protected int getDanhGia(){
        return DanhGia;
    }

    protected void setTriGiaHD(Double TriGiaHD){
        this.TriGiaHD = TriGiaHD;
    }
    
    protected Double getTriGiaHD(){
        return TriGiaHD;
    }


    protected void nhap(){
        System.out.println("  Ho ten khach hang                  ");
        HoTen = in.nextLine();
        System.out.println("  Dia chi khach hang                 ");
        DiaChi = in.nextLine();
        System.out.println("  Ten cong ty khach hang             ");
        TenCongTy = in.nextLine();
        System.out.println("  Nhap Danh Gia Cong Ty              ");
        System.out.println("  1: Cong ty loai A                  ");
        System.out.println("  2: Cong ty loai B                  ");
        System.out.println("  3; Cong ty loai C                  ");
        DanhGia = in.nextInt();
        System.out.println("  Nhap Gia tri hop dong              ");
        TriGiaHD = in.nextDouble();

    }

    public String toString()
    {
        String select;
        if( DanhGia == 1)
        {
            select = " A ";
        }else if ( DanhGia == 2)
        {
            select = " B";
        }else if ( DanhGia == 3)
        {
            select = " C ";
        }else
        {
            select = " ban nhap sai de danh gia cong ty ";
        }
        String result = " ten khach hang " + HoTen + " Dia chi khach hang " + DiaChi + " Ten cong ty khach hang " + TenCongTy + " Cong ty loai : " + select +" Nhap Gia tri hop dong " + TriGiaHD;
        return result;
    }

}
