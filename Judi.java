import java.util.Scanner;

public class Judi {
	public static void main(String[] args) {

//Scanner in = new Scanner(System.in);
boolean ProgLoop = true;
Scanner in = new Scanner(System.in);
while(ProgLoop) {
	prog();
	System.out.println("==================");
	System.out.println("======Lagi?=======");
	System.out.println("==================");
	System.out.println("====Again/Exit====");
	System.out.println("==================");
	System.out.println();
	String pilihan=in.nextLine();
	if(pilihan.equalsIgnoreCase("EXIT")) {
		System.out.println();
		System.out.println("\n\n==============================================");
		System.out.println("====TERIMAKASIH TELAH BERMAIN BERSAMA KAMI====");
		System.out.println("==============================================");
		ProgLoop = false;
	}
}
	}
	
	public static void prog() {
	Scanner scn = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("==============================================");
		System.out.println("=================== JUDIKA ===================");
		System.out.println("=============== Judi Dadu Kita ===============");
		System.out.println("============================================== \n");
		
		System.out.println("\n");
		System.out.print("Masukkan Nama Anda : ");
		String Nama = scn.nextLine();
		System.out.print("Masukkan Nominal Deposit : ");
		int Nominal = scn.nextInt();
		double Dadu = (Math.random()*8);
		
//		System.out.println((int)Dadu);
		
	boolean Ulang = true;
	
	while(Ulang) {	
		
		
	if(Nominal < 50) {
		System.out.println(Nama + " Saldomu tidak cukup");
		break;
	}
	
	System.out.println("Tebak angka berapa yg keluar");
	int Taruh =scn.nextInt();
	
	
	if(Taruh == ((int)Dadu)) {
		Nominal = (Nominal *2) - 50;
		System.out.println("Tebakan Jitu");
		System.out.println("Dadu yg keluar : " +(int)Dadu);
		System.out.println("\n");
		break;
	} else {
		System.out.println("Tebakan gagal");
		System.out.println("Dadu yg keluar : " +(int)Dadu);
		System.out.println("\n");
		Nominal = Nominal - 50;
		break;
		
	}	

	
}
		
	System.out.println("\nSisa saldo " +Nama+ " adalah : " + Nominal);
//	scn.close();
	}
}

