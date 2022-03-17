package tuan5.buoi9.baitapquanlikhachsan;

import java.util.Scanner;

public class HoaDon {
    protected String CodeBill;
    protected String Days;
    protected String Name;
    protected String NumberRoom;
    protected Double Price;
    protected Double Bill;

Scanner input = new Scanner(System.in);

protected HoaDon(){
}

protected HoaDon(String CodeBill,String Days,String Name,String NumberRoom,Double Price,Double Bill){
    this.CodeBill = CodeBill;
    this.Days = Days;
    this.Name = Name;
    this.NumberRoom = NumberRoom;
    this.Price = Price;
    this.Bill = Bill;

}

protected String getCodeBill(){
    return CodeBill;
}

protected void setCodeBill(String CodeBill){
    this.CodeBill = CodeBill;
}

protected String getDays(){
    return Days;
}

protected void setDays(String Days){
    this.Days = Days;
}

protected String getName(){
    return Name;
}

protected void setName(String Name){
    this.Name = Name;
}

protected String getNumberRoom(){
    return NumberRoom;
}

protected void setNumberRoom(String NumberRoom){
    this.NumberRoom = NumberRoom;
}

protected Double getPrice(){
    return Price;
}

protected void setPrice(Double Price){
    this.Price = Price;
}

protected void nhap(){
    System.out.println(" nhap ma hoa don");
    CodeBill = input.nextLine();
    System.out.println(" nhap ngay");
    Days = input.nextLine();
    System.out.println(" nhap ten khach hang");
    Name = input.nextLine();
    System.out.println(" nhap so phong ");
    NumberRoom = input.nextLine();
    System.out.println(" nhap don gia ");
    Price = input.nextDouble();
}

public String toString(){
    String result = " ma hoa don " + getCodeBill() + " ngay hoa don " + getDays()+ " ten khach hang " +  getName() + " so phong " + getNumberRoom()+ " don gia " + getPrice();
    return result;
}
    } 
