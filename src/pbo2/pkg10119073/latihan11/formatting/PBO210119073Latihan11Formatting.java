package pbo2.pkg10119073.latihan11.formatting;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk mengimplementasikan
 * formatting
 *
 */

public class PBO210119073Latihan11Formatting {

    public static void main(String[] args) {
       int i  = 3546764;
       int iMinus = -i;
       System.out.println("i     : " + i);
       System.out.printf("%%d    : %d%n", i);
       System.out.printf("%%10d  : %10d%n", i);
       System.out.printf("%%+10d : %+10d%n", i);
       System.out.printf("%%+10d : %+10d%n", iMinus);
       System.out.printf("%%,10d : %,10d%n", i);
       System.out.printf("%%-10d : %-10d%n", i);
       double f = 5675482.982;
       System.out.println("f       : " +f);
       System.out.printf("%%f      : %f%n", f);
       System.out.printf("%%.2f    : %.2f%n", f);
       System.out.printf("%%12.2f  : %12.2f%n", f);
       System.out.printf("%%,12,2f : %,12.2f%n", f);
    }
    
}
