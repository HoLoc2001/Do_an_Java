create database qlbh;
use qlbh;

CREATE TABLE `khachhang` (
  `MaKH` varchar(50) NOT NULL,
  `TenKH` varchar(50) NOT NULL,
  `DiaChi` varchar(100),
  `TongTien` varchar(50) DEFAULT '0',
  PRIMARY KEY (`MaKH`)
);

CREATE TABLE `nhanvien` (
  `MaNV` varchar(50) NOT NULL,
  `TenNV` varchar(50) NOT NULL,
  `SDT` int NOT NULL,
  `DiaChi` varchar(100) NOT NULL,
  `ChucVu` bit(1) NOT NULL,
  `NgayNC` date NOT NULL,
  `MatKhau` varchar(50) NOT NULL,
  PRIMARY KEY (`MaNV`)
);

CREATE TABLE `sanpham` (
  `MaSP` varchar(50) NOT NULL,
  `TenSP` varchar(100) NOT NULL,
  `SL` int NOT NULL,
  `GiaGoc` bigint NOT NULL,
  `Loai` varchar(50) NOT NULL,
  PRIMARY KEY (`MaSP`)
);

CREATE TABLE `hoadon` (
  `MaHD` int NOT NULL auto_increment,
  `ThoiGian` datetime NOT NULL,
  `MaKH` varchar(50) NOT NULL,
  `TenNV` varchar(50) NOT NULL,
  `SL` int NOT NULL,
  PRIMARY KEY (`MaHD`),
  FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`)
);
CREATE TABLE `chitiethd` (
  `MactHD` int NOT NULl,
  `TenSP` varchar(500) NOT NULL,
  `SL` int NOT NULL,
  `Gia` bigint NOT NULL default 0,
  PRIMARY KEY (`MactHD`,`TenSP`),
  FOREIGN KEY (`Macthd`) REFERENCES `hoadon` (`Mahd`)
);



insert sanpham
values('CMK8GX4M1E3000C16','(8GB DDR4 1x8G 3000) RAM Corsair Vengeance LPX CL16-20-20-38',17,1090000,'RAM'),
('GP-GR26C16S8K1HU408','(8GB DDR4 1x8G 2666) Ram Gigabyte Memory 2666',8,1390000,'RAM'),
('F4-2800C17S-8GVR','(8G DDR4 1x8G 2800) G.SKILL Ripjaws V',10,1290000,'RAM'),
('TF4D416G3200HC16F01','(16GB DDR4 1x16GB 3200) RAM TeamGroup T-Force Delta RGB White',9,2090000,'RAM'),
('KF552C40BB-16','(16GB DDR4 1x16GB 5200) RAM Kingston Fury Beast DDR5',8,3990000,'RAM'),
('Core i3 10100F','Intel Core i3 10100F / 6MB / 4.3GHZ / 4 nhân 8 luồng / LGA 1200',18,2990000,'CPU'),
('Core i5 10400F','Intel Core i5 10400F / 12MB / 4.3GHz / 6 Nhân 12 Luồng / LGA 1200',10,4990000,'CPU'),
('Ryzen 3 3200G','AMD Ryzen 3 3200G / 6MB / 4.0GHz / 4 nhân 4 luồng / AM4',10,2990000,'CPU'),
('Ryzen 5 3500X','AMD Ryzen 5 3500X / 32MB / 4.1GHz / 6 nhân 6 luồng / AM4',5,4090000,'CPU'),
('Core i7 10700KF','Intel Core i7 10700KF / 16MB / 5.1GHz / 8 Nhân 16 Luồng / LGA 1200',20,9490000,'CPU'),
('PH-GT1030-O2G','ASUS Phoenix GeForce GT 1030 OC 2GB GDDR5',20,2990000,'VGA'),
('PH-GTX1050TI-4G','ASUS Phoenix GeForce GTX 1050 Ti 4GB GDDR5',9,6290000,'VGA'),
('GV-N105TOC-4GL','GIGABYTE GeForce GTX 1050 Ti OC Low Profile 4G',6,5990000,'VGA'),
('TUF-GTX1650-O4GD6-P-GAMING','ASUS TUF Gaming GeForce GTX 1650 OC Edition 4GB GDDR6',20,8190000,'VGA'),
('DUAL-RX6600XT-O8G','ASUS Dual Radeon RX 6600 XT OC Edition 8GB GDDR6',9,15490000,'VGA'),
('SSD7CS900-120-RB','SSD PNY CS900 120G 2.5" Sata 3',6,790000,'SSD'),
('GP-GSTFS31240GNTD','Gigabyte SSD 240GB 2.5" Sata 3',6,1090000,'SSD'),
('GP-GSM2NE8256GNTD','SSD GIGABYTE M.2 PCIe 256GB',6,1490000,'SSD'),
('WDS250G2B0C','SSD WD Blue SN550 250GB M.2 2280 NVMe Gen3 x4',6,1450000,'SSD'),
('MZ-V8V250BW','SSD Samsung 980 M.2 PCIe NVMe 250GB',6,1990000,'SSD'),
('WD10EZEX','HDD WD Blue 1TB 7200rpm',9,1100000,'HDD'),
('ST1000LM048','Ổ cứng HDD Seagate 1TB Barracuda 2.5inch SATA 3',9,1200000,'HDD'),
('WD20EZRZ','HDD WWD HDD 3TB Blue 5400rpm',9,2450000,'HDD'),
('WD60EFRX','HDD WD Red 6TB 5400RPM',9,5990000,'HDD'),
('G502','Chuột Logitech G502 Hero',6,17900000,'Chuot'),
('G102','Chuột Logitech G102 Lightsync RGB Black',6,599000,'Chuot'),
('LM115G','Chuột Dare-U LM115G - Black',6,5000000,'Chuot'),
('EM901','Chuột DareU EM901 RGB Wireless',6,640000,'Chuot'),
('G403','Chuột Logitech G403 HERO',6,990000,'Chuot'),
('K63','Bàn phím Corsair K63 Wireless',6,2990000,'Ban phim'),
('AK533','Bàn phím Ajazz AK533 Chocolate Cubes 87',6,890000,'Ban phim'),
('G610','Bàn phím Logitech G610 Orion',6,290000,'Ban phim'),
('EK87','Bàn phím DareU EK87 Pink White',6,550000,'Ban phim'),
('EH416','Tai nghe DareU EH416 RGB',6,380000,'Tai nghe'),
('EH925S','Tai nghe DareU EH925S 7.1 RGB',6,1090000,'Tai nghe'),
('VH520C','Tai nghe Rapoo VH520C',6,790000,'Tai nghe'),
('G331','Tai nghe Logitech G331',6,1549000,'Tai nghe');

insert nhanvien values
("001","Nguyen Van A", 0987654321, "123 Nguyen Van Cu, An Hoa, Ninh Kieu, Can Tho", 1, "2021/4/23", "0987654321"),
("002","Le Van B", 0987233231, "75 Nguyen Tri Phuong, An Hoa, Ninh Kieu, Can Tho", 1, "2020/1/3","0987233231"),
("003","Tran Van C", 0913677821, "93 Nguyen Van Cu, An Hoa, Ninh Kieu, Can Tho", 1, "2021/4/10", "0913677821"),
("004","Cao Van D", 0987425221, "62 Nguyen Hien Thanh, An Hoa, Ninh Kieu, Can Tho", 1, "2020/12/11","0987425221"),
("005","Nguyen Van H", 0234534321, "456 Nguyen Van Cu, An Hoa, Ninh Kieu, Can Tho", 0, "2020/1/4", "0234534321");

DELIMITER $$
CREATE PROCEDURE USP_USER(username varchar(50),pass varchar(50))
BEGIN
  SELECT manv, tennv ,chucvu from nhanvien where manv = username and matkhau = pass;
END; $$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE USP_HoaDon(Ma_kh varchar(50),Ten_nv varchar(50), _sl int, tong_tien bigint)
BEGIN
  DECLARE tong_Tien_old bigint DEFAULT 0;
  insert hoadon(Thoigian,makh,tennv,sl) values (CURDATE(),Ma_kh, Ten_nv, _sl);
  select tongtien into tong_tien_old from khachhang  where makh = Ma_kh;
  update khachhang  set TongTien =  tong_tien + tong_tien_old where makh = Ma_kh; 
END; $$
DELIMITER ;


DELIMITER $$
CREATE PROCEDURE USP_CT_HoaDon(Ten_SP varchar(50),_sl int, gia_ bigint)
BEGIN
  insert into Chitiethd(macthd,tensp,sl,gia) values ((select max(mahd) from hoadon),Ten_SP, _sl, gia_);
END; $$
DELIMITER ;





drop procedure USP_DoanhThu;
DELIMITER $$
CREATE PROCEDURE USP_DoanhThu()
BEGIN
  select sp.tensp,case
when sum(ct.gia) > 0 then sum(ct.gia)
else 0
end as gia,
sp.loai, case
when sum(ct.sl) > 0 then sum(ct.sl)
else 0
end as sl
from sanpham sp left join chitiethd ct on sp.tensp = ct.tensp
group by sp.tensp;
END; $$
DELIMITER ;




DELIMITER $$
CREATE TRIGGER UTG_SanPham_insert
before insert ON chitiethd
FOR EACH ROW
BEGIN
DECLARE sl_sp INT DEFAULT 0;
select sl into sl_sp from sanpham where tensp = new.tensp;
update sanpham set sl = (sl_sp - new.sl) where tensp = new.tensp;
END; $$
DELIMITER ;


