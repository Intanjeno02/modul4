public class Main {
    public static void main(String[] args){
        MesinKopi mesinLobby = new MesinKopi (18.5 , 15, 15 );
        mesinLobby.Berhasil();
        mesinLobby.isiUlangBahan(15, 15, 15);
        mesinLobby.Berhasil();

        boolean Ketersediaan = mesinLobby.cekKetersediaanCappuccino();
        System.out.println("pengecekan cappucino :" + Ketersediaan);
        
    }
}
