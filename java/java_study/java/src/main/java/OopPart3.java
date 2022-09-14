import java.awt.desktop.SystemSleepEvent;

public class OopPart3 {
    public static void main(String[] args){
//        Initialize inner class
//        Laptop dell = new Laptop();
//        Laptop.CPU cpu = dell.new CPU();
//        Laptop.RAM ram = dell.new RAM();
//        System.out.println("CPU generation: "+ cpu.getTheHeCPU() + "TH");
//        System.out.println("RAM storage: "+ ram.getBoNhoRam() + "GB");

//            ACCESS instance member in parent class from child class
//        Oto vin = new Oto("Vinfast","N20");
//        Oto.DongCo dongCo1 = vin.new DongCo();
//        dongCo1.setDongCo();
//        System.out.println("Dong co vin la: " + dongCo1.getLoaiDongCo());
//
//        Oto merc = new Oto("Mercedes","mers");
//        Oto.DongCo dongCo2 = merc.new DongCo();
//        dongCo2.setDongCo();
//        System.out.println("Dong co Mercedes la: " + dongCo2.getLoaiDongCo());

//        INNER CLASS VS STATIC NESTED CLASS
//        Inner
//        DongVat1 dv = new DongVat1();
//        DongVat1.BoSat ran = dv.new BoSat();
//        ran.hienThi();
//        Static nested class
//        DongVat1.DongVatCoVu cho = new DongVat1.DongVatCoVu();
//        cho.hienThi();

//        ANONYMOUS CLASS
//        VDAnonymous vd = new VDAnonymous();
//        vd.taoClass();

//        SINGLETON
//        Database db1;
//        db1 = Database.getInstance();
//        db1.getConnection();
          int N = 12;
          if(N>11 && N<15){
              System.out.println("Weird");
          }
    }
}

class Laptop{
    double gia;
    class CPU{
        String nhaSanXuat;
        String loaiChip;
        int getTheHeCPU(){
            return  10;
        }
    }
    protected class RAM{
        String nhaSanXuat;
        String loaiRAM;
        int getBoNhoRam(){
            return 16;
        }
    }
}

class Oto{
    private String tenXe;
    private String loaiXe;
    public Oto(String tenXe, String loaiXe){
        this.tenXe = tenXe;
        this.loaiXe = loaiXe;
    }
    private String getTenXe(){
        return this.tenXe;
    }

    class DongCo{
        double loaiDongCo;
        void setDongCo(){
            if(Oto.this.loaiXe.equals("N20")) {
                if(Oto.this.tenXe.equals("Vinfast")){
                    this.loaiDongCo = 3.0;
                }else{
                    this.loaiDongCo = 2.0;
                }
            }else{
                this.loaiDongCo = 1.0;
            }
        }
        double getLoaiDongCo(){
            return this.loaiDongCo;
        }
    }

}

class DongVat1{
//    Inner class
    class BoSat{
        public void hienThi(){
            System.out.println("Bo sat");
        }
    }
    static class DongVatCoVu{
        public void hienThi(){
            System.out.println("Dong vat co vu");
        }
    }
}

class VDAnonymous{
    public void taoClass(){
        HinhDaGiac1 h1 = new HinhDaGiac1() {
            public void hienThi(){
                System.out.println("INNER ANONYMOUS CLASS");
            }
        };
        h1.hienThi();
    }
}

interface HinhDaGiac1{
    public default void hienThi(){
        System.out.println("Hinh dai giac");
    }
}

// SINGLETON EXAMPLE

class Database{
    private static Database dbObject;
    private  Database(){
    }

    public static Database getInstance(){
        if(dbObject == null){
            dbObject = new Database();
        }
        return dbObject;
    }
    public void getConnection(){
        System.out.println("Connect database");
    }
}