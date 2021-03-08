package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class DonHang {
    ArrayList<DonHang> listdhang = new ArrayList<DonHang>();
    private String madh;
    private String masp;
    private int soluong;
    private double tongtien;
    private String ngaymua;
    private double dongia;

    public DonHang(){}

    @Override
    public String toString() {
        return "DonHang{" +
                ", madh='" + madh + '\'' +
                ", masp='" + masp + '\'' +
                ", soluong=" + soluong +
                ", tongtien=" + tongtien +
                ", ngaymua='" + ngaymua + '\'' +
                ", dongia=" + dongia +
                '}';
    }

    public DonHang(String madh, String masp, int soluong, double tongtien, String ngaymua, double dongia) {
        this.madh = madh;
        this.masp = masp;
        this.soluong = soluong;
        this.tongtien = tongtien;
        this.ngaymua = ngaymua;
        this.dongia = dongia;
    }

    public String getMadh() {
        return madh;
    }

    public void setMadh(String madh) {
        this.madh = madh;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public String getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(String ngaymua) {
        this.ngaymua = ngaymua;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public void Them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã đơn hàng: ");
        String madh = sc.nextLine();
        System.out.println("Nhập mã sản phẩm: ");
        String masp = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tổng tiền: ");
        double tongtien = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập ngày mua: ");
        String ngaymua = sc.nextLine();
        System.out.println("Nhập đơn giá: ");
        double dongia = Double.parseDouble(sc.nextLine());
        DonHang donhang = new DonHang(madh,masp,soluong,tongtien,ngaymua,dongia);
        listdhang.add(donhang);
    }
    public void HienThiThongTin(){
        System.out.println(listdhang);
    }
}
