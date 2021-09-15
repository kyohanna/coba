
import java.util.Scanner;

 // @author kezia

/*/ Tabungan > 50 juta , libur 2 minggu, ke eropa
Tabungan > 20 juta & <50 juta, libur 2 minggu ke jepang
tabungan >=50 juta libur 2 minggu beli ps
tabungan < 5 juta, kerja sambilan

/*/
 
public class liburan {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        //preparation
        int tabungan=0;
        int lamalibur=0;
        
        //Input
        System.out.print("Tabunganmu berapa = ");
        tabungan = scan.nextInt();
        
        System.out.print("Berapa kamu libur = ");
        lamalibur = scan.nextInt();
        
        //Process
        if (tabungan > 50000000 && lamalibur == 14){
            System.out.println("Pergi ke Eropa");
        }
        
        else if (tabungan > 20000000 && tabungan <50000000 && lamalibur == 14){
            System.out.println("Pergi ke Jepang");
        }
        
        else if (tabungan >= 50000000 && lamalibur == 14){
            System.out.println("Beli ps");
        }
        
        else if (tabungan < 5000000 && lamalibur >= 0 ){
            System.out.println("Kerja woi, liburan mimpi");
        }
        
        else {
            System.out.println("Dirumah ae");
        }
        
        
    }
    
}
