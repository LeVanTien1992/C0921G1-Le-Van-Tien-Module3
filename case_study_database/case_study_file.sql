-- 1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thoả mãn các yêu cầu bên dưới.
-- insert into furama.vi_tri
-- values
-- (1,"Quản Lý"),
-- (2,"Nhân Viên");
SELECT * FROM furama.vi_tri;

-- insert into furama.trinh_do
-- values
-- (1,"Trung Cấp"),
-- (2,"Cao Đẳng"),
-- (3,"Đại Học"),
-- (4,"Sau Đại Học");
SELECT * FROM furama.trinh_do;
-- insert into furama.bo_phan
-- values
-- (1,"Sale-Marketing"),
-- (2,"Hành chính"),
-- (3,"Phục vụ"),
-- (4,"Quản lý");
SELECT * FROM furama.bo_phan;

-- insert into furama.nhan_vien
-- values
-- (1,"Nguyễn Văn An","1970-11-07","456231786",10000000,"0901234121","annguyen@gmail.com","295 Nguyễn Tất Thành,Đà Nẵng",1,3,1),
-- (2,"Lê Văn Bình","1997-04-09","654231234",7000000,"0934212314","binhlv@gmail.com","22 Yên Bái, Đà Nẵng",1,1,2),
-- (3,"Hồ Thị Yến","1995-12-12","999231723",14000000,"0412352315","thiyen@gmail.com","K234/11 Điện Biên Phủ, Gia Lai",1,3,2),
-- (4,"Võ Công Toản","1980-04-04","123231365",17000000,"0374443232","toan0404@gmail.com","77 Hoàng Diệu, Quảng Trị",1,4,4),
-- (5,"Nguyễn Bỉnh Phát","1999-12-09","454363232",6000000,"0902341231","phatphat@gmail.com","43 Yên Bái, Đà Nẵng",2,1,1),
-- (6,"Khúc Nguyễn An Nghi","2000-11-08","964542311",7000000,"0978653213","annghi20@gmail.com","294 Nguyễn Tất Thành, Đà Nẵng",2,2,3),
-- (7,"Nguyễn Hữu Hà","1993-01-01","534323231",8000000,"0941234553","nhh0101@gmail.com","4 Nguyễn Chí Thanh, Huế",2,3,2),
-- (8,"Nguyễn Hà Đông","1989-09-03","234414123",9000000,"0642123111","donghanguyen@gmail.com","111 Hùng Vương, Hà Nội",2,4,4),
-- (9,"Tòng Hoang","1982-09-03","256781231",6000000,"0245144444","hoangtong@gmail.com","213 Hàm Nghi, Đà Nẵng",1,3,1),
-- (10,"Nguyễn Công Đạo","1994-01-08","755434343",8000000,"0988767111","nguyencongdao12@gmail.com","6 Hoà Khánh, Đồng Nai",2,3,2);
SELECT * FROM furama.nhan_vien;

-- insert into furama.loai_khach
-- values
-- (1,"Diamond"),
-- (2,"Platinium"),
-- (3,"Gold"),
-- (4,"Silver"),
-- (5,"Member");
SELECT * FROM furama.loai_khach;

-- insert into furama.khach_hang
-- values
-- (1,5,"Nguyễn Thị Hào","1970-11-07",0,"643431213","0945423362","thihao07@gmail.com","23 Nguyễn Hoàng, Đà Nẵng"),
-- (2,3,"Phạm Xuân Diệu","1992-08-08",1,"865342123","0954333333","xuandieu92@gmail.com","K77/22 Thái Phiên, Quảng Trị"),
-- (3,1,"Trương Đình Nghệ","1990-02-27",1,"488645199","0373213122","nghenhan2702@gmail.com","K323/12 Ông Ích Khiêm, Vinh"),
-- (4,1,"Dương Văn Quan","1981-07-08",1,"543432111","0490039241","duongquan@gmail.com","K453/12 Lê Lợi, Đà Nẵng"),
-- (5,4,"Hoàng Trần Nhi Nhi","1995-12-09",0,"795453345","0312345678","nhinhi123@gmail.com","224 Lý Thái Tổ, Gia Lai"),
-- (6,4,"Tôn Nữ Mộc Châu","2005-12-06",0,"732434215","0988888844","tonnuchau@gmail.com","37 Yên Thế, Đà Nẵng"),
-- (7,1,"Nguyễn Mỹ Kim","1984-04-08",0,"856453123","0912345698","kimcuong84@gmail.com","K123/45 Lê Lợi, Hồ Chí Minh"),
-- (8,3,"Nguyễn Thị Hào","1999-04-08",0,"965656433","0763212345","haohao99@gmail.com","55 Nguyễn Văn Linh, Kon Tum"),
-- (9,1,"Trần Đại Danh","1994-07-01",1,"432341235","0643343433","danhhai99@gmail.com","24 Lý Thường Kiệt, Quảng Ngãi"),
-- (10,2,"Nguyễn Tâm Đắc","1989-07-01",1,"344343432","0987654321","dactam@gmail.com","22 Ngô Quyền, Đà Nẵng");
SELECT * FROM furama.khach_hang;

