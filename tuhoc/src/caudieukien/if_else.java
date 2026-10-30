/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caudieukien;
import java.util.Scanner;
/**
 *
 * @author hieum
 */
public class if_else {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber, largestNumber;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số thứ nhất: ");
        firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        secondNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        thirdNumber = scanner.nextInt();
         
        if (firstNumber >= secondNumber) {
            if (firstNumber >= thirdNumber) {
                largestNumber = firstNumber;
            } else {
                largestNumber = thirdNumber;
            }
        } else if (secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }
         
        System.out.println("Số lớn nhất trong 3 số " + firstNumber + ", " + secondNumber + 
                        " và " + thirdNumber + " là " + largestNumber);
        int number;
         
        System.out.println("Nhập vào số cần kiểm tra: ");
        number = scanner.nextInt();
         
        /*
         * Sử dụng toán tử điều kiện 3 ngôi
         */
        String ketQua = (number % 2 == 0) ? "Số " + number + " là số chẵn" : "Số " + number + 
            " là số lẻ";
        System.out.println(ketQua);
    } 
    
}
