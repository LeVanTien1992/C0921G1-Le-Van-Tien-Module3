use quan_ly_ban_hang;

-- insert into customer(c_name, c_age)
-- values
-- ("Minh Quan", 10),
-- ("Ngoc Oanh", 20),
-- ("Hong Ha", 50);
SELECT * FROM quan_ly_ban_hang.customer;
-- insert into `order`(o_date, o_total_price, c_id)
-- values
-- ("3/3/2006",null,1),
-- ("3/23/2006",null,2),
-- ("3/16/2006",null,1);

SELECT * FROM quan_ly_ban_hang.`order`;
-- delete from `order`
-- where o_id = 1;

-- insert into product(p_name, p_price)
-- values
-- ("May Giat",3),
-- ("Tu Lanh",5),
-- ("Dieu Hoa",7),
-- ("Quat",1),
-- ("Bep Dien",2);
SELECT * FROM quan_ly_ban_hang.product;

-- insert into order_detail
-- values
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