-- insert into furama.kieu_thue
-- values
-- (1,"year"),
-- (2,"month"),
-- (3,"day"),
-- (4,"hour");
SELECT * FROM furama.kieu_thue;

-- insert into furama.loai_dich_vu
-- values
-- (1,"Villa"),
-- (2,"House"),
-- (3,"Room");
SELECT * FROM furama.loai_dich_vu;

-- insert into furama.dich_vu
-- values
-- (1,"Villa Beach Front",25000,10000000,10,1,3,"vip","Có hồ bơi",500,4),
-- (2,"House Princess 01",14000,5000000,7,2,2,"vip","Có thêm bếp nướng",null,3),
-- (3,"Room Twin 01",5000,1000000,2,3,4,"normal","Có tivi",null,null),
-- (4,"Villa No Beach Front",22000,9000000,8,1,3,"normal","Có hồ bơi",null,2),
-- (5,"House Princess 02",10000,4000000,5,2,3,"normal","Có thêm bếp nướng",500,4),
-- (6,"Room Twin 02",3000,900000,2,3,4,"normal","Có hồ bơi",null,null);
-- update dich_vu
-- set chi_phi_thue = 1000000
-- where ma_dich_vu = 1;
SELECT * FROM furama.dich_vu;

-- insert into furama.dich_vu_di_kem
-- values
-- (1,"Karaoke",10000,"giờ","tiện nghi, hiện đại"),
-- (2,"Thuê xe máy",10000,"chiếc","hỏng 1 xe"),
-- (3,"Thuê xe đạp",20000,"chiếc","tốt"),
-- (4,"Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng"),
-- (5,"Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng"),
-- (6,"Buffet buổi tối",16000,"suất","đầy đủ đồ ăn, tráng miệng");
SELECT * FROM furama.dich_vu_di_kem;

-- insert into furama.hop_dong
-- values
-- (1,"2020-12-08","2020-12-08",0,3,1,3),
-- (2,"2020-07-14","2020-07-21",200000,7,3,1),
-- (3,"2021-03-15","2021-03-17",50000,3,4,2),
-- (4,"2021-01-14","2021-01-18",100000,7,5,5),
-- (5,"2021-07-14","2021-07-15",0,7,2,6),
-- (6,"2021-06-01","2021-06-03",0,7,7,6),
-- (7,"2021-09-02","2021-09-05",100000,7,4,4),
-- (8,"2021-06-17","2021-06-18",150000,3,4,1),
-- (9,"2020-11-19","2020-11-19",0,3,4,3),
-- (10,"2021-04-12","2021-04-14",0,10,3,5),
-- (11,"2021-04-25","2021-04-25",0,2,2,1),
-- (12,"2021-05-25","2021-05-27",0,7,10,1);
SELECT * FROM furama.hop_dong;

