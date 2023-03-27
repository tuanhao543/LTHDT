public class baitaplab7{
    abstract class XeMay{
        abstract void brake();
    }
     class XeMayTheThao extends XeMay{
        @Override 
        public void brake(){
            System.out.println("Phanh cơ");
        }
     }
     class XeMayLeoNui extends XeMay{
        @Override
        public void brake(){
            System.out.println("Phanh Dia");
        }
     }
 public class Main{
    public static void main(String[] args) {
        XeMayTheThao xmtt= new XeMayTheThao();
        XeMayLeoNui xmln= new XeMayLeoNui ();
        xmtt.brake();
        xmln.brake();
    }}

}