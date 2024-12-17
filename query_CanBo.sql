create database QLCB
go
use QLCB


CREATE TABLE tbCanBo (
    SoTK INT,
    HoTen VARCHAR(50),
    GT VARCHAR(10),
    DiaChi VARCHAR(100),
    Luong INT
);

INSERT INTO tbCanBo (SoTK, HoTen, GT, DiaChi, Luong)
VALUES (123, 'abc', 'nam', 'ha noi', 0),
       (4, 'xyz', 'nam', 'hanoi', 1),
       (99, 'jqk', 'nu', 'hanoi', 23);

--drop database QLCB