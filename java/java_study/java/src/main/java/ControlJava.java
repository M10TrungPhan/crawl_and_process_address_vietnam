import java.util.Scanner;

class ControlJava{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so:");
        // int so = input.nextInt();
        // String loaixe;
        // if (so>0){
        //     System.out.println("So duong");
        // }
        // else if(so==0 ){
        //     System.out.println("So 0");
        // }
        // else {
        //     System.out.println("So am");
        // }
        // switch (so){
        //     case 2:
        //         loaixe = "Xe may";
        //         break;
        //     case 4:
        //         loaixe = "O to 4 cho";
        //         break;
        //     case 7:
        //         loaixe = "O to 7 cho";
        //         break;
        //     default:
        //         loaixe = "Xe khac";

        // }
        // System.out.println(loaixe);
        int number = input.nextInt();
        int tong = 0;
        for (int i=number; i<100; ++i){
            tong +=i ;
        }
        System.out.println(tong);
    }
}