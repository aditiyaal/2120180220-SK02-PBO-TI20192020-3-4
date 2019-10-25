package tugassk02;
public class drone {
    String nama = "drone_DJIT600";
    int energi ;
    int merekam ;
    int memotret ;
    void terbang(){
        energi--;
        if(energi > 10){
            System.out.println("drone terbang...");
        }else{
            System.out.println("energi lemah,drone tidak bisa terbang");
        }
    }
    void turun(){
        System.out.println("drone akan turun");
    }
    void merekam(){
        System.out.println("drone mulai merekam ");
    }
    void memotret(){
        System.out.println("drone mengamil gambar");
        
    }
    
        
    }



