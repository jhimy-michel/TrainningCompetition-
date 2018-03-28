
import java.util.*;
public class Areaa {
    public  static  void main(String [] args){
        Scanner read= new Scanner(System.in) ;
        String operador;
        int casos;
        casos=read.nextInt();
        read.nextLine();
        while(casos>0){
            //read.nextLine();
            operador=read.nextLine();
            String[] parts = operador.split(" ");
            if("circle".equals(parts[0])){
              double radio=Double.parseDouble( parts[1]) * Double.parseDouble(parts[1]) * Math.PI;
                System.out.printf("%.2f",radio);
                System.out.println();
            }
            if("rectangle".equals(parts[0])){
                double radio=Double.parseDouble( parts[1]) * Double.parseDouble(parts[2]);
                System.out.printf("%.2f",radio);
                System.out.println();
            }
            operador="";
            casos--;
        }
    }
}
