/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Dell
 */
public class CTHD {
   
    String tenSP;
    int soLuong;
    double donGia;
    double chietKhau; 

    public CTHD() 
    {
    }

    public CTHD(String tenSP, int soLuong, double donGia, double chietKhau) 
    {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String gettenSP() 
    {
        return tenSP;
    }

    public void settenSP(String tenSP) 
    {
        this.tenSP = tenSP;
    }

    public int getSoLuong() 
    {
        return soLuong;
    }

    public void setSoLuong(int soLuong) 
    {
        this.soLuong = soLuong;
    }

    public double getDonGia() 
    {
        return donGia;
    }

    public void setDonGia(double donGia) 
    {
        this.donGia = donGia;
    }

    public double getChietKhau() 
    {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) 
    {
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() 
    {
        return "Tên sản phẩm: " + tenSP + ", Số lượng: " + soLuong + ", Đơn giá: " + donGia + ", Chiết khấu: " + chietKhau;
    }
    
}
