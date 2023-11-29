import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
         
         System.out.println("Nhập năm cần kiểm tra:");
          
         year = scanner.nextInt();
         scanner.close();
         boolean isleap = false;

         if (year % 4 == 0) 
         {
            if (year % 100 == 0)
             {
                if (year % 400 == 0) 
                    isleap = true;
                
                else
                    isleap = false;
                
            }
            else
                isleap = true;
            
            
        }else
            isleap = false;
         

         if (isleap == true) 
            System.out.println(year + "La Nam Nhuan:");
         else
            System.out.println(year + "Khong phai nam nhuan");
        

    }
}
