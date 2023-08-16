package kendaraan;

// class motor mewarisi (meng-inherit) sifat class kendaraan
public class Motor extends Kendaraan {
	private String jenisKnalpot;

	// shortcut constructor: 'alt' + 'shift' + 's' + 'o'
	public Motor(int jumlahRoda, String bahanBakar, int harga, String jenisKnalpot) {
		super(jumlahRoda, bahanBakar, harga);
		super.harga += 50;
		this.jenisKnalpot = jenisKnalpot;
	}

	public String getJenisKnalpot() {
		return jenisKnalpot;
	}

	public void setJenisKnalpot(String jenisKnalpot) {
		this.jenisKnalpot = jenisKnalpot;
	}
	
	//polimorphism: overriding
	public void nyalakanMesin() {
		System.out.println("Ngeenngg..");
		return;
	}
	
	//static method
	public static void balap() {
		System.out.println("gass ");
	}

	@Override
	public int uangMuka() {
		return 0;
	}
}
