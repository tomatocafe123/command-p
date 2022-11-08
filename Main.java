import java.util.Scanner;

public class Main {
 public static void main(String[] args){
  Scanner st=new Scanner(System.in);
  double height= st.nextDouble();
  double weight=st.nextDouble();

  double height2=st.nextDouble();
  double weight2=st.nextDouble();

   double Bmi=weight/(height*height);
   double Bmi2=weight/(height2*height2);
   System.out.println((double)Math.round(Bmi*100)/100);
   System.out.println((double)Math.round(Bmi2*100)/100);
 }
}
