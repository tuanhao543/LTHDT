
    public doan() {
    
import java.io.Serializable; 
import java.util.Scanner;

public class DienThoai extends Serializable {
        private Double soSeri, giaBan;
        private String mauSac, heDieuHanh, thongSoKT;
    public DienThoai()
    {

    }
    public DienThoai(Double soSeri, String mauSac, Double giaBan, String heDieuHanh, String thongSoKT)
    {
        this.soSeri= soSeri;
        this.mauSac= mauSac;
        this.giaBan= giaBan;
        this.heDieuHanh= heDieuHanh;
        this.thongSoKT= thongSoKT;
    }
    
    public String getSoSeri() { 
        return soSeri; 
    } 
 
    public void setSoSeri(Double soSeri) { 
        this.soSeri = soSeri; 
    } 
    
    public String getMauSac() { 
        return mauSac; 
    } 
 
    public void setMauSac(String mauSac  ) { 
        this.mauSac = mauSac; 
    } 
    public String getGiaBan() { 
        return giaBan; 
    } 
 
    public void setGiaBan(Double giaBan ) { 
        this.giaBan = giaBan; 
    } 
    public String getHeDieuHanh() { 
        return heDieuHanh; 
    } 
 
    public void setHeDieuHanh(String heDieuHanh ) { 
        this.heDieuHanh = heDieuHanh; 
    } 
    public String getThongSoKT() { 
        return thongSoKT; 
    } 
 
    public void setThongSoKT(String thongSoKT ) { 
        this.thongSoKT = thongSoKT; 
    }
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Số Seri");
        soSeri=sc.nextLine();
        System.out.println("Màu Sắc");
        mauSac=sc.nextLine();
        System.out.println("Giá Bán");
        giaBan=sc.nextLine();
        System.out.println("Hệ Điều Hành");
        heDieuHanh=sc.nextLine();
        System.out.println("Thông Số Kỹ Thuật");
        thongSoKT=sc.nextLine();

    }
    public void hien()
    {
        System.out.println("\nSố Seri:"+ getSoSeri()+"\nMàu Sắc:"+ getMauSac()+"\nGiá Bán"+ getGiaBan()+"\nHệ Điều Hành:"+ getHeDieuHanh()+"\nThông Số Kỹ Thuật:"+ getThongSoKT());
    }
}    }
public class DienThoaiDiDong extends DienThoai{
    private String loaiBanPhim;

    public DienThoaiDiDong(){

    }
    public DienThoaiDiDong(String loaiBanPhim){
        super(soSeri,mauSac,giaBan,heDieuHanh,thongSoKT);
        this.loaiBanPhim= loaiBanPhim;
    }  
    public String getLoaiBanPhim(){
        return loaiBanPhim;
    }
    public void setLoaiBanPhim(){
        this.loaiBanPhim= loaiBanPhim;
    }
    @Override
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("Loai Ban Phim");
        loaiBanPhim= sc.nextLine();
    }
    @Override
    public void hien(){
        super.hien();
        System.out.println("\nloaiBanPhim:"+ getLoaiBanPhim());
        henDSHangTon();
    }
    public void nhapDSHangTon(){
        Scanner sc= new Scanner(System.in);
        System.out,println("nhap them hang ton: ");

    }
    public void hienThongTinDienThoaiDiDong(){
        super.hien();
        System.out.println("\nSố Seri:"+ getSoSeri()+"\nMàu Sắc:"+ getMauSac()+"\nGiá Bán"+ getGiaBan()+"\nHệ Điều Hành:"+ getHeDieuHanh()+"\nThông Số Kỹ Thuật:"+ getThongSoKT()+"\nloaiBanPhim"+ getLoaiBanPhim());
    }
}

public class DienThoaiThongMinh extends DienThoai{
        private String loaiManHinh, Camera, loaiTanNhiet, tinhNangDacBiet;
    
    public DienThoaiThongMinh(){

    }
    public DienThoaiThongMinh(String loaiManHinh, String Camera, String loaiTanNhiet, String tinhNangDacBiet){
        super(soSeri, mauSac, giaBan, heDieuHanh, thongSoKT)
        this.loaiManHinh= loaiManHinh;
        this.Camera= Camera;
        this.loaiTanNhiet= loaiTanNhiet;
        this.tinhNangDacBiet= tinhNangDacBiet;
    }
    public String getLoaiManHinh(){
        return loaiManHinh;
    }
    public void setLoaiManHinh(){
        this.loaiManHinh= loaiManHinh;
    }
    public String getCamera(){
        return Camera;
    }
    public void setCamera(){
        this.Camera= Camera;
    }
    public String getLoaiTanNhiet(){
        return loaiTanNhiet;
    }
    public void setLoaiTanNhiet(){
        this.loaiTanNhiet= loaiTanNhiet;
    }
    public String getTinhNangDacBiet(){
        return tinhNangDacBiet;
    }
    public void setTinhNangDacBiet(){
        this.tinhNangDacBiet= tinhNangDacBiet;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Loai Man Hinh");
        loaiManHinh= sc.nextLine();
        System.out.println("Camera");
        Camera= sc.nextLine();
        System.out.println("Loai Tan Nhiet");
        loaiTanNhiet= sc.nextLine();
        System.out.println("Tinh Nang Dac Biet");
        tinhNangDacBiet= sc.nextLine();
    }
    @Override
    public void hien()
    {
        super.hien();
        System.out.println("\nloaiManHinh:"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\loaiTanNhiet"+ getLoaiTanNhiet()+"\ntinhNangDacBiet"+ getTinhNangDacBiet());
    }
    public void nhapDSHangTon(){

    }
    public void hienDSHangTon(){

    }
    public void hienThongTinDienThoaiThongMinh(){
        System.out.println("\nSố Seri:"+ getSoSeri()+"\nMàu Sắc:"+ getMauSac()+"\nGiá Bán"+ getGiaBan()+"\nHệ Điều Hành:"+ getHeDieuHanh()+"\nThông Số Kỹ Thuật:"+ getThongSoKT()+ "\nloaiManHinh"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\nloaiTanNhiet"+ getLoaiTanNhiet()+"\ntinhNangDacBiet"+ getTinhNangDacBiet());
    }
}
    public class HangTon
