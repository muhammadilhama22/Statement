/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atep;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class programUpdate {
 public static void main(String[] args) {
 Connection koneksi = KoneksiDatabase.getKoneksi();
 Statement statement = null;
 try {
 statement =koneksi.createStatement();
 System.out.println("Statement berhasil dibuat");
 String url= "UPDATE barang SET nama_barang='PENSIL' ,jumlah=20,harga=2500 WHERE kode_barang='B001'";
 statement.executeUpdate(url);
 }catch(SQLException ex){
 System.out.println("Statement gagal dibuat");
 System.out.println("Pesan : "+ex.getMessage());
 }finally{
 if (statement != null){
 try{
 statement.close();
 System.out.println("Statement berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Statement gagal ditutup");
 System.out.println("Pesan : "+ex.getMessage());
 }
 }
 }
 }
}

