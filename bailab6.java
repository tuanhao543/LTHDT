import java.util.Scanner;
public class bailab6{
 class HocSinh 

{
    protected String hoTen;
    protected String lop;
    protected double toan;
    protected double ly;
    protected double hoa;
    
    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) 
    {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double tinhDiemTrungBinh() 
    {
        return (toan + ly + hoa) / 3;
    }
}

 class HocSinhChuyenToan extends HocSinh
{
    public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) 
    {
        super(hoTen, lop, toan, ly, hoa);
    }
    
    @Override
    public double tinhDiemTrungBinh() 
    {
        return (toan * 2 + ly + hoa) / 4;
    }
        
 class main{
    public static void main (string [] args){
        HocSinh myHocSinh = new HocSinh();
        HocSinh myHocSinhChuyenToan = new HocSinhChuyenToan();
        myHocSinhChuyenToan.tinhDiemTrungBinh();
        System.out.println("haha");

        }

    }
    }
}
