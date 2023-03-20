
import java.util.Scanner;

 class ChuyenXe{
    protected int MaSoChuyen;
    protected String HoTenTaiXe;
    protected int SoXe;
    protected long DoanhThu;

    public ChuyenXe(){
        super();
    }

    public ChuyenXe(int MaSoChuyen, String HotenTaiXe, int SoXe, long DoanhThu){
        super();
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HotenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    } 

    public int getMaSoChuyen(){
        return this.MaSoChuyen;
    }
    // public void setMaSoChuyen(int MaSoChuyen){
    //     this.MaSoChuyen = MaSoChuyen;
    // }

    public String getHoTenTaiXe(){
        return this.HoTenTaiXe;
    }
    // public void setHoTenTaiXe(){
    //     this.HoTenTaiXe = HoTenTaiXe;
    // }

    public int getSoXe(){
        return this.SoXe;
    }
    // public void setSoXe(){
    //     this.SoXe = SoXe;
    // }

    public long getDoanhThu(){
        return this.DoanhThu;
    }
}
 class ChuyenXeNoiThanh extends ChuyenXe{
    protected int SoTuyen;
    protected float SokmDiDuoc;

    public ChuyenXeNoiThanh(int MaSoChuyen, String HotenTaiXe, int SoXe, long DoanhThu, int SoTuyen, float SokmDiDuoc){
        super(MaSoChuyen, HotenTaiXe, SoXe, DoanhThu);
        this.SoTuyen = SoTuyen;
        this.SokmDiDuoc = SokmDiDuoc;
    }

    @Override
    public long  getDoanhThu(){
        return this.DoanhThu;
    }
}
 class ChuyenXeNgoaiThanh extends ChuyenXe {
    protected String NoiDen;
    protected int SoNgayDiDuoc;

    public ChuyenXeNgoaiThanh(){

    }

    public ChuyenXeNgoaiThanh(int MaSoChuyen, String HotenTaiXe, int SoXe, long DoanhThu, String NoiDen, int SoNgayDiDuoc){
        super(MaSoChuyen, HotenTaiXe, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SoNgayDiDuoc = SoNgayDiDuoc;
    }

    @Override
    public long getDoanhThu(){
        return this.DoanhThu;
    }
}
 class Main {
    public static void main(String[] args){
        
   ChuyenXe cx = new ChuyenXe();
   System.out.println("Doanh thu chuyen xe: " +cx.getDoanhThu());

   ChuyenXeNoiThanh cxnt = new ChuyenXeNoiThanh(01, "tuanhao", 01, 50000000, 5, 200);
   System.out.println("Doanh thu cua chuyen xe noi thanh: " +cxnt.getDoanhThu());

   ChuyenXeNgoaiThanh cxngt = new ChuyenXeNgoaiThanh(02,"tuanhao",05,100000000,"angiang",3);
   System.out.println("Doanh thu cua chuyen xe nogoai thanh: " +cxngt.getDoanhThu());
   
    }
}