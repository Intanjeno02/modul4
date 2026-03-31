class DuitKu{
    String nama;
    int nomor;
    int saldou;

    DuitKu(String nama, String noHP) {
        this.nama = nama;
        this.nomor = nomor;
        this.saldou = 0;
    }

    public void setor(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Setoran ditolak karena minimum setoran adalah Rp 10.000");
        } else {
            saldou = saldou + jumlah;
            System.out.println("setor telah berhasil: Rp " + jumlah);
        }
    }

    public void bayar(int jumlah) {
        if (saldou >= jumlah) {
            saldou = saldou - jumlah;
            System.out.println("Pembayaran berhasil: Rp " + jumlah);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup");
        }
    }
}