-- insert into furama.hop_dong_chi_tiet
-- values
-- (1,5,2,4),
-- (2,8,2,5),
-- (3,15,2,6),
-- (4,1,3,1),
-- (5,11,3,2),
-- (6,1,1,3),
-- (7,2,1,2),
-- (8,1,12,2);
-- update hop_dong_chi_tiet
-- set so_luong = 2
-- where ma_hop_dong_chi_tiet = 8;
SELECT * FROM furama.hop_dong_chi_tiet;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select *
from nhan_vien
where (ho_ten like "H%" or ho_ten like "T%" or ho_ten like "K%") and (length(ho_ten) <=15);

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
-- muốn lấy được tuổi thì ta lấy năm hiện trừ năm trong ngày sinh sau đó so điều kiện đề bài để ra điều kiện 18-50
select *
from khach_hang kh
where (year(kh.ngay_sinh) between 1971 and 2003) and (kh.dia_chi like "%Đà Nẵng" or kh.dia_chi like "%Quảng Trị");

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần 
-- theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
-- dùng count để đếm mã hợp đồng khách hàng đặt bao nhiêu lần
-- sắp xếp tăng dần ta dùng asc ngược lại thì dùng desc
select kh.ma_khach_hang, kh.ho_ten, count(hd.ma_hop_dong) 'số lần đặt phòng' 
from khach_hang kh join hop_dong hd
on kh.ma_khach_hang = hd.ma_khach_hang join loai_khach lk
on kh.ma_loai_khach = lk.ma_loai_khach
where lk.ten_loai_khach like "Diamond"
group by kh.ma_khach_hang, kh.ho_ten
order by count(hd.ma_hop_dong) asc;


-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, 
-- ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức
--  như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
--  hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select kh.ma_khach_hang, kh.ho_ten, lk.ten_loai_khach, hd.ma_hop_dong, dv.ten_dich_vu,
hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, sum(ifnull(dv.chi_phi_thue,0) + ifnull(hdct.so_luong,0) * ifnull(dvdk.gia,0))'Tổng tiền'
from khach_hang kh left join hop_dong hd 
on kh.ma_khach_hang = hd.ma_khach_hang left join loai_khach lk
on kh.ma_loai_khach = lk.ma_loai_khach left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong left join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem left join dich_vu dv
on hd.ma_dich_vu = dv.ma_dich_vu 
group by hd.ma_hop_dong;

-- dùng ifnull để không hiện thị null trong bảng
-- join phải theo thứ tự để dễ nhìn và dễ đọc và sửa chửa cho khỏi rối
-- dùng left join để lấy hết nhưng khách hàng chưa từng đặt phòng


select  kh.ma_khach_hang, kh.ho_ten, lk.ten_loai_khach,ifnull( hd.ma_hop_dong,0) 'ma_hop_dong', ifnull(dv.ten_dich_vu,0)'ten_dich_vu',
 ifnull( hd.ngay_lam_hop_dong,0)'ngay_lam_hop_dong',ifnull( hd.ngay_ket_thuc,0) 'ngay_ket_thuc' ,
 sum(ifnull (dv.chi_phi_thue,0) +ifnull( hdct.so_luong, 0) * ifnull( dvdk.gia, 0)) as "Tong Tien"
from khach_hang kh left join hop_dong hd
on kh.ma_khach_hang = hd.ma_khach_hang left join loai_khach lk
on kh.ma_loai_khach = lk.ma_loai_khach left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong left join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem left join dich_vu dv
on hd.ma_dich_vu = dv.ma_dich_vu
group by hd.ma_hop_dong;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được
--  khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv join loai_dich_vu ldv
on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu join hop_dong hd
on dv.ma_dich_vu = hd.ma_dich_vu
where dv.ma_dich_vu not in(
	select hop_dong.ma_dich_vu
    from hop_dong
    where (month(ngay_lam_hop_dong) between 1 and 3) and year(ngay_lam_hop_dong)= 2021
)
group by hd.ma_dich_vu;
-- sử dụng truy vấn con(sub query) để thể hiện khách hàng chưa từng đặt sử dụng dịch vụ
-- dùng month để lấy tháng và dùng between để thực hiện điều kiện của bài là quý 1 (trong khoản tháng 1-3)
-- dùng year để thỏa điều kiện trong năm 2021 

select  dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv join loai_dich_vu ldv 
on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu join hop_dong hd
on dv.ma_dich_vu = hd.ma_dich_vu
where dv.ma_dich_vu not in(
	select hop_dong.ma_dich_vu
    from hop_dong
    where (month(ngay_lam_hop_dong) between 1 and 3 ) and year(ngay_lam_hop_dong) = 2021
	)
