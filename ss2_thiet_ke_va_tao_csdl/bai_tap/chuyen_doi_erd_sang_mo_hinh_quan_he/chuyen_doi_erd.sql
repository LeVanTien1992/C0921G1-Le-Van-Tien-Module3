create database chuyen_doi_urd;

use chuyen_doi_urd;

create table phieu_xuat(
	so_phieu_xuat int primary key auto_increment,
    ngay_xuat varchar(50)
);



create table vat_tu(
	ma_vat_tu int primary key auto_increment,
    ten_vat_tu varchar(50)
);

create table px_vt(
	don_gia_xuat double,
    so_luong_xuat int,
    so_phieu_xuat int,
    ma_vat_tu int,
    
    primary key(so_phieu_xuat, ma_vat_tu),
    foreign key(so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
    foreign key(ma_vat_tu) references vat_tu(ma_vat_tu)
);


create table phieu_nhap(
	so_phieu_nhap int primary key auto_increment,
    ngay_nhap varchar(50) 
);

create table vt_pn(
	don_gia_nhap double,
    so_luong_nhap int,
    ma_vat_tu int,
    so_phieu_nhap int,
    
    primary key(ma_vat_tu, so_phieu_nhap),
    foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
    foreign key(so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);

create table so_dien_thoai(
	ma_sdt int primary key,
    sdt varchar(10)
);
create table nha_cung_cap(
	ma_nha_cung_cap int primary key auto_increment,
    ten_nha_cung_cap varchar(50),
    dia_chi varchar(50),
    ma_sdt int,
    foreign key(ma_sdt) references so_dien_thoai(ma_sdt)
);


create table don_dat_hang(
	so_don_hang int primary key auto_increment,
    ngay_dat_hang varchar(50),
    ma_nha_cung_cap int,
    foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
);


create table vt_ddh(
	ma_vat_tu int,
    so_don_hang int,
    
    primary key(ma_vat_tu, so_don_hang),
    foreign key(ma_vat_tu) references vat_tu(ma_vat_tu),
    foreign key(so_don_hang) references don_dat_hang(so_don_hang)
);


