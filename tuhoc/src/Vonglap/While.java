/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vonglap;
import java.util.Scanner;
/**
 *
 * @author hieum
 */
public class While {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nhap_so;
        System.out.println("nhập số:" );
        int tong = 0;
        while( tong < 100)
        {
            nhap_so = scanner.nextInt();
            tong += nhap_so;
         
        }
        System.out.println("Tông các số nguyên vừa nhập: " + tong);
    }
    
}
