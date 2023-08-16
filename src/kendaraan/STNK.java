package kendaraan;
public class STNK {
	Kendaraan kendaraan;

	public STNK(Kendaraan kendaraan) {
		super();
		this.kendaraan = kendaraan;
	}
	
	public void printPajak() {
		System.out.println(kendaraan.pajak);
	}

}
