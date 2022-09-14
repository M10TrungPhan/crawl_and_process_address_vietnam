
// class OopPart1{
//     private int x;
//     public static void main(String [] args){
//     // Den den1 = new Den();
//     // Den den2 = new Den();
//     // den1.batDen();
//     // den1.notification();
//     // den2.batDen();
//     // den2.notification();
//     // den2.tatDen();
//     // den2.notification();
//     // System.out.println(Math.sqrt(16));
//     // Den.myMethod();
//     // staticMethod();
//     // int x = tinhBinhPhuong(15);
//     // System.out.println(x);
//     // System.out.println(tinhTong(2,3));
//     // }

//     // private static void staticMethod(){
//     //     System.out.println("This is static method");
//     // }

//     // public static int tinhBinhPhuong(int x){
//     //     return x * x;
//     // }

//     // public static int tinhTong(int x, int y){
//     //     return x + y;
    
    

//     // }
//     // Constructor Java
//     OopPart1 obj = new OopPart1();
//     System.out.println(obj.x);
//     }
    
//     private OopPart1(){
//         System.out.println("Constructor duoc goi");
//         x = 10;
//     }
    
    
// }

// class Den{
    
//     private String status;

//     public void batDen(){
//         status = "On";
//     }

//     public void tatDen(){
//         status = "Off";
//     }

//     public void notification(){
//         System.out.println("Status den: "+status);
//     }

//     public static void myMethod(){
//         System.out.println("Method co the goi ma k can tao instance");
//     }

// }
    
// Constructor no parameter
// class OopPart1{
//     public String ten;
    
//     public OopPart1(){
//         ten = "Trung";
//         System.out.print(ten);
//     }

//     public static void main(String[] args){
//         OopPart1 obj = new OopPart1();
//     }
// }

// Constructor have parameter
// class OopPart1{
//     public String thuonghieu;
    
//     public OopPart1(){
//         thuonghieu = "Mac dinh";
//         System.out.println("Thuong hieu xe: " + thuonghieu);
//     }
//     public OopPart1(String tenthuonghieu){
//         thuonghieu = tenthuonghieu;
//         System.out.println("Thuong hieu xe: " + thuonghieu);
//     }

//     public static void main(String[] args){
//         OopPart1 obj = new OopPart1("Totyota");
//         OopPart1 obj1 = new OopPart1("Suzuki");
//         OopPart1 obj2 = new OopPart1("Honda");
//         OopPart1 obj3 = new OopPart1();
//     }
// }

// Su dung this nhu 1 doi so
// class OopPart1{
//     public static void main(String[] args){
//         ViDuThis obj = new ViDuThis(5, 2);
//     }
// }
// class ViDuThis{
//     int x;
//     int y;
    
//     ViDuThis(int x, int y){
//         this.x = x;
//         this.y = y;
//         System.out.println("Before: " + this.x + " " + this.y );
        
//         cong2(this);

//         System.out.println("After: " + this.x + " " + this.y );
//     }

//     void cong2(ViDuThis o){
//         o.x +=2;
//         o.y +=2;
//     }
// }

