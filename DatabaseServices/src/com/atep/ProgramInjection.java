/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atep;

/**
 *
 * @author Muhammad Ilham
 */
public class ProgramInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        barang barang = new barang();
        String kd="B001' OR 'atep'='atep";
        barang.delete(kd);
        String sql = "DELETE FROM barang WHERE kode_barang='"+kd+"'";
        System.out.println(sql); 
    }
    
}
