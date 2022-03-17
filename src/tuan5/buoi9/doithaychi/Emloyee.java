package tuan5.buoi9.baitapchuaxong.em_muon_di_bien;


public class Emloyee extends Person {
    
    private double HeSoLuong;
    private double Luong;
    public Emloyee(){

    }

    public Emloyee(String HoTen , String DiaChi , double HeSoLuong ,double Luong ){
        super();
        this.HeSoLuong = HeSoLuong;
        this.Luong = Luong;

    }

    public void setHeSoLuong(double HeSoLuong){
        this.HeSoLuong = HeSoLuong;
    }

    public double getHeSoLuong(){
        return HeSoLuong;
    }

    public void setLuong(double Luong){
        this.Luong = Luong;
    }

    public double getLuong(){
        return Luong;
    }
    
    public void nhap(){
        System.out.println("  nhap ten nhan vien            ");
        HoTen = in.nextLine();
        System.out.println("  nhap dia chi nhan vien         ");
        DiaChi = in.nextLine();
        System.out.println("  nhap he so luong               ");
        HeSoLuong = in.nextDouble();

    }

    
    public double TinhLuong(){
        return this.Luong = this.HeSoLuong * 30;
    }

    @Override
    public String toString() {
        String result = " ten nhan vien " + HoTen + " dia chi nhan vien " + DiaChi + " he so luong  " + TinhLuong();
        return result;
    }
}