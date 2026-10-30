package modau;
import java.util.Scanner;
import java.text.DecimalFormat;
public class main {
    public static final float PI= 3.14f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.##");
        float r         = scanner.nextFloat();
        float thetich    = (float)4/3 * PI * r * r * r ;
        float dientich  = 4 * PI * r * r;
        System.out.println("Diện tích: "+ dc.format(dientich ));
        System.out.println("Thể tích: "+  dc.format(thetich));
                

        
        
        
    }
}