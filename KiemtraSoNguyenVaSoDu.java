import java.util.Scanner;

public class KiemtraSoNguyenVaSoDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số thứ Hai:");
        int num2 = scanner.nextInt();

        int PhanNguyen = num1/num2;
        int Phandu = num1%num2;

        System.out.println("Phần Nguyên là :" +PhanNguyen);
        System.out.println("Phần Dư là:" +Phandu);
    }
}
