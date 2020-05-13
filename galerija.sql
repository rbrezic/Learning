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

create table slika(
sifra int not null primary key auto_increment,
vrsta varchar(50),
godina datetime,
naziv varchar(50),
autor int
);

create table autor(
sifra int not null primary key auto_increment,
ime varchar(50),
prezime varchar(50),
datum_rodenja datetime
);








