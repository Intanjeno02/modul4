class Mahasiswa {
    String nama;
    int umur;
    String JurusanStudi;

    public Mahasiswa(String nama, int umur, String JurusanStudi) {
        this.nama = nama;
        this.umur = umur;
        this.JurusanStudi = JurusanStudi;
    }

    public void Belajar(){
        System.out.println(nama + "sedang belajar");
    }

    public void gantiProdi(String JurusanStudi){
        this.JurusanStudi = JurusanStudi;
    };

    public void tampilkan(){
        System.out.println("Nama :" + nama);
        System.out.println("Umur :" + umur);
        System.out.println("Jurusan :" + JurusanStudi);
    }
}