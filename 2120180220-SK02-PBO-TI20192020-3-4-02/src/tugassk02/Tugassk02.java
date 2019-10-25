package tugassk02;
public class Tugassk02 {
    public static void main(String[] args) {
        
        drone drone_ku = new drone();
        System.out.println(drone_ku.nama);
        drone_ku.energi=100;
        System.out.println(drone_ku.energi);
        drone_ku.terbang();
        drone_ku.turun();
        drone_ku.merekam();
        drone_ku.memotret();
        
        
        
        
      
    }
    
}
