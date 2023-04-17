
package btlab1th;

import java.util.Scanner;


public class BTLAB1TH {

   
    public static void main(String[] args) {
            SinhVien a= new SinhVien(); 
            SinhVien b;         
            int n; 
            Scanner sc= new Scanner(System.in); 
            do { 
                a.menuChinh();              
                n= sc.nextInt(); 
                switch(n)             
                {                 
                    case 1: { 
                    b= new SinhVien(); 
                    a.nhapSinhVien(b); 
                    break;                 
                    }                 
                    case 2: { 
                    b= new SinhVien(); 
                    a.xuatDSSinhVien(b); 
                    break;                 
                    }                  
                    default:                     
                    break; 
            } 
        } 
        while(n!=0); 
    }
    }
    
    

