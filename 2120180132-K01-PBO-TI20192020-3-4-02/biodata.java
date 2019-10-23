//Nama Package atau Folder (Nama Foldernya sama dengan yang "mahasiswa.java" karena bertempat di 1 Folder)
package belajarmahasiswa;

// Nama Class (Rancangan atau Blue Print) dengan nama "biodata"
public class biodata {
    public static void main(String[] args) {
    
// ========== Instansiasi / Memanggil Atribut dari mahasiswa, yaitu : nama, alamat, nim ==========     
        
    // 1. Membuat Biodata 1 (orang_1)
    mahasiswa orang_1 = new mahasiswa();
    // Memanggil fungsi nama, alamat, dan nim serta Mengisi Biodata
    orang_1.nama = "Agus Setia Rega";
    orang_1.alamat = "Ds. Ngantru, Kec. Ngasem, Kab. Bojonegoro";
    orang_1.nim = "2120180132";
       
    // 2. Membuat Biodata 2 (orang_2)
    mahasiswa orang_2 = new mahasiswa();
    // Memanggil fungsi nama, alamat, dan nim serta Mengisi Biodata
    orang_2.nama = "Adi Nella A";
    orang_2.alamat = "Ds. Ngraho, Kec. Ngraho, Kab. Bojonegoro";
    orang_2.nim = "2120180130";
    
    // 3. Membuat Biodata 3 (orang_3)
    mahasiswa orang_3 = new mahasiswa();
    // Memanggil fungsi nama, alamat, dan nim serta Mengisi Biodata
    orang_3.nama = "Erlinda Nofa Prastianti";
    orang_3.alamat = "Ds. Bojonegoro, Kec. Bojonegoro, Kab. Bojonegoro";
    orang_3.nim = "2120180149";
    
    // 4. Membuat Biodata 4 (orang_4)
    mahasiswa orang_4 = new mahasiswa();
    // Memanggil fungsi nama, alamat, dan nim serta Mengisi Biodata
    orang_4.nama = "Luthfi Syadulloh";
    orang_4.alamat = "Ds. Sukosewu, Kec. Sukosewu, Kab. Bojonegoro";
    orang_4.nim = "2120180166";
    
    // 5. Membuat Biodata 5 (orang_5)
    mahasiswa orang_5 = new mahasiswa();
    // Memanggil fungsi nama, alamat, dan nim serta Mengisi Biodata
    orang_5.nama = "Galih Purwati Septiani";
    orang_5.alamat = "Ds. Sumberarum, Kec. Dander, Kab. Bojonegoro";
    orang_5.nim = "2120180151";
    
//==================================== OUTPUT ====================================
    
    // Memanggil Method dari mahasiswa yaitu void "biodata" (Output)
    orang_1.biodata();
    orang_2.biodata();
    orang_3.biodata();
    orang_4.biodata();
    orang_5.biodata();
    }
}