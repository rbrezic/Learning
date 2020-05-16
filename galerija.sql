# c:\xampp\mysql\bin\mysql -uedunova -pedunova < c:\jp22\hello\galerija.sql
drop database if exists galerijaslika;
create database galerijaslika;
use galerijaslika;

create table galerija(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
radno_vrijeme varchar(50),
slika int
);

create table slika(
sifra int not null primary key auto_increment,
vrsta varchar(50),
godina datetime,
naziv varchar(50),
autor int not null,
galerija int
);

create table autor(
sifra int not null primary key auto_increment,
ime varchar(50),
prezime varchar(50),
datum_rodenja varchar(50)
);

alter table slika add foreign key (galerija) references galerija(sifra);
alter table slika add foreign key (autor) references autor(sifra);

insert into galerija(sifra,naziv,radno_vrijeme)
values (null,'Suvremena','08:00-15:00');











