package task1;

import task4.FileUtils;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sach extends SanPham{
    ArrayList<Sach> list = new ArrayList<Sach>();
    private String nhaxb;
    private int namxb;
    private String tacgia;
    private Date ngayxb;
    private int lantaiban;

    public Sach(){}
    public Sach(String masp, String tensp, int soluongsp, double dongia, String danhmucsp, String nhaxb, int namxb, String tacgia, Date ngayxb, int lantaiban) {
        super(masp, tensp, soluongsp, dongia, danhmucsp);
        this.nhaxb = nhaxb;
        this.namxb = namxb;
        this.tacgia = tacgia;
        this.ngayxb = ngayxb;
        this.lantaiban = lantaiban;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public int getNamxb() {
        return namxb;
    }

    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public Date getNgayxb() {
        return ngayxb;
    }

    public void setNgayxb(Date ngayxb) {
        this.ngayxb = ngayxb;
    }

    public int getLantaiban() {
        return lantaiban;
    }

    public void setLantaiban(int lantaiban) {
        this.lantaiban = lantaiban;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "Sach{" +
                "nhaxb='" + nhaxb + '\'' +
                ", namxb=" + namxb +
                ", tacgia='" + tacgia + '\'' +
                ", ngayxb='" + ngayxb + '\'' +
                ", lantaiban=" + lantaiban +
                ", masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluongsp=" + soluongsp +
                ", dongia=" + dongia +
                ", danhmucsp='" + danhmucsp + '\'' +
                '}';
    }
    @Override
    public double PhanTramGiamGia(String loaikhach) {
        switch (loaikhach){
            case "thuong":
                return 0.02;
            case "vip1":
                return 0.05;
            case "vip2":
                return 0.1;
        }
        return 0;
    }
    @Override
    public void Them(){
        super.Them();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nhà xuất bản: ");
        nhaxb = sc.nextLine();
        do {
            System.out.println("Nhập năm xuất bản");
            namxb = Integer.parseInt(sc.nextLine());
            if(namxb<1000|| namxb>2021)
                System.out.println("Sai Năm !");
        }while (namxb<1000 || namxb>2021);
        System.out.println("Nhập tác giả: ");
        tacgia = sc.nextLine();

        while (true) {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            try {
                System.out.println("Nhập ngày xuất bản: ");
                String ngayxuatban = sc.nextLine();
                ngayxb = format.parse(ngayxuatban);
                break;
            } catch (Exception e) {
                System.out.println("Định dạng ngày sai !");
            }
        }
        do{
            System.out.println("Nhập lần tái bản");

            lantaiban=Integer.parseInt(sc.nextLine());
            if(lantaiban<0)
                System.out.println("Phải là số nguyên dương !");
        }while (lantaiban<0);
        Sach sach = new Sach(masp,tensp,soluongsp,dongia,danhmucsp,nhaxb,namxb,tacgia,ngayxb,lantaiban);
        list.add(sach);
    }
    public void LuuFile(){
        final String FileSach="src/task3/Sach.csv";
        Sach sach = new Sach();
        FileUtils file = new FileUtils();
        for (Sach item : sach.list)
            file.writeFile(FileSach, item.toString());
    }
}
