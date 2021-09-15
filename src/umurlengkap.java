import java.util.Scanner;


 // @author kezia
 // Klasifikasi kategori umur lengkap


public class umurlengkap {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        //Preparation
        int umur = 0;
        String nama;
        int tahunlahir;
        String bulanlahir;
        int tgglahir;
        String januari="";
        int umurbulan;
    
                
   
        //Input
        System.out.print("Masukan nama anda = ");
        nama = scan.nextLine ();
        
        System.out.print("Masukan tahun lahir anda = ");
        tahunlahir = scan.nextInt();
        
        System.out.println("Masukan bulan lahir anda = ");
        bulanlahir = scan.next();
        
        System.out.println("Masukan tanggal lahir anda = ");
        tgglahir = scan.nextInt();
       
        
        //Process
        umur= 2020-tahunlahir;
        
        switch (bulanlahir){
            case 1 : 
            bulanlahir = "januari";
            umurbulan = 
        }
       

    
        if (umur > 0 && umur <1){
        //Output Bayi
        System.out.println ( nama + " adalah seorang bayi berusia " + umur );
        
        } else if (umur >= 2 && umur <= 3) {
        //Output
            System.out.println(nama + " adalah seorang batita berusia " + umur);
            
        } else if (umur >= 4 && umur <= 5 ) {
        //Output
            System.out.println(nama + " adalah seorang balita berusia " + umur);   
            
        } else if (umur >= 6 && umur <= 12) {
        //Output
            System.out.println(nama + " adalah seorang anak-anak berusia " + umur);
            
        } else if (umur >= 13 && umur <= 17 ) {
        //Output
            System.out.println(nama + " adalah seorang remaja berusia " + umur);
            
        } else if (umur >= 18 && umur <= 30) {
        //Output
            System.out.println(nama + " adalah seorang pemuda berusia " + umur);
            
        } else if (umur >= 31 && umur <= 60) {
        //Output
            System.out.println(nama + " adalah seorang dewasa berusia " + umur);
            
        } else if (umur >= 61 && umur <= 100) {
        //Output
            System.out.println(nama + " adalah seorang lansia berusia " + umur);
        }
        
        
       
        
    }
    
}