group by hd.ma_dich_vu;

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue,
--  ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng 
-- được khách hàng đặt phòng trong năm 2021.
select dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv join hop_dong hd
on dv.ma_dich_vu = hd.ma_dich_vu join loai_dich_vu ldv
on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
where dv.ma_dich_vu in (
	select hop_dong.ma_dich_vu
    from hop_dong
    where year(ngay_lam_hop_dong) = 2020
)
and  dv.ma_dich_vu not in (
	select hop_dong.ma_dich_vu
    from hop_dong
    where year(ngay_lam_hop_dong) = 2021
)
group by hd.ma_dich_vu;
-- vẫn dùng truy vấn con(sub query) để thỏa điều kiện not in 2021 và in 2020
-- dùng toán tử and để nối hai try vấn con lại

select  dv.ma_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue, ldv.ten_loai_dich_vu
from dich_vu dv join loai_dich_vu ldv 
on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu join hop_dong hd
on dv.ma_dich_vu = hd.ma_dich_vu
where dv.ma_dich_vu in(
	select hop_dong.ma_dich_vu
    from hop_dong
    where year(ngay_lam_hop_dong) = 2020
)
and dv.ma_dich_vu not in(
	select hop_dong.ma_dich_vu
    from hop_dong
    where year(ngay_lam_hop_dong) = 2021
)
group by hd.ma_dich_vu;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
-- Bước 1: dùng distinct để hiện thi họ tên không trùng nhau
select distinct khach_hang.ho_ten
from khach_hang;
-- Bước 2: dùng union để hiện thi họ tên không trùng nhau
select khach_hang.ho_ten
from khach_hang
union
select khach_hang.ho_ten
from khach_hang;
-- Bước 3: dùng group by để hiện thi họ tên không trùng nhau
select khach_hang.ho_ten
from khach_hang
group by khach_hang.ho_ten;

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hd.ngay_lam_hop_dong) 'Tháng', count(hd.ma_hop_dong) "số lượng khách hàng"
from hop_dong hd left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong
where year(hd.ngay_lam_hop_dong) = 2021
group by month(hd.ngay_lam_hop_dong)
order by hd.ngay_lam_hop_dong asc;
-- dùng hàm month để lấy tháng
-- dùng count để đếm tương ứng mỗi tháng thì bao nhiêu khách đặt , count theo mã id hay chính xác hơn mã hợp đồng như bài
-- sắp xếp tháng tăng dần thì dùng order by asc

select month(hd.ngay_lam_hop_dong) 'tháng', count(hd.ma_hop_dong)'số_lượng_khách_hàng' 
from hop_dong hd left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong
where year(hd.ngay_lam_hop_dong) = 2021
group by month(hd.ngay_lam_hop_dong)
order by hd.ngay_lam_hop_dong asc;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong, 
-- ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, sum(ifnull(hdct.so_luong,0))'so_luong_dich_vu_di_kem'
from hop_dong hd left join dich_vu dv 
on hd.ma_dich_vu = dv.ma_dich_vu left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong
group by hd.ma_hop_dong;
-- dùng left join để hiển thị hết mã hợp đồng
-- dùng ifnull để số lượng dịch vụ đi kèm không bị null

select hd.ma_hop_dong, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, hd.tien_dat_coc, sum(ifnull(hdct.so_luong,0)) 'số lượng dịch vụ di kèm' 
from hop_dong hd left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong left join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by hd.ma_hop_dong;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” 
-- và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
from khach_hang kh join loai_khach lk
on kh.ma_loai_khach = lk.ma_loai_khach join hop_dong hd
on kh.ma_khach_hang = hd.ma_khach_hang join hop_dong_chi_tiet hdct 
on hd.ma_hop_dong = hdct.ma_hop_dong join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
where lk.ten_loai_khach like "Diamond" and kh.dia_chi like "%Vinh%" or kh.dia_chi like "%Quảng Ngãi%";
-- để ý join tất cả các bảng có liên quan để tính toán, hiển thị, hay điều kiện
-- dùng where để xét điều kiện như địa chỉ, tên dịch vụ

select dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
from khach_hang kh join loai_khach lk 
on kh.ma_loai_khach = lk.ma_loai_khach join hop_dong hd
on kh.ma_khach_hang = hd.ma_khach_hang join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
where lk.ten_loai_khach = 'Diamond' 
and kh.dia_chi like '%Vinh%' or kh.dia_chi like '%Quảng Ngãi%'
group by dvdk.ma_dich_vu_di_kem, dvdk.ma_dich_vu_di_kem;

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu,
--  so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả 
-- các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hd.ma_hop_dong, nv.ho_ten, kh.ho_ten, kh.so_dien_thoai, dv.ma_dich_vu, dv.ten_dich_vu, sum(ifnull(hdct.so_luong,0))"so_luong_dich_di_kem", hd.tien_dat_coc
from hop_dong hd left join khach_hang kh
on hd.ma_khach_hang = kh.ma_khach_hang left join nhan_vien nv
on hd.ma_nhan_vien = nv.ma_nhan_vien left join dich_vu dv 
on hd.ma_dich_vu = dv.ma_dich_vu left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong
where hd.ma_dich_vu in(
	select hop_dong.ma_dich_vu
    from hop_dong
    where (month(ngay_lam_hop_dong) between 10 and 12) and year(ngay_lam_hop_dong) = 2020
)
and hd.ma_dich_vu not in(
	select hop_dong.ma_dich_vu
    from hop_dong
    where (month(ngay_lam_hop_dong) between 1 and 6) and year(ngay_lam_hop_dong) = 2021
)
group by hd.ma_hop_dong;
-- truy vấn con(sub query ) rồi nối lại bằng and, dùng not in và in
-- left join để lấy ra hết dịch vụ còn chưa đặt 
-- dùng between để lấy tháng đầu và cuối của điều kiện
-- year để lấy năm

select hd.ma_hop_dong, nv.ho_ten, kh.ho_ten, kh.so_dien_thoai, dv.ten_dich_vu,
sum(ifnull(hdct.so_luong,0))'so_luong_dich_vu_di_kem', hd.tien_dat_coc
from khach_hang kh left join hop_dong hd 
on kh.ma_khach_hang = hd.ma_khach_hang left join dich_vu dv
on hd.ma_dich_vu = dv.ma_dich_vu left join nhan_vien nv
on hd.ma_nhan_vien = nv.ma_nhan_vien left join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong left join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
where dv.ma_dich_vu in(
	select hop_dong.ma_dich_vu
    from hop_dong
	where (month(ngay_lam_hop_dong) between 10 and 12 ) and year(ngay_lam_hop_dong) = 2020
)
and dv.ma_dich_vu not in(
	select hop_dong.ma_dich_vu
    from hop_dong
   where (month(ngay_lam_hop_dong) between 1 and 16 ) and year(ngay_lam_hop_dong) = 2021
)
group by hd.ma_hop_dong, nv.ho_ten, kh.ho_ten, kh.so_dien_thoai, dv.ten_dich_vu, hd.tien_dat_coc;


-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

-- dùng count để đếm số lượng khách hàng đặt phòng
-- dùng having để thỏa điều kiện sử dụng nhiều nhất, cụ thể là 15 lần

select  dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem, sum(hdct.so_luong)'số lượng dịch vụ đi kèm' 
from khach_hang kh right join hop_dong hd
on kh.ma_khach_hang = hd.ma_khach_hang right join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong right join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
group by dvdk.ma_dich_vu_di_kem, dvdk.ten_dich_vu_di_kem
having sum(hdct.so_luong) >= 15;


-- 14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong,
--  ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).

-- dùng hàm count để đếm số lần sử dụng dịch vụ 
-- dùng having để set điều kiện dịch vụ đi kèm sử dụng duy nhất một lần
-- và dùng order by để sắp xếp mã hợp đồng theo thứ tự tăng dần, dùng asc
select distinct hd.ma_hop_dong,  ldv.ten_loai_dich_vu, dvdk.ten_dich_vu_di_kem, count(dvdk.ma_dich_vu_di_kem)'so lan su dung'
from hop_dong hd  join hop_dong_chi_tiet hdct
on hd.ma_hop_dong = hdct.ma_hop_dong  join dich_vu_di_kem dvdk
on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem  join dich_vu dv
on hd.ma_dich_vu = dv.ma_dich_vu  join loai_dich_vu ldv
on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
group by  dvdk.ten_dich_vu_di_kem
having count(dvdk.ma_dich_vu_di_kem) <= 1
order by hd.ma_hop_dong asc;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, 
-- dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

