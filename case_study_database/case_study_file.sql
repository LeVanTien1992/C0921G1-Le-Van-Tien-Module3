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
SELECT * FROM furama.hop_dong_chi_tiet;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
SELECT *
FROM furama.nhan_vien 
WHERE ho_ten LIKE "H%" or ho_ten LIKE "T%" or ho_ten LIKE "K%" and length(ho_ten) <= 15;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *
from khach_hang
where (year(khach_hang.ngay_sinh) between 1971 and 2003 ) and dia_chi like "%Đà Nẵng%" or dia_chi like "%Quảng Trị%";

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần 
-- theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select count(k.ma_khach_hang), k.ho_ten, h.ma_hop_dong
from khach_hang k join hop_dong h
on k.ma_khach_hang = h.ma_hop_dong
group by k.ma_khach_hang, k.ho_ten,  h.ma_hop_dong;