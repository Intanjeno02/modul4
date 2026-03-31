class MesinKopi {
    double bijikopi;
    double air;
    double susu;

    public MesinKopi(double bijikopi, double air, double susu) {
        System.out.println("bahan baku sebelum diisi ulang.");
        this.bijikopi = bijikopi;
        this.air = air;
        this.susu = susu;
    }

    public void isiUlangBahan(double bijikopi, double air, double susu) {
        this.bijikopi = bijikopi + this.bijikopi;
        this.air = air + this.air;
        this.susu = susu + this.susu;
        System.out.println("bahan baku berhasil diisi ulang.");
    }

    public void Berhasil(){
        System.out.println("biji kopi :" + this.bijikopi);
        System.out.println("air :" + this.air);
        System.out.println("susu :" + this.susu);
    }

    boolean cekKetersediaanCappuccino(){
        if (bijikopi >= 15.0 && air >= 50.0 && susu >= 100.0){
            return true;
        } else{
            return false;
        }
    }

    MesinKopi(){
        bijikopi = 0.0;
        air = 0.0;
        susu = 0.0;
    }
}