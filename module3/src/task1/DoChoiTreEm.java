package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class DoChoiTreEm extends SanPham{
    ArrayList<DoChoiTreEm> list = new ArrayList<DoChoiTreEm>();
    private String xuatxu;
    private String thuonghieu;
    private String nhacc;
    private String huongdansd;

    public DoChoiTreEm(){}
    public DoChoiTreEm(String masp, String tensp, int soluongsp, double dongia, String danhmucsp, String xuatxu, String thuonghieu, String nhacc, String huongdansd) {
        super(masp, tensp, soluongsp, dongia, danhmucsp);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.huongdansd = huongdansd;
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
        this.huongdansd = huongdansd;
    }

    @Override
    public String toString() {
        return "DoChoiTreEm{" +
                "list=" + list +
                ", xuatxu='" + xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", huongdansd='" + huongdansd + '\'' +
                ", masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluongsp=" + soluongsp +
                ", dongia=" + dongia +
                ", danhmucsp='" + danhmucsp + '\'' +
                '}';
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(list);
    }

    @Override
    public double PhanTramGiamGia(String loaikhach) {
        switch (loaikhach){
            case "thuong":
                return 0.02;
            case "vip1":
                return 0.05;
            case "vip2":
                return 0.07;
        }
        return 0;
    }
    public void Them(){
        super.Them();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập xuất xứ: ");
        String xuatxu = sc.nextLine();
        System.out.println("Nhập thương hiệu: ");
        String thuonghieu = sc.nextLine();
        System.out.println("Nhập nhà cung cấp: ");
        String nhacc = sc.nextLine();
        System.out.println("Nhập hướng dẫn sử dụng: ");
        String huongdansd = sc.nextLine();
        DoChoiTreEm dochoitreem = new DoChoiTreEm(masp,tensp,soluongsp,dongia,danhmucsp,xuatxu,thuonghieu,nhacc,huongdansd);
        list.add(dochoitreem);
    }
}
