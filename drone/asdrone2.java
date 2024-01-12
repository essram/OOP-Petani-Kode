package materi.OOP.drone.drone;


class drone{
    int energi;
    int ketinggian;
    int kecepatan;
    String merk;

    void terbang(){
        energi--;
        if(energi > 10){

            ketinggian++;
            System.out.println("drone terbang");
        } else {
            System.out.println("Energi lemah (Drone Tidak Bisa Terbsng)");
        }
    }
    void matikanMesin(){
        if(ketinggian > 0) {
        System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
    } else {
        System.out.println("Mesin dimatikan");
    }
}


void turun(){

    ketinggian--;
    energi--;
    System.out.println("Drone turun");
}
}