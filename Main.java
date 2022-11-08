import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  Scanner st=new Scanner(System.in);
  double height= st.nextDouble();
  double weight=st.nextDouble();

   double Bmi=weight/(height*height);
   System.out.println((double)Math.round(Bmi*100)/100);
 }
}
