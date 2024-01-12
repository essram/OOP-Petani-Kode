package materi.OOP.drone.game;

public class game {
    public static void main(String[] args) {
        //buat objek
        player enemy = new player();
        enemy.name = "kaido";
        enemy.speed = 90;
        enemy.healthPoint = 90;
        enemy.damage = 90;
        enemy.defense = 90;
        
        enemy.run();
        if(enemy.isDead()){
            System.out.println(enemy.name+" kalah");
        } else{
            System.out.println(enemy.name+" yonko masih hidup");
        }
        
        player luffy = new player ();
        luffy.name = "luffy";
        luffy.speed = 95;
        luffy.healthPoint = 96;
        luffy.damage = 95;
        luffy.defense = 93; 

        luffy.run();
        
        if (luffy.isDead()) {
            System.out.println("Game Over");
        } else{
            System.out.println(luffy.name+" belum mati "+luffy.healthPoint+" Health Point");
        }
        
        if(luffy.isDead()){
            System.out.println("kamu kalah");
    }
}
}
