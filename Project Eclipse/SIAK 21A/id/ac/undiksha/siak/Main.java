package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entitas.Dosen;
import id.ac.undiksha.siak.entitas.Mahasiswa;
import id.ac.undiksha.siak.entitas.Pegawai;

public class Main {

	public static void main(String[] args) {
	
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("gekmas");
		
		Dosen dsn1 = new Dosen();
		dsn1.setAlamat("Negare");
		
		Pegawai pgw1 = new Pegawai();
		pgw1.setNip("2115101031");
		
		
		System.out.println(mhs1.getNama());
		System.out.println(dsn1.getAlamat());
		System.out.println(pgw1.getNip());
		mhs1.printAllInfo();
		dsn1.printAllInfo();
		
		
		
		
		
		
		//Mahasiswa mhs2 = new Mahasiswa (
				//"Budi",
				//"Singaraja",
				//"2115101031",
				//"ilmu komputer",
				//"teknik informatika",
				//"ftk"
				
				//);
				
	}
	
}
