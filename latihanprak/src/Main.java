public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhsBaru = new Mahasiswa("Intan", 20, "CS");

        mhsBaru.Belajar();

        mhsBaru.tampilkan();

        mhsBaru.gantiProdi("HAHA");

        mhsBaru.tampilkan();
    }
}
