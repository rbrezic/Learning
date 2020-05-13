# c:\xampp\mysql\bin\mysql -uedunova -pedunova < c:\jp22\hello\galerija.sql
drop database if exists galerijaslika;
create database galerijaslika;
use galerijaslika;

create table slika(
naziv varchar(50),
godina datetime,
vrsta varchar(50)
);




