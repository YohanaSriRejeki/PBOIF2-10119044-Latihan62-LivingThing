/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hal yang dilakukan manusia
 */ 
public class PBOIF210119044Latihan62LivingThing {
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        System.out.print(human.getNama()+" sedang ");
        human.walk("Rizki Adam Kurniawan");
        System.out.print(human.getNama());
        human.breath("Rizki Adam Kurniawan");
        System.out.print(human.getNama());
        human.eat("Rizki Adam Kurniawan");
    }
    
}
