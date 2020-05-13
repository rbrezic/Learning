# c:\xampp\mysql\bin\mysql -uedunova -pedunova < c:\jp22\hello\galerija.sql
drop database if exists galerijaslika;
create database galerijaslika;
use galerijaslika;

create table galerija(
sifra int not null primary key auto_increment,
naziv varchar(50),
radno_vrijeme datetime,
slika int
);

CREATE TABLE slika(
vrsta 
)






