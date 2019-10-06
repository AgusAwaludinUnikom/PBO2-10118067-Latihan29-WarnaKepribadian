/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan29.warnakepribadian;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana caranya menampilkan kepribadian
 *  berdasarkan warna yang dipilih
 */
public class PBO210118067Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static final String  RESET                = "\u001B[0m";
    public static final String  BLACK               = "\u001B[30m";
    public static final String  RED                 = "\u001B[31m";
    public static final String  GREEN               = "\u001B[32m";
    public static final String  YELLOW              = "\u001B[33m";
    public static final String  BLUE                = "\u001B[34m";
    public static final String  MAGENTA             = "\u001B[35m";
    public static final String  CYAN                = "\u001B[36m";
    public static final String  WHITE               = "\u001B[37m";
 
    public static final String  BACKGROUND_BLACK    = "\u001B[40m";
    public static final String  BACKGROUND_RED      = "\u001B[41m";
    public static final String  BACKGROUND_GREEN    = "\u001B[42m";
    public static final String  BACKGROUND_YELLOW   = "\u001B[43m";
    public static final String  BACKGROUND_BLUE     = "\u001B[44m";
    public static final String  BACKGROUND_MAGENTA  = "\u001B[45m";
    public static final String  BACKGROUND_CYAN     = "\u001B[46m";
    public static final String  BACKGROUND_WHITE    = "\u001B[47m";
    
    
    public static final String[] DATA_MERAH =  {
        "Periang",
        "Pemberani",
        "Berani mengambil resiko dalam setiap langkah",
        "Menyukai tantangan",
        "Kurang sabar",
        "Dapat menahan marah namun jika sudah tahap puncak"
                + " toleransi, kemarahannya akan sulit dikontrol",
        "Memiliki energi kehangatan dan cinta"
    };

    public static final String[] DATA_HIJAU =  {
        "Romantis",
        "Menyukai hal yang berbau alami dan keindahan",
        "Teguh pada prinsip",
        "Menginginkan kesempuranaan",
        "Mudah cemburu",
        "Mudah merasa iri",
        "Menjunjung tinggi suatu nilai toleransi dan kepercayaan"
    };

    public static final String[] DATA_KUNING =  {
        "Optimis",
        "Suka bergaul",
        "Periang",
        "Senang menolong",
        "Lincah dan aktif",
        "Tidak suka meremehkan kekurangan orang lain",
        "Loyal",
        "Hangat",
        "Meskipun karakternya optimis dan idealis, seringkali goyah dan"
            + " tidak stabil",
        "Cenderung Penakut"
    };

    public static final String[] DATA_BIRU =  {
        "Menyenangkan",
        "Bijaksana",
        "Pembawaan diri tenang saat menghadapi masalah",
        "Dinamis",
        "Senang berbagi",
        "Bersahabat",
        "Tidak terlalu suka menjadi sorotan banyak orang",
        "Menyembunyikan perasaan karena karakternya yang cenderung mencari"
            + " jalan damai"
    };

    public static final String[] DATA_UNGU =  {
        "Optimis",
        "Tidak pernah ragu",
        "Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat",
        "Memiliki ambisi yang besar",
        "Memiliki empati yang besar",
        "Memiliki sisi misterius sebab seringkali menutupi perasaannya",
        "Terkadang bersikap keras kepala dan angkuh"
    };
    
    public static void main(String[] args) {
    
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "DARI " +
                MAGENTA + "WARNA " + BLUE + "FAVORITMU" + RESET);
        
        System.out.println(" ");
        System.out.println(BACKGROUND_RED + WHITE +     "       MERAH       ");
        System.out.println(BACKGROUND_GREEN + WHITE +   "       HIJAU       ");
        System.out.println(BACKGROUND_YELLOW + WHITE +  "       KUNING      ");
        System.out.println(BACKGROUND_BLUE + WHITE +    "       BIRU        ");
        System.out.println(BACKGROUND_MAGENTA + WHITE + "       UNGU        ");
        System.out.println(" ");
        
        System.out.print(RESET +"PILIH WARNA FAVORITMU : ");
        Scanner scanner = new Scanner(System.in);
        String pilih = scanner.next();
        System.out.print("NAMA KAMU : ");
        String nama = scanner.next();
        
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
        
        switch(pilih.toLowerCase()) {
            case "merah": printData(pilih, DATA_MERAH); break;
            case "hijau": printData(pilih, DATA_HIJAU); break;
            case "kuning": printData(pilih, DATA_KUNING); break;
            case "biru": printData(pilih, DATA_BIRU); break;
            case "ungu": printData(pilih, DATA_UNGU); break;
            default: System.out.println("Oops.. Belum teridentifikasi");
        }
        
       
    }
    
    public static final void printData(String pilih, String[] data) {
        System.out.println("Warna Favoritmu adalah " + getpilih
            ("color", pilih) + pilih.toUpperCase() + RESET);
        
        for(int i = 0; i<data.length; i++) {
            System.out.print((i+1) + ". " + data[i]);
            if(i+1 < data.length) {
                System.out.println(",");
            } else {
                System.out.println(".");
            }
        }

    }
    
    public static final String getpilih(String type, String pilih) {
        String result = "";
        
        switch(pilih.toLowerCase()) {
            case "merah": result = type.equals("background") ? BACKGROUND_RED : RED; break;
            case "hijau": result = type.equals("background") ? BACKGROUND_GREEN : GREEN; break;
            case "kuning": result = type.equals("background") ? BACKGROUND_YELLOW : YELLOW; break;
            case "biru": result = type.equals("background") ? BACKGROUND_BLUE : BLUE; break;
            case "ungu": result = type.equals("background") ? BACKGROUND_MAGENTA : MAGENTA; break;
        
        }
        return result;
    }
}
