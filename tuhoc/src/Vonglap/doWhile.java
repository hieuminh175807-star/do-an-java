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
public class doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tong = 0 ;
        int so;
        Scanner scanner = new Scanner(System.in);
        do
        {
            so = scanner.nextInt();
            tong += so;
        }
        while(tong <100 );
        System.out.println("Tông các số vừa nhập là: " +tong );
    }
}
