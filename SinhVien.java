package btlab1th;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoTen,diaChi;
    private String SDT;
    ArrayList<SinhVien>sv;
            
    
    public SinhVien()
    {
         sv = new ArrayList<>();
    }
    public SinhVien(String maSinhVien, String hoTen, String diaChi, String SDT)
    {
        this.maSinhVien= maSinhVien;
        this.hoTen= hoTen  ;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }
    public String getMaSinhVien() { 
        return maSinhVien; 
    } 
     
    public void setMaSinhVien(String maSinhVien  ) 
    { 
        this.maSinhVien = maSinhVien; 
    }
    public String getHoTen() { 
        return hoTen; 
    } 
     
    public void setHoTen(String hoTen  ) 
    { 
        this.hoTen = hoTen; 
    }
    public String getDiaChi() { 
        return diaChi; 
    } 
     
    public void setDiaChi(String diaChi  ) 
    { 
        this.diaChi = diaChi; 
    }
    public String getSDT() { 
        return SDT; 
    } 
     
    public void setSDT(String SDT  ) 
    { 
        this.SDT = SDT; 
    }
    @Override
    public String toString(){
        return "maSinhVien:"+ maSinhVien+"hoTen:"+hoTen+"diaChi:"+diaChi+"SDT:"+SDT;
    }

    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("MaSV");
        maSinhVien=sc.nextLine();
        System.out.println("\nHo Ten");
        hoTen=sc.nextLine();
        System.out.println("\nDia Chi");
        diaChi=sc.nextLine();
        System.out.println("\nSDT 9 so");
        SDT=sc.nextLine();


    }
    public void hien()
    {
        System.out.println(""+getMaSinhVien()+"       " +getHoTen()+ "             "+getDiaChi()+ "           "+getSDT());
    }
    public void nhapSinhVien(SinhVien a) {         
        Scanner sc = new Scanner(System.in);         
        System.out.print("Số lượng sinh vien cần thêm: "); 
        int n = sc.nextInt();         
        for (int i = 0; i < n; i++) { 
            System.out.println("Nhập sinh vien thứ " + (i + 1) + ": ");
            a.nhap();
            sv.add(a);
}
    }

    public void menuChinh() { 
        System.out.println("ban muon lam gi"); 
        System.out.println("1. Nhập thong tin sinh vien"); 
        System.out.println("2. Xuat ban danh sach sinh vien"); 
        System.out.println("Nhấn phím 0 để thoát"); 
    }
    public void xuatDSSinhVien(SinhVien a) { 
        System.out.println("Ma sv            ho va ten                   dia chi           SDT");         
            for (SinhVien x : sv) {             
                if (x instanceof SinhVien) {                 
                    x.hien(); 
            } 
        } 
    }
}
