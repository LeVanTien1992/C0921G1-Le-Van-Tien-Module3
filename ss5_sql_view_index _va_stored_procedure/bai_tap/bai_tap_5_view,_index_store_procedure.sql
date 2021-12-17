create database if not exists View_Index_Store_Procedure;
use View_Index_Store_Procedure;

CREATE TABLE products (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    productCode VARCHAR(20) NOT NULL,
    productName VARCHAR(50) NOT NULL,
    productPrice INT(20) NOT NULL,
    productAmount INT(20) NOT NULL,
    productDescription VARCHAR(255),
    productStatus VARCHAR(255) NOT NULL
);

insert into products(productCode,productName,productPrice,productAmount,productDescription,productStatus)
values	("P01","Iphone12ProMax",2000,1000,"Product from Apple","not available"),
		("P02","SamSung Galaxy Note10",1800,1200,"Product from Samsung","available"),
		("P03","BlackBerry 9900",1000,10000,"Product from BlackBerry","not available"),
		("P04","Nokia 1202",1100,9000,"Product from Nokia","available");

alter table products
add index indexProduct(productCode);

alter table products
add index compositeIndex(productName,productPrice);

SELECT *
FROM products
WHERE productCode = 'P03';
explain select * from products where productCode = 'P03';

SELECT *
FROM products
WHERE productName = 'Iphone12ProMax' AND productPrice = '2000';
explain select * from products where productName = 'Iphone12ProMax' and productPrice = '2000';

CREATE OR REPLACE VIEW ProductInfor AS
    SELECT productCode, productName, productPrice, productStatus
    FROM products;
    
SELECT *
FROM ProductInfor;

CREATE OR REPLACE VIEW ProductInfor AS
    SELECT 
        productCode,
        productName,
        productPrice,
        productStatus,
        productDescription
    FROM products
    WHERE productPrice = '1100';
    
SELECT *
FROM ProductInfor;

drop view ProductInfor;

delimiter $$
create procedure getProductInfor()
begin
	select * from products;
end $$
delimiter ;

call getProductInfor();

delimiter $$
create procedure addNewProduct()
begin
	insert into products(productCode,productName,productPrice,productAmount,productDescription,productStatus)
    values ("P05","HTC ONE",1400,5000,"Product from HTC","available");
end $$
delimiter ;

call addNewProduct();
call getProductInfor();

delimiter $$
create procedure editProductById(IN in_id int)
begin
	update products
    set productPrice = 1500
    where in_id = id;
end $$
delimiter ;

call editProductById(5);

delimiter $$
create procedure deleteProductById(IN in_id int)
begin
	delete from products
    where in_id = id;
end $$
delimiter ;

call getProductInfor();
call deleteProductById(2);
call getProductInfor();