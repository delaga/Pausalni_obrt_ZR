
drop database if exists pausalni_obrt;
create database pausalni_obrt default character set utf8;
use pausalni_obrt;

create table podaci_o_obrtu(
naziv varchar(155),
vlasnik varchar(155),
adresa varchar(155),
oib varchar(11),
iban varchar(21),
banka varchar(155),
djelatnost varchar(155),
email varchar(100),
telefon_mobitel varchar(20),
logo_URL varchar(200)
);

create table usluga_proizvod(
id int not null primary key auto_increment,
naziv varchar(55) not null,
opis text,
jedinica_mjere varchar(15) not null,
cijena decimal(18,2)
);

create table klijent_kupac(
id int not null primary key auto_increment,
naziv varchar(155) not null,
adresa varchar(155),
post_broj varchar(5),
grad varchar(25),
drzava varchar(25),
oib_jmbg varchar(13)
);

create table korisnik(
id int not null primary key auto_increment,
ime varchar(33) not null,
prezime varchar(33) not null,
email varchar(100),
lozinka varchar(200) not null,
mobitel varchar(20),
potpis_URL varchar(200)
);

create table stavka(
id int not null primary key auto_increment,
usluga_proizvod_id int not null,
racun_id int not null,
rabat decimal(18,2) default 0,
kolicina decimal(18,2)
);

create table racun(
id int not null primary key auto_increment,
broj_racuna varchar(10) not null,
klijent_kupac_id int not null,
vrijeme_idavanja datetime not null default current_timestamp,
datum_dospijeca datetime not null default current_timestamp,
datum_isporuke date,
izdao_korisnik_id int not null,
napomena text,
nacin_placanja varchar(33)
);

alter table stavka add foreign key (usluga_proizvod_id) references usluga_proizvod(id);
alter table stavka add foreign key (racun_id) references racun(id);
alter table racun add foreign key (klijent_kupac_id) references klijent_kupac(id);
alter table racun add foreign key (izdao_korisnik_id) references korisnik(id);

