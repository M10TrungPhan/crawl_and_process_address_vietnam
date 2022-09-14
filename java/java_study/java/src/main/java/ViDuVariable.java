import java.util.Scanner;

class ViDuVariable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        int soNguyen = input.nextInt();
        // System.out.println("So nguyen vua nhap la:" + soNguyen);
        if (soNguyen==1){
            System.out.println("So nguyen vua nhap la 1");
            System.out.println("Out");
        }      
    }
}