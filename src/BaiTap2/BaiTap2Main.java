/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;


/**
 *
 * @author doanm
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        MyStringBuilder msb = new MyStringBuilder.Builder()
                .addString("Nguyen Hoang Minh")
                .addFloat(21)
                .addBool(true)
                .build();
        
        System.out.println(msb.toString());
    }
    
}