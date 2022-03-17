package tuan5.buoi9.baitapchuaxong.em_muon_di_bien;

public class Student extends Person {

    private double mon1;
    private double mon2;
    private double DTB;
    public Student (){

    }

    public Student(String HoTen , String DiaChi,double mon1 ,double mon2,double DTB){
        super();
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.DTB = DTB;
    }

    protected void setmon1(double mon1){
        this.mon1 = mon1;
    }

    protected double getmon1(){
        return mon1;
    }
    
    protected void setmon2(double mon2){
        this.mon2 = mon2;
    }

    protected double getmon2(){
        return mon2;
    }

    protected void setDTB(double DTB){
        this.DTB = DTB;
    }

    protected double getDTB(){
        return DTB;
    }



    public void nhap(){
        System.out.println("  nhap ten hoc sinh             ");
        HoTen = in.nextLine();
        System.out.println("  nhap dia chi hoc sinh         ");
        DiaChi = in.nextLine();
        System.out.println("  nhap diem mon hoc 1           ");
        mon1 = in.nextDouble();
        System.out.println("  nhap diem mon hoc 2           ");
        mon2 = in.nextDouble();
        
    }

    public double diemTB(){
        return this.DTB = ( this.mon1 + this.mon2) / 2 ;
    }

    public String DanhGia(){
        if(DTB > 5 && DTB < 7){
            return  "hoc sinh TB";
        }else if(DTB > 7 && DTB < 9) {
            return  "hoc sinh kha";
        }else if (DTB >= 9 && DTB < 10)
            return  "hoc sinh gioi";
        else{
            return  " hoc lai em nhe ! :3 ";
    }
 }
    public String toString() {
        String result = " ten hoc sinh" + HoTen + " dia chi hoc sinh" + DiaChi + " diem mon 1 " + mon1 + " diem mon 2 " + mon2 + " diem TB " + diemTB() + " danh gia " + DanhGia() ;
        return result;
    }
    
}
