/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chuoi_mang;
import java.util.Scanner;
/**
 *
 * @author hieum
 */
public class chuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String chuoi1 = "";
    String chuoi2 = "Welcome";
    String chuoi3 = new String("Hello World");
    // hiển thị giá trị của 2 chuỗi trên ra màn hình
    System.out.println("Chuỗi rỗng có giá trị = " + chuoi1);
    System.out.println("Chuỗi 2 có giá trị = " + chuoi2);
    System.out.println("Chuỗi 3 có giá trị = " + chuoi3);
    int doDai;
    String chuoi;
        System.out.println("Nhập chuỗi: ");
    chuoi = scanner.nextLine();
    doDai = chuoi.length();
        System.out.println("Độ dài của chuỗi: "+ doDai );
    String chuoi4 = chuoi2.concat(chuoi3);
        System.out.println("Chuỗi được nối: " + chuoi4);
    char Kytu = chuoi.charAt(5);
        System.out.println("Ký tự được lấy ra: "+ Kytu);
     int result = chuoi1.compareTo(chuoi2);
     if( result == 0 )
        {
            System.out.println("chuỗi "+ chuoi1 + " = " + chuoi2);
        } else if( result < 0 )
        {
            System.out.println("Chuỗi "+ chuoi1 + "< "+ chuoi2);
            
        }
        else System.out.println("Chuỗi "+ chuoi1 + " > " + chuoi2);
     int result2 = chuoi.indexOf(chuoi2);
        System.out.println("Vì trí đầu tiên xuất hiện chuỗi " + chuoi2 + "trong chuỗi " + chuoi + " = " + result2);
        int result3 = chuoi.lastIndexOf(chuoi2);
        System.out.println("Vì trí cuối cùng xuất hiện chuỗi " + chuoi2 + "trong chuỗi " + chuoi + " = " + result3);
        System.out.println(chuoi2.replace('a','b'));
        
    

    }
}
    