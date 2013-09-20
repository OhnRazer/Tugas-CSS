class tipedata{
	private String nama;
	public static void main(String[] args){
		tipedata isi = new tipedata();
		isi.setNama("Ramdhani");
		byte a = 100;
		short b = 100;

		System.out.println("menampilkan nama ="+isi.getNama());
		System.out.println("Hasil dari a+b="+(a+b));
}

	public void setNama(String aNama){
		this.nama = aNama;
	}

	public String getNama(){
		return this.nama;
	}
}