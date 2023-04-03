
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
        System.out.println("So Seri");
        soSeri=sc.nextDouble();
        System.out.println("Mau Sac");
        mauSac=sc.nextLine();
        System.out.println("Gia Ban");
        giaBan=sc.nextDouble();
        System.out.println("He Đieu Hanh");
        heDieuHanh=sc.nextLine();
        System.out.println("Thong So Ky Thuat");
        thongSoKT=sc.nextLine();

    }
    public void hien()
    {
        System.out.println("\nSo Seri:"+ getSoSeri()+"\nMau Sac:"+ getMauSac()+"\nGia Ban"+ getGiaBan()+"\nHe Đieu Hanh:"+ getHeDieuHanh()+"\nThong So Ky Thuat:"+ getThongSoKT());
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
        System.out.println("\nSo Seri:"+ getSoSeri()+"\nMau Sac:"+ getMauSac()+"\nGia Ban"+ getGiaBan()+"\nHe Đieu Hanh:"+ getHeDieuHanh()+"\nThong So Ky Thuat:"+ getThongSoKT()+"\nLoai Ban Phim"+ getLoaiBanPhim());
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
        System.out.println("\nLoai Man Hinh:"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\nLoai Tan Nhiet"+ getLoaiTanNhiet()+"\nTinh Nang Dac Biet"+ getTinhNangDacBiet());
    }
    public void nhapDSHangTon(){

    }
    public void hienDSHangTon(){

    }
    public void hienThongTinDienThoaiThongMinh(){
        System.out.println("\nSo Seri:"+ getSoSeri()+"\nMau Sac:"+ getMauSac()+"\nGia Ban"+ getGiaBan()+"\nHe Đieu Hanh:"+ getHeDieuHanh()+"\nThong So Ky Thuat:"+ getThongSoKT()+ "\nLoai Man Hinh"+ getLoaiManHinh()+"\nCamera"+ getCamera()+"\nLoai Tan Nhiet"+ getLoaiTanNhiet()+"\nTinh Nang Dac Biet"+ getTinhNangDacBiet());
    }
}
public class HangTon{
        private Double maDienThoaiTon, soLuong;
        private String ngayNhapKho, ngayXuatKho;
    public HangTon(){

    }
    public HangTon(Double soLuong, Double maDienThoaiTon, String ngayNhapKho, String ngayXuatKho){
        this.soLuong= soLuong;
        this.maDienThoaiTon= maDienThoaiTon;
        this.ngayNhapKho= ngayNhapKho;
        this.ngayXuatKho= ngayXuatKho

    }    
    public Double getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(Double soLuong){
        this.soLuong=soLuong;
    }
    public Double getMaDienThoaiTon(){
        return maLoaiDienThoaiTon;
    }
    public void setMaDienThoaiTon(Double maDienThoaiTon){
        this.maDienThoaiTon= maDienThoaiTon;
    }
    public String getNgayNhapKho(){
        return ngayNhapKho;
    }
    public void setNgayNhapKho(String ngayNhapKho){
        this.ngayNhapKho=ngayNhapKho;  
    }
    public String getNgayXuatKho(){
        return ngayXuatKho;
    }
    public void setNgayXuatKho(String ngayXuatKho){
        this.ngayXuatKho=ngayXuatKho;
    }
    public void nhapHangTon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma Dien Thoai Ton: ");
        maLoaiDienThoaiTon = sc.nextDouble();
        System.out.println("So Luong: ");
        soLuong = sc.nextDouble();
        System.out.println("Ngay Nhap Kho: ");
        ngayNhapKho = sc.nextLine;
        System.out.println("Ngay Xuat Kho");
        ngayXuatKho = sc.nextLine();
    }
    public void hienHangTon(){
        System.out.println("\nMa Dien Thoai Ton:"+getMaDienThoaiTon()+"\nSo Luong"+getSoLuong()+"\nNgay Nhap Kho"+getNgayNhapKho()+"\nNgay Xuat Kho"+getNgayXuatKho())
    }

    }

    public class SapXep implements Comparator<HangTon>{
        @Override
        public int compare(HangTon h1, HangTon h2){
            return h1.getSoLuong - h2.getSoLuong
        }
    }

    public class DSDienThoai{
        ArrayList<DienThoai>phone;
        public DSDienThoai(){
            phone = new ArrayList<>();
        }
        public void them DSDienThoai(DienThoai h){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap So Luong Dien Thoai Can Them: ");
            int n = sc.nextInt();
            for (int i=0; i<n; i++){
                System.out.println("Nhap Dien Thoai Thu"+(i+1)+":");
                h.nhap();
                phone.add(h);
            }
        }
        public void menuSuaDoi(){
            System.out.println("------------- Moi lua chon -----------"); 
            System.out.println("1. Sua thong tin dien thoai di dong"); 
            System.out.println("2. Xoa dien thoai di dong"); 
            System.out.println("3. Sua thong tin dien thoai thong minh"); 
            System.out.println("4. Xoa dien thoai thong minh"); 
            System.out.println("5. Sua hang ton"); 
            System.out.println("6. Them hang ton"); 
            System.out.println("7. X0a hang ton"); 
            System.out.println("----------- Chon so 0 đe thoat ----------");
        }
        public void SuaDoi(){
            Scanner sc = new Scanner(System.in);
            int n;
            do{
                menuSuaDoi();
                System.out.println("Chon:");
                n = sc.nextInt();
                switch (n){
                    case 1:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai di dong can sua:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        suaDienThoaiDiDong(seri);
                        break;
                    }
                    case 2:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai di dong can xoa:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        xoaDienThoaiDiDong(seri);
                        break;
                    }
                    case 3:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai thong minh can sua:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        suaDienThoaiThongMinh(seri);
                        break;
                    }
                    case 4:{
                        Double seri;
                        System.out.println("Nhap so seri cua dien thoai thong minh can xoa:");
                        sc.nextDouble();
                        seri = sc.nextDouble();
                        xoaDienThoaiThongMinh(seri);
                        break;
                    }
                    case 5:{
                        System.out.println("Nhap so seri cua dien thoai:");
                        sc.nextDouble();
                        Double seri = sc.nextDouble();
                        System.out.println("Nhap ma loai dien thoai ton:");
                        Double maDienThoaiTon = sc.nextDouble();
                        suaHangTon(maDienThoaiTon, seri);
                        break;
                    }
                    case 6:{
                        System.out.println("Nhap so seri cua dien thoai:");
                        sc.nextDouble();
                        Double seri = sc.nextDouble();
                        themHangTon(maDienThoaiTon, seri);
                        break;
                    }
                    case 7:{
                        System.out.println("Nhap so seri cua dien thoai:");
                        sc.nextDouble();
                        Double seri = sc.nextDouble();
                        System.out.println("Nhap ma loai dien thoai ton:");
                        Double maDienThoaiTon = sc.nextDouble();
                        xoaHangTon(maDienThoaiTon, seri);
                        break;
                    }
                    default;
                break;
                }
            }
            while(n!=0);
        }
        public void suaHangTon(Double maDienThoaiTon, seri){
            for(DienThoai x : phone){
                if(((DienThoai)x).getSoSeri().compareTo(seri)==0){
                    for(int i=0; i<((DienThoai)x).getMaDienThoaiTon().size();i++){
                        if((())){
                            (());
                        }
                    }
                }
            }
        }
        public void xoaHangTon(Double maDienThoaiTon, Double seri) {         
            for (DienThoai x : phone) { 
                if ((() x).get().compareTo() == 0) { 
 
                for (int i = 0; i < (() x).get().size(); i++) {                    
                     if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) { 
                        (() x).get().remove(i); 
                        } 
                    } 
                } 
            } 
        }
        public void themHangTon(Double seri) { 
            for (DienThoai x : phone) {             if (x instanceof ThiSinh) { 
                (() x).nhapDSHangTon(); 
                } 
            } 
        }
        public void suaDienThoaiDiDong(Doublen seri) {         
            for (DienThoai x : phone) {             
                if (x instanceof ThiSinh) { 
                    if (((DienThoaiDiDong) x).getSoSeri().compareTo(seri) == 0) { 
                        x.nhap(); 
                    } 
                } 
            } 
        }
        public void xoaThiSinh(String sbd) {         
            for (Nguoi x : person) {             
                if (x instanceof ThiSinh) { 
                    if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) {                     
                        person.remove(x); 
                    } 
                } 
            } 
        } 
 
    public void suaGiamThi(String maGT) { 
        for (Nguoi x : person) {             if (x instanceof GiamThi) { 
                if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) { 
                    x.nhap(); 
                } 
            } 
        } 
    } 
 
    public void xoaGiamThi(String maGT) { 
        for (Nguoi x : person) {             
            if (x instanceof GiamThi) { 
                if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) {                     
                    person.remove(x); 
                } 
            } 
        } 
    } 
 
    public void hienDSGiamThi(Nguoi a) { 
        System.out.println("----------------------------------------------");          
            for (Nguoi x : person) { 
                if (x instanceof GiamThi) {                 
                    x.hien(); 
            } 
        } 
    } 
 
    public void hienDS(Nguoi a) { 
        System.out.println("----------------------------------------------");         
            for (Nguoi x : person) {             
                x.hien(); 
            } 
    } 
 
    public void hienDSThiSinh(Nguoi a) { 
        System.out.println("----------------------------------------------");         
            for (Nguoi x : person) {             
                if (x instanceof ThiSinh) {                 
                    x.hien(); 
            } 
        } 
    } 
    public void menuChinh() 
    { 
        System.out.println("------CHUONG TRINH QUAN LY KHO DIEN THOAI------"); 
        System.out.println("1. Nhập danh sách thí sinh và nguyện vọng của thí sinh"); 
        System.out.println("2. Nhập danh sách giám thị coi thi"); 
        System.out.println("3. Hiển thị danh sách các hồ sơ dự thi"); 
        System.out.println("4. Hiển thị danh sách các giám thị"); 
        System.out.println("5. Chỉnh sửa thông tin (Thí Sinh, Nguyện Vọng, Giám Thị)"); 
        System.out.println("6. Lưu file đã nhập"); 
        System.out.println("7. Đọc dữ liệu từ file"); 
        System.out.println("8. Hiện ra danh sách trúng tuyển( input: mà ngành, điểm chuẩn)"); 
        System.out.println("9. Sắp xếp danh sách trúng tuyển theo điểm thi giảm dần"); 
        System.out.println("10. Thống kê các giám thị công tác ở Hà Nội"); 
        System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----"); 
    } 
} 
    public class QuanLy{

    ArrayList<Nguoi> person; 
    ArrayList<ThiSinh> dsTrungTuyenNganh; 
    ArrayList<NguyenVong> nvTrungTuyen; 
 
    public QuanLy() { 
        person = new ArrayList<>(); 
    } 
 
    public void themDSNguoi(Nguoi a) {         
        Scanner sc = new Scanner(System.in);         
        System.out.print("Nhập số lượng cần thêm: "); 
        int n = sc.nextInt();         
        for (int i = 0; i < n; i++) { 
            System.out.println("Lần nhập thứ " + (i + 1) + ": ");             
            if (a instanceof ThiSinh) {                 
                a = new ThiSinh();                 
                a.nhap(); 
            } 
            else if (a instanceof GiamThi) {                 
                a = new GiamThi();                 
                a.nhap();             
                } 
            person.add(a); 
        } 
    } 
 
    public void menuSuaDoi(){
            System.out.println("------------- Moi lua chon -----------"); 
            System.out.println("1. Sua thong tin dien thoai di dong"); 
            System.out.println("2. Xoa dien thoai di dong"); 
            System.out.println("3. Sua thong tin dien thoai thong minh"); 
            System.out.println("4. Xoa dien thoai thong minh"); 
            System.out.println("5. Sua hang ton"); 
            System.out.println("6. Them hang ton"); 
            System.out.println("7. Xoa hang ton"); 
            System.out.println("----------- Chon so 0 đe thoat ----------");
        } 
 
    public void SuaDoi() { 
        Scanner sc = new Scanner(System.in);         
        int n; 
        do { 
            menuSuaDoi(); 
            System.out.print("Chọn: "); 
            n = sc.nextInt();             
            switch (n) {                 
                case 1: {                     
                    String sbd; 
                    System.out.print("Nhập SBD của thí sinh cần sửa: ");                     
                    sc.nextLine();                     
                    sbd = sc.nextLine();                     
                    suaThiSinh(sbd); 
                    break;                 
                    }                 
                    case 2: {                     
                        String sbd; 
                    System.out.print("Nhập SBD của thí sinh cần sửa: ");                     
                    sc.nextLine();                     
                    sbd = sc.nextLine();                     
                    xoaThiSinh(sbd); 
                    break;                 
                    }                 
                    case 3: {                     
                        String maGT; 
                    System.out.print("Nhập mã giám thị cần sửa thông tin: ");                     
                    sc.nextLine();                     
                    maGT = sc.nextLine(); 
                    suaGiamThi(maGT);                     
                    break;              
                    }                 
                    case 4: {                     
                        String maGT; 
                    System.out.print("Nhập mã giám thị cần sửa thông tin: ");                     
                    sc.nextLine();                     
                    maGT = sc.nextLine(); 
                    xoaGiamThi(maGT); 
                    break;                 
                    }                 
                    case 5: { 
                    System.out.println("Nhập SBD của thí sinh: ");                     
                    sc.nextLine(); 
                    String sbd = sc.nextLine(); 
                    System.out.println("Nhập mã nguyện vọng"); 
                    int maNv = sc.nextInt();                     
                    suaNguyenVong(maNv, sbd); 
                    break;                 
                    }                 
                    case 6: { 
                    System.out.println("Nhập SBD của thí sinh: ");                     
                    sc.nextLine(); 
                    String sbd = sc.nextLine(); 
                    themNguyenVong(sbd); 
                    break;                 
                    }                 
                    case 7: { 
                    System.out.println("Nhập SBD của thí sinh: ");                     
                    sc.nextLine(); 
                    String sbd = sc.nextLine(); 
                    System.out.println("Nhập mã nguyện vọng"); 
                    int maNv = sc.nextInt();                     
                    xoaNguyenVong(maNv, sbd);                     
                    break;                 
                    }                 
                    default:                     
                    break; 
            } 
 
        } 
        while (n != 0); 
    } 
 
    public void suaNguyenVong(int maNV, String sbd) {         
        for (Nguoi x : person) { 
            if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
                for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {                     
                    if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) { 
                        ((ThiSinh) x).getNv().get(i).nhapNguyenVong(); 
                    } 
                } 
            } 
        } 
    } 
 
    public void xoaNguyenVong(int maNV, String sbd) {         
        for (Nguoi x : person) { 
            if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
                for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {                     
                    if (((ThiSinh) x).getNv().get(i).getMaNv() == maNV) { 
                        ((ThiSinh) x).getNv().remove(i); 
                    } 
                } 
            } 
        } 
    } 
 
    public void themNguyenVong(String sbd) { 
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                ((ThiSinh) x).nhapDSNguyenVong(); 
            } 
        } 
    } 
 
    public void suaThiSinh(String sbd) {         
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
                    x.nhap(); 
                } 
            } 
        } 
    } 
 
    public void xoaThiSinh(String sbd) { 
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                if (((ThiSinh) x).getSBD().compareTo(sbd) == 0) { 
                    person.remove(x); 
                } 
            } 
        } 
    } 
 
    public void suaGiamThi(String maGT) { 
        for (Nguoi x : person) {             
            if (x instanceof GiamThi) { 
                if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) { 
                    x.nhap(); 
                } 
            } 
        } 
    } 
 
    public void xoaGiamThi(String maGT) { 
        for (Nguoi x : person) {             
            if (x instanceof GiamThi) { 
                if (((GiamThi) x).getMaGT().compareTo(maGT) == 0) {                     
                    person.remove(x); 
                } 
            } 
        } 
    } 
 
    public void hienDSGiamThi() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) { 
            if (x instanceof GiamThi) {                 
                x.hien(); 
            } 
        } 
    } 
 
    public void hienDS() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) {             
            x.hien(); 
        } 
    } 
 
    public void hienDSHoSoThiSinh() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                ((ThiSinh) x).hien(); 
            } 
        } 
    } 
 
    public void hienDSThiSinh() { 
        System.out.println("----------------------------------------------");         
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) {                 
                x.hien(); 
            } 
 
        } 
    } 
 
    public void ghiFile(String fileName) {         
        try { 
            FileOutputStream fileOut = new FileOutputStream(fileName);             
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);             
            objOut.flush();             
            objOut.writeObject(person); 
            objOut.close();             
            fileOut.close(); 
            System.out.println("Luu file thanh cong, ten file: " + fileName); 
        } 
        catch (Exception ex) { 
            ex.printStackTrace(); 
 
        } 
    } 
 
    public void docFile(String fileName) {         
        try { 
            person = new ArrayList<>(); 
            FileInputStream fin = new FileInputStream(fileName);             
            ObjectInputStream fout = new ObjectInputStream(fin); 
            person = (ArrayList) fout.readObject();             
            hienDS();             
            fin.close(); 
            fout.close(); 
 
        } catch (FileNotFoundException e) { 
            System.out.print("\nKhong thay file.\n"); 
        } 
        catch (Exception ex) {             
            ex.printStackTrace(); 
        } 
    } 
 
    public void hienDSTrungTuyen(String maNganh, float diemChuan) {         
        dsTrungTuyenNganh = new ArrayList<>();         
        nvTrungTuyen= new ArrayList<>(); 
        for (Nguoi x : person) {             
            if (x instanceof ThiSinh) { 
                for (int i = 0; i < ((ThiSinh) x).getNv().size(); i++) {                     
                    if (((ThiSinh) x).getNv().get(i).getMaNganh().compareTo(maNganh) == 0 && ((ThiSinh) x).getNv().get(i).getDiemXetTuyen() >= diemChuan) { 
                        ((ThiSinh) x).hienThongtinTS(); 
                        ((ThiSinh) x).getNv().get(i).hienNguyenVong();                         
                        dsTrungTuyenNganh.add((ThiSinh) x);                         
                        nvTrungTuyen.add(((ThiSinh) x).getNv().get(i)); 
                    } 
                } 
            } 
        } 
    } 
    public void hienDSTTNganh() 
    { 
        for(NguyenVong x: nvTrungTuyen) 
        { 
            x.hienNguyenVong(); 
        } 
    } 
    public void SapXepTheoDiem() 
    {    
        Collections.sort(nvTrungTuyen, new SapXepTheoDiemThi());         
        System.out.println("Danh sach trung tuyen sau khi sap xep");         
        hienDSTTNganh(); 
    } 
 
    public void hienGiamThioHaNoi() { 
        for (Nguoi x : person) {             
            if (x instanceof GiamThi && ((GiamThi) x).getQueQuan().equalsIgnoreCase("Ha Noi") == true) { 
                x.hien(); 
            } 
        } 
 
    } 
 
    public void menuChinh() { 
        System.out.println("------CHUONG TRINH QUAN LY KHO------"); 
        System.out.println("1. Nhap danh sach dien thoai di dong và hang ton cua dien thoai di dong"); 
        System.out.println("2. Nhập danh sách dien thoai thong minh va hang ton cua dien thoai thong minh "); 
        System.out.println("3. Hien thi danh sach cac dien thoai di dong"); 
        System.out.println("4. Hien thi danh sach cac dien thoai thong minh"); 
        System.out.println("5. Chinh sua thong tin (Dien Thoai Di Dong, Dien Thoai Thong Minh, Hang Ton)"); 
        System.out.println("6. Luu file đa nhap"); 
        System.out.println("7. Doc du lieu tu file"); 
        System.out.println("8. Hien ra danh sach ( input: mã ngành, điểm chuẩn)"); 
        System.out.println("9. Sắp xếp danh sách trúng tuyển theo điểm thi giảm dần( Sau khi chay chuc nang 8"); 
        System.out.println("10. Thống kê các giám thị quê quán ở Hà Nội"); 
        System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----"); 
    } 
} 
    public class Main {     
        public static void main(String[] args) {        
            QuanLy a= new QuanLy(); 
            Nguoi b;         int n; 
            Scanner sc= new Scanner(System.in); 
            do { 
                a.menuChinh();             
                System.out.print("Lựa chọn: "); 
                n= sc.nextInt(); 
                switch(n)             
                {                 
                    case 1: { 
                    b= new ThiSinh(); 
                    a.themDSNguoi(b); 
                    break;                 
                    }                 
                    case 2: { 
                    b= new GiamThi(); 
                    a.themDSNguoi(b); 
                    break;                 
                    }                 
                    case 3: { 
                    a.hienDSHoSoThiSinh(); 
                    break;                 
                    }                 
                    case 4: { 
                    a.hienDSGiamThi(); 
                    break; 
                    }                 
                case 5: { 
                    a.SuaDoi();                     
                    break;                 
                    }                 
                    case 6: { 
                    String tenfile; 
                    System.out.print("Nhập tên file muốn lưu: "); 
                    sc.nextLine();                     
                    tenfile = sc.nextLine();                     
                    a.ghiFile(tenfile); 
                    break;                 
                    }                 
                    case 7: { 
                    String tenfile; 
                    System.out.print("Nhập tên file muốn đọc: "); 
                    sc.nextLine();                     
                    tenfile = sc.nextLine();                     
                    a.docFile(tenfile); 
                    break;                 
                    }                 
                    case 8: { 
                    System.out.print("Nhập mã ngành: ");                     
                    sc.nextLine(); 
                    String maNganh = sc.nextLine();                     
                    System.out.print("Nhập điểm chuẩn: ");                     
                    float diemChuan = sc.nextFloat(); 
                    a.hienDSTrungTuyen(maNganh, diemChuan);                     
                    break;                 
                    }                 
                    case 9: { 
                    System.out.println("-------------------------------");                     
                    a.SapXepTheoDiem(); 
                    break; 
                    }                 
                    case 10: { 
                    a.hienGiamThioHaNoi(); 
                    break;                 }                 
                    default:                     
                    break; 
            } 
        } 
        while(n!=0); 
    } 
} 

    

     
