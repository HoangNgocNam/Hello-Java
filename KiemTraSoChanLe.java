import java.util.Scanner;

public class KiemTraSoChanLe {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        n = scanner.nextInt();

        if (n%2==0) {
            System.out.println("Đây là số chẵn");
        }else{
            System.out.println("Đây là số lẻ");

        }
    
    }
}
