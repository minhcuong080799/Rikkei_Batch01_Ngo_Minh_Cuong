package task1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class SanPham {
    protected String masp;
    protected String tensp;
    protected int soluongsp;
    protected double dongia;
    protected String danhmucsp;

    public SanPham() {
    }
    public SanPham(String masp, String tensp, int soluongsp, double dongia, String danhmucsp) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluongsp = soluongsp;
        this.dongia = dongia;
        this.danhmucsp = danhmucsp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluongsp() {
        return soluongsp;
    }

    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getDanhmucsp() {
        return danhmucsp;
    }

    public void setDanhmucsp(String danhmucsp) {
        this.danhmucsp = danhmucsp;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluongsp=" + soluongsp +
                ", dongia=" + dongia +
                ", danhmucsp='" + danhmucsp + '\'' +
                '}';
    }
    public abstract void HienThiThongTin();
    public abstract double PhanTramGiamGia(String loaikhach);
    public void Them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        masp = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tensp = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        soluongsp = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập đơn giá: ");
        dongia = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập danh mục sản phẩm: ");
        danhmucsp = sc.nextLine();
    }
}
