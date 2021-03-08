package task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
    ArrayList<KhachHang> listKhachHang = new ArrayList<KhachHang>();
    private String makh;
    private int sodienthoai;
    private String email;
    private String ngaysinh;
    private String loaikhach;

    public KhachHang() {
    }

    public KhachHang(String makh, int sodienthoai, String email, String ngaysinh, String loaikhach) {
        this.makh = makh;
        this.sodienthoai = sodienthoai;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.loaikhach = loaikhach;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public int getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLoaikhach() {
        return loaikhach;
    }

    public void setLoaikhach(String loaikhach) {
        this.loaikhach = loaikhach;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "makh='" + makh + '\'' +
                ", sodienthoai='" + sodienthoai + '\'' +
                ", email='" + email + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", loaikhach='" + loaikhach + '\'' +
                '}';
    }
    public void Them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng: ");
        makh = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        sodienthoai = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập email: ");
        email = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhập loại khách: ");
        loaikhach = sc.nextLine();
        KhachHang khachhang = new KhachHang(makh,sodienthoai,email,ngaysinh,loaikhach);
        listKhachHang.add(khachhang);
    }
    public void HienThiKhachHang(){
        System.out.println(listKhachHang);
    }
}
