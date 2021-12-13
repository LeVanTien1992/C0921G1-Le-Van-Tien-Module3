create database quan_ly_ban_hang;
use quan_ly_ban_hang;

-- insert into customer(c_name, c_age)
-- values
-- ("Minh Quan", 10),
-- ("Ngoc Oanh", 20),
-- ("Hong Ha", 50);
SELECT * FROM quan_ly_ban_hang.customer;
-- insert into `order`(o_date, o_total_price, c_id)
-- values
-- ("2006-03-21",null,1),
-- ("2006-03-23",null,2),
-- ("2006-03-16",null,1);

SELECT * FROM quan_ly_ban_hang.`order`;
-- delete from `order`
-- where o_id = 1;

--  insert into product(p_name, p_price)
--  values
-- ("May Giat",3),
-- ("Tu Lanh",5),
-- ("Dieu Hoa",7),
-- ("Quat",1),
-- ("Bep Dien",2);
SELECT * FROM quan_ly_ban_hang.product;

--  insert into order_detail
--  values
-- (1,1,3),
-- (1,3,7),
-- (1,4,2),
-- (2,1,1),
-- (3,1,8),
-- (2,5,4),
-- (2,3,3);
SELECT * FROM quan_ly_ban_hang.order_detail;
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o_date, o_total_price, c_id
from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select *
from customer c join `order` o
on c.c_id = o.c_id join product p 
on c.c_id = p.p_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select *
from customer c join `order` o
on c.c_id = o.c_id right join product p 
on c.c_id = p.p_id;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện 
-- trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.o_id, o.o_date, p.p_price, sum(o_qty*p_price) as " Giá của từng loại" 
from `order` o join product p
on o.o_id = p.p_id left join order_detail od
on o.o_id = od.p_id
group by od.p_id;



