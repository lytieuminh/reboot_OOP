package tuan5.buoi9.baitapquanlikhachsan;

public class HoaDonTheoNgay extends HoaDon {
    protected int RenOfDays;

    public HoaDonTheoNgay(){
    }

    public HoaDonTheoNgay(String CodeBill,String Days,String Name,String NumberRoom,Double Price,Double Bill,int RenOfDays){
        super(CodeBill,Days,Name,NumberRoom,Price,Bill);
        this.RenOfDays = RenOfDays;
    }
    

    protected int getRenOfDays(){
        return RenOfDays;
    }
    
    protected void setRenOfDays(int RenOfDays){
        this.RenOfDays = RenOfDays;
    }

    
    protected void nhap(){
        super.nhap();
        System.out.println(" nhap so ngay");
        RenOfDays = input.nextInt();
    }

    public double Tinhtien(){
        if( RenOfDays <= 7 ){
            return this.Bill = this.RenOfDays * this.Price;
        }else{ 
            return this.Bill = ( 7 * this.Price) + (( (this.RenOfDays - 7 ) * this.Price) * 0.8 ) ;
        }
            
    }

    public String toString(){
        String result = super.toString() + " so ngay cho thue" + getRenOfDays() + " gia tien " + Tinhtien();
        return result;
    }

}

