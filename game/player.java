package materi.OOP.drone.game;

public class player {
    //atribut
    String name;
    int speed, damage, defense, healthPoint;
        
    //method run
    void run(){
        System.out.println(name+" is running");
        System.out.println(speed+" speed");
        System.out.println("menerima serangan "+ damage +" armor"+defense);
}
    
    boolean isDead(){
        if(healthPoint <= 0) return true;
                return false;
    }
}