-- sử dụng between đặt hợp đồng trong khoản từ năm 2020 và 2021
-- dùng having để set điều kiện tối đa 3 hợp đồng
select nv.ma_nhan_vien, nv.ho_ten, td.ten_trinh_do, bp.ten_bo_phan, nv.so_dien_thoai, nv.dia_chi
from nhan_vien nv join trinh_do td
on nv.ma_trinh_do = td.ma_trinh_do join bo_phan bp
on nv.ma_bo_phan = bp.ma_bo_phan join hop_dong hd 
on nv.ma_nhan_vien = hd.ma_nhan_vien 
where year(hd.ngay_lam_hop_dong) between 2020 and 2021 
group by nv.ma_nhan_vien
having count(nv.ma_nhan_vien) <=3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

-- dùng try vấn con để hiện thị xóa
-- dùng between để set điều kiện trong khoản từ năm 2019 và 2021
SET FOREIGN_KEY_CHECKS = 0;
-- Khi nào delete thì chạy câu lệnh trên rồi mới delete
delete from nhan_vien
where nhan_vien.ma_nhan_vien not in(
	select * from (
		select nv.ma_nhan_vien
        from nhan_vien nv  join hop_dong hd 
		on nv.ma_nhan_vien = hd.ma_nhan_vien
		where year(hd.ngay_lam_hop_dong) between 2019 and 2021
	)
    tdlTmp
    -- khi sử dụng xóa và update bằng câu lệnh truy vấn con thì sử dụng câu lệnh này
 );
 -- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với
 -- Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
 
 -- dùng truy vấn con để update 
 SET SQL_SAFE_UPDATES = 0;
 update khach_hang
 set ma_loai_khach = 2
 where khach_hang.ma_khach_hang in(
	select * from(
	select kh.ma_khach_hang 
    from khach_hang kh left join hop_dong hd 
    on kh.ma_khach_hang = hd.ma_khach_hang left join loai_khach lk
    on kh.ma_loai_khach = lk.ma_loai_khach left join dich_vu dv 
    on hd.ma_dich_vu = dv.ma_dich_vu
    where year(ngay_ket_thuc) = 2021
    group by kh.ma_khach_hang
    having sum(dv.chi_phi_thue) > 10000000
    )
    tdlTmp
 );
 
 -- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
SET FOREIGN_KEY_CHECKS = 0;
-- Khi nào delete thì chạy câu lệnh trên rồi mới delete
 delete from khach_hang
 where khach_hang.ma_khach_hang in(
	select * from(
		select kh.ma_khach_hang
		from khach_hang kh join hop_dong hd
		on kh.ma_khach_hang = hd.ma_khach_hang 
		where year(ngay_lam_hop_dong) < 2021
    )
	tdlTmp
    -- khi sử dụng xóa và update bằng câu lệnh truy vấn con thì sử dụng câu lệnh này
    -- dùng dòng lệnh concat kh
 );
 
 -- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
 SET SQL_SAFE_UPDATES = 0;
update dich_vu_di_kem
set gia = gia * 2
where dich_vu_di_kem.ma_dich_vu_di_kem =(
	select * from (
		select dvdk.ma_dich_vu_di_kem
	from hop_dong hd left join hop_dong_chi_tiet hdct
	on hd.ma_hop_dong = hdct.ma_hop_dong left join dich_vu_di_kem dvdk
	on hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem left join dich_vu dv
	on hd.ma_dich_vu = dv.ma_dich_vu left join loai_dich_vu ldv
	on dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
	where year(hd.ngay_lam_hop_dong) = 2020
	group by  dvdk.ma_dich_vu_di_kem
	having  sum(hdct.so_luong)  > 10
    )
    	tdlTmp
);
 
 -- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống,
 -- thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
 
 -- dùng union all để nối hai bảng lại với nhau, lấy tất cả thông tin của hai bảng dùng right join
 select kh.ma_khach_hang, kh.ho_ten, kh.so_dien_thoai, kh.ngay_sinh, kh.dia_chi
 from khach_hang kh left join hop_dong hd
 on kh.ma_khach_hang = hd.ma_khach_hang left join nhan_vien nv
 on hd.ma_nhan_vien = nv.ma_nhan_vien
 group by kh.ma_khach_hang
 union all
select nv.ma_nhan_vien, nv.ho_ten, nv.so_dien_thoai, nv.ngay_sinh, nv.dia_chi
from khach_hang kh right join hop_dong hd
 on kh.ma_khach_hang = hd.ma_khach_hang right join nhan_vien nv
 on hd.ma_nhan_vien = nv.ma_nhan_vien
 group by nv.ma_nhan_vien;
