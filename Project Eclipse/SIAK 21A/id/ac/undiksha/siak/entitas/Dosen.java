package id.ac.undiksha.siak.entitas;

public class Dosen {

	private String nama;
	private String alamat;
	private boolean jeniskelamin; //0 perempuan, 1 laki-laki 
	private String nip;
	
	
	
	
	public Dosen() {
		nama										= "(nama belum diisi)";
		alamat										= "(alamat belum diisi)";				
		nip											= "(prodi belum diisi)";
	}
	
	
	
	public Dosen(String nama, String alamat, boolean jeniskelamin, String nip) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jeniskelamin = jeniskelamin;
		this.nip = nip;
	}
	
	
	
	public void printAllInfo() {
		System.out.println("Nama: "				+ this.getNama());	
		System.out.println("Alamat: "			+ this.getAlamat());
		System.out.println("Nip: "				+ this.getNip());
		
		
		System.out.println("Jenis Kelamin:"
				+ (jeniskelamin ? "Laki-laki" : "Perempuan"));
	}
	
	
	
	
	
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean isJeniskelamin() {
		return jeniskelamin;
	}
	public void setJeniskelamin(boolean jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}

}
