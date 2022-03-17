package tuan5.buoi9.baitapquanlikhachsan;

public class HoaDonTheoGio extends HoaDon{
    
    protected int RenOfHours;

    public HoaDonTheoGio(){
    }

    public HoaDonTheoGio(String CodeBill,String Days,String Name,String NumberRoom,Double Price,Double Bill,int RenOfHours){
        super(CodeBill,Days,Name,NumberRoom,Price,Bill);
        this.RenOfHours = RenOfHours;
    }
    

    protected int getRenOfHours(){
        return RenOfHours;
    }
    
    protected void setRenOfHours(int RenOfHours){
        this.RenOfHours = RenOfHours;
    }

    
    protected void nhap(){
        super.nhap();
        System.out.println(" nhap so gio");
        RenOfHours = input.nextInt();
    }

    public Double Tinhtien(){
        if(RenOfHours <= 24){
           return this.Bill = getRenOfHours() * getPrice();
        }else if(RenOfHours > 24 && RenOfHours < 30 ){
           return this.Bill = 24 * getPrice();
        }else{
            System.out.println(" khong the su dung hoa don nay de tinh tien ");
            return this.Bill;
        }        
    }

    public String toString(){
        String result = super.toString() + " so gio thue " + getRenOfHours() + " gia tien " + Tinhtien() ;
        return result;
    }

}
