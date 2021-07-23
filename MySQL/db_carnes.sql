create database db_carnes;

use db_carnes;

create table tb_categoria(
id bigint (5) auto_increment,
tipo varchar (20) not null,
validade varchar (20) not null,
estoque boolean,
primary key (id)

);

select * from tb_categoria;

insert into tb_categoria (tipo, validade, estoque) values ("Suino", "1 meses", true);
insert into tb_categoria (tipo, validade, estoque) values ("Aves", "2 meses", true);
insert into tb_categoria (tipo, validade, estoque) values ("Bovino", "2 meses", true);
insert into tb_categoria (tipo, validade, estoque) values ("Pescados", "1 meses", true);
insert into tb_categoria (tipo, validade, estoque) values ("Embutidos", "4 meses", true);

select * from tb_categoria;

create table tb_produtos (
id bigint (5) auto_increment,
nome varchar (20) not null,
marca varchar (20) not null,
congelado boolean,
peso decimal (4,2) not null,
preco decimal (4,2) not null,
categoria_id bigint (5)  not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Carne moida", "Friboi", true, 1, 35.85, 3);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Patinho", "Friboi", true, 1, 52.85, 3);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Bisteca", "Friboi", true, 1, 23.85, 1);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Pernil", "Friboi", true, 1, 29.85, 1);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Peito de frango", "Seara", true, 1, 14.85, 2);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Sobrecoxa", "Seara", true, 1, 9.85, 2);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("File de Merluza", "Seara", true, 1, 38.85, 4);
insert into tb_produtos (nome, marca, congelado, peso, preco, categoria_id) value ("Calabresa", "Seara", true, 1, 32.85, 5);

select * from tb_produtos;

select * from tb_produtos where preco > 50.00;

select * from tb_produtos where preco > 3 and preco <= 60.00
order by preco asc;

select * from tb_produtos where tb_produtos.nome like "%c%";

select tb_produtos.nome,
tb_produtos.preco,
tb_categoria.id,
tb_categoria.tipo,
tb_categoria.estoque
from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id

where tb_categoria.tipo in ("suino") or tb_categoria.tipo = "embutidos"