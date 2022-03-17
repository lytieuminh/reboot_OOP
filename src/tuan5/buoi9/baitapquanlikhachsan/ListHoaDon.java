package tuan5.buoi9.baitapquanlikhachsan;


public class ListHoaDon {
    HoaDon hd[] = new HoaDon[100];
    private int CountHD, sum1 = 0 , sum2 = 0;

    public ListHoaDon()
    {
        CountHD = 0;
        for(int i =  0; i<100 ; i++)
            hd[i] = new HoaDon();
    }

    public void ThemHD( int temp)
    {
        if( CountHD > 100)
            System.out.println(" khong the chua them hoa don");
    else
    {
        if ( temp ==1)
        {
            hd[CountHD] = new HoaDon();
            HoaDonTheoGio hdtg = new HoaDonTheoGio();
            hdtg.nhap();
            hdtg.Bill=hdtg.Tinhtien();
            hd[CountHD] = hdtg;
            sum1++;
        }else{
            hd[CountHD] = new HoaDon();
            HoaDonTheoNgay hdtd = new HoaDonTheoNgay();
            hdtd.nhap();
            hdtd.Bill=hdtd.Tinhtien();
            hd[CountHD] = hdtd;
            sum2++;    
            }
            CountHD++;
        }
    }


    public void HienThiHoaDon(){
        for ( int i = 0 ; i<CountHD; i++){
            System.out.println("\n Hoa don thu " + (i+1));
            System.out.println(hd[i].toString());
        }
    }

    public void Tongsoluong(){
        System.out.println(" Tong so luong phong theo gio trong danh sach la " + sum1);
        System.out.println(" tong so luong phong theo ngay trong danh sach la" + sum2);
        }
}



