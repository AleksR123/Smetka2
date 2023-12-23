import java.util.Scanner;

public class Smetka2 {
	
		public static void main(String[] args) {
			
			//jabolki - 50 den, krusi - 60 den, grozje - 100 den kg
			
			double smetka = 0;
			System.out.println("Vnesi sto si kupil vo kilogrami: ");
			Scanner tastatura = new Scanner (System.in);
			System.out.println("Jabolki: ");
			double jabolki = tastatura.nextDouble();
			System.out.println("Krusi: ");
			double krusi = tastatura.nextDouble();
			System.out.println("Grozje: ");
			double grozje = tastatura.nextDouble();
			smetka = jabolki * 50 + krusi * 60 + grozje * 100;
			System.out.println("Smetkata iznesuva" + smetka + "denari");
		}


}
