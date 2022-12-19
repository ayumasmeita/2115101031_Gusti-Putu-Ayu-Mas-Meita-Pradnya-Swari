package id.ac.undiksha.siak.entitas;

public class Mahasiswa {
	
	private String nama;
	private String alamat;
	private boolean jeniskelamin; //0 perempuan, 1 laki-laki 
	private String nim;
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	
	public Mahasiswa() {
		nama										= "(nama belum diisi)";
		alamat										= "(alamat belum diisi)";				
		nim											= "(nim belum diisi)";
		prodi										= "(prodi belum diisi)";
		jurusan										= "(jurusan belum diisi)";
		fakultas									= "(fakultas belum diisi)";
	}
	
	public Mahasiswa(String nama, String alamat, boolean jeniskelamin, String nim, String prodi, String jurusan,
			String fakultas) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jeniskelamin = jeniskelamin;
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() {
		System.out.println("Nama: "				+ this.getNama());	
		System.out.println("Alamat: "			+ this.getAlamat());
		System.out.println("Nim: "				+ this.getNim());	
		System.out.println("Prodi: "			+ this.getProdi());
		System.out.println("Jurusan: "			+ this.getJurusan());	
		System.out.println("Fakultas: "			+ this.getFakultas());
		
		
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
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFakultas() {
		return fakultas;
	}
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	

}


