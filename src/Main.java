import java.util.ArrayList;
import java.util.Scanner;

import kendaraan.Kendaraan;
import kendaraan.Mobil;
import kendaraan.Motor;

public class Main {

	// apps dealer
	Scanner scan = new Scanner(System.in);
	//array list of kendaraan
	ArrayList<Kendaraan> stokKendaraan = new ArrayList<Kendaraan>();
	public Main() {
		int input = 0;
		
//		Motor.balap();
		
		do {
			printMenu();
			input = scanInt();
			handleInput(input);
		} while(input!=0);
		
		
	}
	
	private void handleInput(int input) {
		switch (input) {
		case 1: 
			inputKendaraan();
			break;
		case 2:
			nyalakanMesin();
			break;
		case 3: 
			printKendaraan();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
	}

	private void nyalakanMesin() {
		printKendaraan();
		int input = 0;
		System.out.println("Masukkan nomor kendaraan yang ingin di nyalakan: ");
		
		input = scanInt();
		
		Kendaraan kendaraan = stokKendaraan.get(input);
		
		System.out.println("Menyalakan mesin...");
		kendaraan.nyalakanMesin();
		
		if(kendaraan instanceof Mobil) {
			((Mobil)kendaraan).nyalakanSoundSystem();
			((Mobil)kendaraan).nyalakanSoundSystem("edm");
			((Mobil)kendaraan).nyalakanSoundSystem("edm", 500);
		}
		
		System.out.println();
		
	}

	private void printKendaraan() {
		System.out.println("| No | Jumlah Roda | Bahan bakar | Harga | Atribut Unik |");
		for(int i =0; i< stokKendaraan.size(); i++) {
			Kendaraan kendaraan = stokKendaraan.get(i);
			
			if(kendaraan instanceof Mobil) {
				System.out.printf("| %2d | %5d | %8s | %5d | %8d %s |\n",
						i, kendaraan.getJumlahRoda(), kendaraan.getBahanBakar(), kendaraan.getHarga(),
						((Mobil) kendaraan).getTahun(), " Tahun");
			} else {
				System.out.printf("| %2d | %5d | %8s | %5d | %8s |\n",
						i, kendaraan.getJumlahRoda(), kendaraan.getBahanBakar(), kendaraan.getHarga(),
						((Motor) kendaraan).getJenisKnalpot() + " Knalpot");
			}
		}
		
	}

	private void inputKendaraan() {
		int jumlahRoda, harga, jenisKendaraan = 0, tahun;
		String bahanBakar, jenisKnalpot;
		
		do {
			System.out.println("Jenis kendaraan apa yang ingin ditambahkan?");
			System.out.println("1. Motor");
			System.out.println("2. Mobil");
			System.out.print("Masukkan pilihan >> ");
			jenisKendaraan = scanInt();
		}while(jenisKendaraan != 2 && jenisKendaraan != 1);
		
		System.out.print("Masukkan jumlah roda >> ");
		jumlahRoda = scanInt();
		
		System.out.print("Masukkan harga >> ");
		harga = scanInt();
		
		System.out.print("Masukkan jenis bahan bakar >> ");
		bahanBakar = scan.nextLine();
		
		if(jenisKendaraan == 1) {
			System.out.print("Masukkan jenis knalpot >> ");
			jenisKnalpot = scan.nextLine();
			
			Motor motor = new Motor(jumlahRoda, bahanBakar, harga, jenisKnalpot);
			stokKendaraan.add(motor);
		}else {
			System.out.print("Masukkan tahun pembuatan >> ");
			tahun = scanInt();
			
			Mobil mobil = new Mobil(jumlahRoda, bahanBakar, harga, tahun);
			stokKendaraan.add(mobil);
		}
		
		System.out.println("Berhasil menambahkan stok!");
		System.out.println();
	}

	void printMenu() {
		System.out.println("Welcome!");
		System.out.println("Select menu:");
		System.out.println("1. Tambah stok kendaraan");
		System.out.println("2. Nyalakan mesin");
		System.out.println("3. Lihat stok");
		System.out.println("0. Exit");
		System.out.print("Input >> ");
	}
	
	int scanInt() {
		int input = 0;
		try {
			input = scan.nextInt();
			scan.nextLine();
			return input;
		} catch (Exception e) {
			System.err.println("Input must be int");
			return 0;
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
