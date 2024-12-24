create database DLLuong
go 
use DLLuong

create table tbNhanvien(
	MaNV nvarchar(50),
	Hoten nvarchar(50),
	Diachi nvarchar(50),
	Luong nvarchar(50)
)

insert into tbNhanvien
values	('a','a','a','a'),
		('b','b','b','b'),
		('c','c','c','c');

select * from tbNhanvien

SELECT * FROM tbNhanvien WHERE MaNV = 'a'