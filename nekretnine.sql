#c:\xampp\mysql\bin\mysql -uedunova -pedunova < c:\jp22\hello\nekretnine.sql
drop database if exists agencijazanekretnine;
create database agencijazanekretnine;
use agencijazanekretnine;

create table nekretnina(
sifra int not null primary key auto_increment,
vrsta int not null,
lokacija int not null,
naziv varchar(50) not null,
legalizacija boolean,
kvadratura varchar(50),
opis text,
vlasnik int not null
);

create table vrsta(
sifra int not null primary key auto_increment,
naziv varchar(50) not null
);

create table vlasnik(
sifra int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
kontakt varchar(50),
oib char(11),
spol varchar(10)
);

create table lokacija(
sifra int not null primary key auto_increment,
zupanija varchar(50) not null,
naziv_mjesta varchar(50) not null,
postanski_broj varchar(20) not null,
ulica varchar(100) not null,
broj_kuce varchar(20) not null
);

alter table nekretnina add foreign key (vrsta) references vrsta(sifra);

alter table nekretnina add foreign key (lokacija) references lokacija(sifra);

alter table nekretnina add foreign key (vlasnik) references vlasnik(sifra);