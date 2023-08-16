package kendaraan;

public abstract class Kendaraan {
	private int jumlahRoda;
	// access modifier private cuma bisa di akses di dalam class yang sama
	private String bahanBakar;
	// access modifier protected: cuma bisa di akses class turunannya
	protected int harga;
	// access modifier 'none': bisa di akses dari seluruh package
	int pajak;
	// shortcut constructor: 'alt' + 'shift' + 's' + 'o'
	// access modifier public: bisa di akses dari seluruh projek
	public Kendaraan(int jumlahRoda, String bahanBakar, int harga) {
		super();
		this.jumlahRoda = jumlahRoda;
		this.bahanBakar = bahanBakar;
		this.harga = harga;
	}
	
	public void nyalakanMesin() {
		System.out.println("Turning on..");
		return;
	}
	
	//abstract method
	public abstract int uangMuka();

	// shortcut getter/setter: 'alt' + 'shift' + 's' + 'r'
	public int getJumlahRoda() {
		return jumlahRoda;
	}

	public String getBahanBakar() {
		return bahanBakar;
	}

	public int getHarga() {
		return harga;
	}
}
