/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119080.kevinpratamasinaga;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Gradien Garis Lurus
 */
public class Customer extends ServicePrice implements CustomerInvoice{
    private String name, email;
    private boolean member;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean isMember() {
        if(super.checkMemberStatus(member)) {
            
        }
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    @Override
    public String currentTime() {
         //  object tanggal
       Date date = new Date();
        
       // menampilkan waktu dan tanggal menggunakan toString()
       System.out.println(date.toString());
    }
    
}