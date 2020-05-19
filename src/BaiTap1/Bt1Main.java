/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Dell
 */
public class Bt1Main {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args)
    {
        HoaDonHeader HDH = new HoaDonHeader
        ("HD1", "22/02/2020","Nguyễn Hoàng Minh");
        CTHD CTHD1 = new CTHD("Bếp gas",1,4000000,0);
        CTHD CTHD2 = new CTHD("Nồi cơm điện ",1,2000000,0.3);
        CTHD CTHD3 = new CTHD("Ấm đun nước ",1,350000,0.5);
        CTHD CTHD4 = new CTHD("Máy hút bụi",1,1000000,0.5);
        
        HoaDon HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(CTHD1)
            .addCTHD(CTHD2)
            .addCTHD(CTHD3)
            .addCTHD(CTHD4)
            .build();
        
        System.out.println(HD.toString());
    }
        // TODO code application logic here
    }
    

