import java.util.Scanner;
public class HotelUTS {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int room, diskon, inap;
        
        System.out.println("Daftar Room :");
        System.out.println("1. Single room");
        System.out.println("2. Double room");
        System.out.println("3. Family room");
        System.out.println("4. Meeting room");
        System.out.print("Pilih Room (1-4) : ");
        room = input.nextInt();
        
        System.out.print("Masukkan Lama Inap (hari) : ");
        inap = input.nextInt();
        
        String souvenir = "-", strRoom="";
        int harga= 0;
        switch (room) {
            case 1 -> {
                strRoom = "Single room";
                harga = 120000;
            }
            case 2 -> {
                strRoom = "Double room";
                souvenir = "Tas Kecil";
                harga = 150000;
            }
            case 3 -> {
                strRoom = "Family room";
                souvenir = "Tas Kecil";
                harga = 220000;
            }
            case 4 -> {
                strRoom = "Meeting room";
                harga = 90000;
            }
            default -> {
                    System.out.println("Room tidak terdaftar");
                    System.out.println("Keluar system");
                    System.exit(0);
            }
        }
        
        if (room != 4) {
            
            if(inap>=10){
               diskon=20;  
            }else if(inap>=5){
                diskon=10;
            }else if(inap>=3){
                diskon=5;
            }else{
                diskon=0;
            }
        } else{
            diskon=0;
        }
        
        int biaya = harga * inap;
        int potongan = 0;
        int total = 0;
        
        potongan = biaya * diskon / 100;
        total = biaya - potongan;
//        if(diskon!=0){
//            
//            
//        }else{
//            total = biaya;
//        }
        
        System.out.println("Room     : "+strRoom);
        System.out.println("Inap     : "+inap+" hari");
        System.out.println("Biaya    : Rp."+biaya);
        System.out.println("Diskon   : "+diskon+"%");
        System.out.println("potongan : Rp."+potongan);
        System.out.println("Souvenir : "+souvenir);
        System.out.println("Total    : Rp."+total);
    }
}
