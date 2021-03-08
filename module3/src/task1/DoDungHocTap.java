package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class DoDungHocTap extends SanPham{
    ArrayList<DoDungHocTap> list = new ArrayList<DoDungHocTap>();
    private String xuatxu;
    private String thuonghieu;
    private String nhacc;
    private String huongdansd;
    private String mausac;
    private String chatlieu;
    private String kichthuoc;

    public DoDungHocTap(){}

    @Override
    public String toString() {
        return "DoDungHocTap{" +
                "list=" + list +
                ", xuatxu='" + xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", huongdansd='" + huongdansd + '\'' +
                ", mausac='" + mausac + '\'' +
                ", chatlieu='" + chatlieu + '\'' +
                ", kichthuoc='" + kichthuoc + '\'' +
                ", masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluongsp=" + soluongsp +
                ", dongia=" + dongia +
                ", danhmucsp='" + danhmucsp + '\'' +
                '}';
    }

    public DoDungHocTap(String masp, String tensp, int soluongsp, double dongia, String danhmucsp, String xuatxu, String thuonghieu, String nhacc, String huongdansd, String mausac, String chatlieu, String kichthuoc) {
        super(masp, tensp, soluongsp, dongia, danhmucsp);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.huongdansd = huongdansd;
        this.mausac = mausac;
        this.chatlieu = chatlieu;
        this.kichthuoc = kichthuoc;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getNhacc() {
        return nhacc;
    }

    public void setNhacc(String nhacc) {
        this.nhacc = nhacc;
    }

    public String getHuongdansd() {
        return huongdansd;
    }

    public void setHuongdansd(String huongdansd) {
        huongdansd = huongdansd;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(list);
    }

    @Override
    public double PhanTramGiamGia(String loaikhach) {
        switch (loaikhach){
            case "thuong":
                return 0.01;
            case "vip1":
                return 0.03;
            case "vip2":
                return 0.07;
        }
        return 0;
    }
    @Override
    public void Them(){
        super.Them();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nơi xuất xứ: ");
        String xuatxu = sc.nextLine();
        System.out.println("Nhập thương hiệu: ");
        String thuonghieu = sc.nextLine();
        System.out.println("Nhập nhà cung cấp: ");
        String nhacc = sc.nextLine();
        System.out.println("Nhập hướng dẫn sử dụng: ");
        String huongdansd = sc.nextLine();
        System.out.println("Nhập màu sắc: ");
        String mausac = sc.nextLine();
        System.out.println("Nhập chất liệu: ");
        String chatlieu = sc.nextLine();
        System.out.println("Nhập kích thước: ");
        String kichthuoc = sc.nextLine();
        DoDungHocTap dodunghoctap = new DoDungHocTap(masp,tensp,soluongsp,dongia,danhmucsp,xuatxu,thuonghieu,nhacc,huongdansd,mausac,chatlieu,kichthuoc);
        list.add(dodunghoctap);
    }
}
