/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class KelasAbstrak {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        Burung b = new Burung();
        h.berjalan();
        b.bernafas();
        h.berjalan();
        b.bernafas();
    }
}
