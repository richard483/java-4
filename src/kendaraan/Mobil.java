package kendaraan;

//class mobil mewarisi (meng-inherit) sifat class kendaraan
public class Mobil extends Kendaraan{
	private int tahun;

	// shortcut constructor: 'alt' + 'shift' + 's' + 'o'
	public Mobil(int jumlahRoda, String bahanBakar, int harga, int tahun) {
		super(jumlahRoda, bahanBakar, harga);
		this.tahun = tahun;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}
	
	//polimorphism: overriding
	public void nyalakanSoundSystem() {
		System.out.println("dug dug");
	}
	
	public void nyalakanSoundSystem(String jenisMusik) {
		switch (jenisMusik) {
		case "edm": 
			System.out.println("ajeb ajeb");
			break;
		case "klasik":
			System.out.println("la la la");
		default:
			System.out.println("dug dug");
		}
	}
	
	public void nyalakanSoundSystem(String jenisMusik, int durasi) {
		switch (jenisMusik) {
		case "edm": 
			System.out.println("ajeb ajeb");
			break;
		case "klasik":
			System.out.println("la la la");
		default:
			System.out.println("dug dug");
		}
		System.out.println("duration: " + durasi);
	}

	@Override
	public int uangMuka() {
		return 100;
	}
}
