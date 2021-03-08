create database QL_SP_NHASACH_NHANAM;

create table DMSACH(
	MaDMSach varchar(50) primary key,
	TheLoai nvarchar(50),
	MoTa nvarchar(500));

create table SanPhamSach(
	MaSPSach varchar(50) primary key,
	TenSPSach nvarchar(50),
	SoLuong int,
	DonGia double,
	DonVi nvarchar(50),
	MaDMSach varchar(50), foreign key(MaDMSach) references DMSACH(MaDMSach),
	NhaXuatBan nvarchar(50),
	NamXuatBan year,
    TacGia nvarchar(50),
    NgayXuatBan datetime,
    LanTaiBan int);

create table NhanVien(
	MaNhanVien varchar(50) primary key,
	TenNhanVien nvarchar(50),
    NgaySinh datetime,
    ViTri nvarchar(50),
    SoDienThoai nvarchar(11),
    Email nvarchar(30),
    DiaChi nvarchar(50));

create table LoaiKhachHang(
	MaLoai varchar(50) primary key,
    TenLoai nvarchar(50));

create table KhachHang(
	MaKhachHang varchar(50) primary key,
    TenKhachHang nvarchar(30),
    Email nvarchar(30),
    SoDienThoai nvarchar(11),
    NgaySinh datetime,
    MaLoai varchar(50), foreign key(MaLoai) references LoaiKhachHang(MaLoai));
    
create table DonHang(
	MaDonHang varchar(50) primary key,
    MaKhachHang varchar(50), foreign key(MaKhachHang) references KhachHang(MaKhachHang),
    MaNhanVien varchar(50), foreign key(MaNhanVien) references NhanVien(MaNhanVien),
    NgayMuaHang datetime,
    TongTien double);

create table DMDoChoi(
	MaDMDoChoi varchar(50) primary key,
    Nhom nvarchar(50),
    MoTa nvarchar(500));

create table SanPhamDoChoi(
	MaSPDoChoi varchar(50) primary key,
    TenSPDoChoi nvarchar(50),
    SoLuong int,
    DonGia double,
    DonVi nvarchar(50),
    MaDMDoChoi varchar(50),foreign key(MaDMDoChoi) references DMDoChoi(MaDMDoChoi),
    XuatSu nvarchar(50),
    ThuongHieu nvarchar(50),
    NhaCungCap nvarchar(50),
    HuongDan nvarchar(50));

create table DMDungCu(
	MaDMDungCu varchar(50) primary key,
    Khoi nvarchar(50),
    MoTa nvarchar(100));

create table SanPhamDungCu(
	MaSPDungCu varchar(50) primary key,
    TenSPDungCu nvarchar(50),
    SoLuong int,
    DonGia double,
    DonVi nvarchar(50),
    MaDMDungCu varchar(50),foreign key(MaDMDungCu) references DMDungCu(MaDMDungCu),
    XuatSu nvarchar(50),
    ThuongHieu nvarchar(50),
    NhaCungCap nvarchar(50),
    MauSac nvarchar(50),
    KichThuoc int,
    ChatLieu nvarchar(50),
    HuongDan nvarchar(100));
    
create table ChiTietDonHang(
	MaDonHang varchar(50),
	MaSanPham varchar(50),
	SoLuong int,
    foreign key(MaDonHang) references DonHang(MaDonHang),
    foreign key(MaSanPham) references SanPhamDoChoi(MaSPDoChoi),
    foreign key(MaSanPham) references SanPhamSach(MaSPSach),
    foreign key(MaSanPham) references SanPhamDungCu(MaDMDungCu));