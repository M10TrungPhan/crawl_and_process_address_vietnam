 public class OopPart2 {
     public static void main(String[] args){
//         Cho cho = new Cho();
//         HinhChuNhat rectange = new HinhChuNhat();
//         rectange.tinhDienTich(10,5);
            GaiXinh abc = new GaiXinh();
            abc.getTuoi();
            abc.setTuoi(-1);
            abc.getTuoi();
            abc.setTuoi(21);
            abc.getTuoi();
     }
 }
 class DongVat{
     DongVat(String giong){
         System.out.println("Type:" + giong);
     }
     protected String type ="Dong vat";
     public void hienThiThongTin(){
         System.out.println("Toi la dong vat");
     }
 }

 class Cho extends DongVat{
     Cho(){
         super("Cho");
         System.out.println("Dog");
     }

 }
 interface HinhDaGiac{
     void tinhDienTich(int chieuDai, int chieuRong);
 }

 interface DuongThang{
 }
 class HinhChuNhat implements HinhDaGiac, DuongThang{
     public void tinhDienTich(int chieuDai, int chieuRong){
         System.out.println("S=" + (chieuDai*chieuRong));
     }
 }

 class GaiXinh{
    private int tuoi;
    public  void setTuoi(int tuoi){
        if (tuoi >=0) this.tuoi = tuoi;
        }
    public int getTuoi() {
        System.out.println(this.tuoi);
        return this.tuoi;
    }
 }