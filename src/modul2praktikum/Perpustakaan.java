/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2praktikum;

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
String nama;
String jenis;
String warna;
int tebal;
   
}
class jenis extends Perpustakaan{
    public void tampil(){
        System.out.println("List buku di perpustakaan :");
    }
}
class IamNumberFour extends Perpustakaan{
    public IamNumberFour (String nama,String jenis,String warna,int tebal){
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.tebal = tebal;
    }
    public void tampil(){
        System.out.println("\n===============================");
        System.out.println("Judul buku          :" + nama);
        System.out.println("Jenis buku          :" + jenis);
        System.out.println("Warna buku          :" + warna);
        System.out.println("Tebal buku          :" + tebal);
    }
}
class DesainGrafis extends Perpustakaan{
    public DesainGrafis (String nama,String jenis,String warna,int tebal){
         this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.tebal = tebal;
    } 
    public void tampil(){
        System.out.println("\n===============================");
        System.out.println("Judul buku          :" + nama);
        System.out.println("Jenis buku          :" + jenis);
        System.out.println("Warna buku          :" + warna);
        System.out.println("Tebal buku          :" + tebal);
    }
}
class AdobePremiere extends Perpustakaan{
    public AdobePremiere (String nama,String jenis,String warna,int tebal){
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.tebal = tebal;
    }
     public void tampil(){
        System.out.println("\n===============================");
        System.out.println("Judul buku          :" + nama);
        System.out.println("Jenis buku          :" + jenis);
        System.out.println("Warna buku          :" + warna);
        System.out.println("Tebal buku          :" + tebal);
    }
}
class Kimia extends Perpustakaan{
    public Kimia (String nama,String jenis,String warna,int tebal){
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.tebal = tebal;
    }
     public void tampil(){
        System.out.println("\n===============================");
        System.out.println("Judul buku          :" + nama);
        System.out.println("Jenis buku          :" + jenis);
        System.out.println("Warna buku          :" + warna);
        System.out.println("Tebal buku          :" + tebal);
    }
}
class jenisBuku {
    public static void main(String [] args){
        
        jenis jns = new jenis();
        IamNumberFour inf = new IamNumberFour("Iam Number Four","Fiksi","Coklat",350);
        DesainGrafis dg = new DesainGrafis("Desain Grafis","Buku Pelajaran","Biru",380);
        AdobePremiere ap = new AdobePremiere("Adobe Premiere","Buku Pelajaran","Coklat",400);
        Kimia ka = new Kimia("Kimia","Buku Pelajaran","Hijau",368);
        jns.tampil();
        inf.tampil();
        dg.tampil();
        ap.tampil();
        ka.tampil();
    }
}