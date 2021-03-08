package task2;

import task1.DoChoiTreEm;
import task1.DoDungHocTap;
import task1.DonHang;
import task1.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class MainmenuControll {

    public static void main(String[] args) {
        Sach sach = new Sach();
        DoDungHocTap dodunghoctap = new DoDungHocTap();
        DoChoiTreEm dochoitreem = new DoChoiTreEm();
        DonHang donhang = new DonHang();
        Scanner sc = new Scanner(System.in);
        int functionID = 0;
        boolean check = true;
        do{
            ShowMenu();
            functionID = Integer.parseInt(sc.nextLine());
            switch (functionID){
                case 1: sach.Them();break;
                case 2: dodunghoctap.Them();;break;
                case 3: dochoitreem.Them();;break;
                case 4: donhang.Them();break;
                case 5: sach.HienThiThongTin();break;
                case 6: dodunghoctap.HienThiThongTin();break;
                case 7: dochoitreem.HienThiThongTin();break;
                case 8: donhang.HienThiThongTin();break;
                case 9: ;break;
                case 10: ;break;
                case 11: ;break;
                case 12: ;break;
                default:
                    check = false;break;
            }
        }while (check==true);
        sc.close();
    }
    public static void ShowMenu(){
        System.out.println("===========Menu Choose==========");
        System.out.println("1.Thêm sản phẩm sách");
        System.out.println("2.Thêm sản phẩm đồ dùng học tập");
        System.out.println("3.Thêm sản phẩm đồ chơi trẻ em");
        System.out.println("4.Thêm đơn hàng");
        System.out.println("5.Hiển thị sản phẩm sách");
        System.out.println("6.Hiển thị sản phẩm đồ dùng học tập");
        System.out.println("7.Hiển thị sản phẩm đồ chơi trẻ em");
        System.out.println("8.Hiển thị sản phẩm có trong nhà sách");
        System.out.println("9.Hiển thị danh sách đơn hàng");
        System.out.println("10.Tìm kiếm sản phẩm theo mã sản phẩm");
        System.out.println("11.Tìm kiếm đơn hàng theo mã khách hàng");
        System.out.println("12.Quay về menu chính");
        System.out.println("____________________________________");
        System.out.println("Mời bạn chọn: ");
    }
}
