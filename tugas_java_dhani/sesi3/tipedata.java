class TipeData{
	private String nama;
	public static vold main(String[] args){
		TipeData isi = new TipeData();
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