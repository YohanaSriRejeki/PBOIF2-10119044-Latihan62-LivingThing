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
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama){
        System.out.println(" Bernafas");
    }
    public void eat(String nama){
        System.out.println(" Makan");
    }
}
