
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika alif = new Matematika(7,2);
        
        System.out.println("Hasil Penjumlahan "+alif.setPenjumlahan());
        System.out.println("Hasil Pengurangan "+alif.setPengurangan());
        System.out.println("Hasil Perkalian "+alif.setPerkalian());
        System.out.println("Hasil Pembagian "+alif.setPembagian());
    }

}
