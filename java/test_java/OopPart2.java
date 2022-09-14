// public class OopPart2 {
//     public static void main(String[] args){
    
//         Cho cho = new Cho();

//     }
    
// }

// class DongVat{
//     DongVat(String giong){
//         System.out.println("Type:" + giong);
//     }
//     protected String type ="Dong vat";
//     public void hienThiThongTin(){
//         System.out.println("Toi la dong vat");
//     }
// }

// class Cho extends DongVat{
//     Cho(){
//         super("Cho");
//         System.out.println("Dog");
//     }

// }

interface HinhDaGiac{
    void tinhDienTich(int chieuDai, int chieuRong);
}

class HinhChuNhat implements HinhDaGiac{
    public void tinhDienTich(int chieuDai, int chieuRong){
        System.out.println("S=" + (chieuDai*chieuRong));
    }
}

class Main{
    public static void main(String[] args){
        HinhChuNhat rectangle = new H
    }
}