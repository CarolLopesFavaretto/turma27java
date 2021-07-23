create database db_farmacia;

use db_farmacia;

create table tb_categoria(
id bigint (5) auto_increment,
tipo varchar (20) not null,
validade varchar (20) not null,
disponivel_estoque boolean,
primary key (id)

);

select * from tb_categoria;

insert into tb_categoria (tipo, validade, disponivel_estoque) values ("cosmetico", "12 meses", true);
insert into tb_categoria (tipo, validade, disponivel_estoque) values ("remedio", "6 meses", true);
insert into tb_categoria (tipo, validade, disponivel_estoque) values ("higiene", "3 meses", true);
insert into tb_categoria (tipo, validade, disponivel_estoque) values ("vitamina", "6 meses", true);
insert into tb_categoria (tipo, validade, disponivel_estoque) values ("beleza", "12 meses", true);

select * from tb_categoria;

create table tb_produtos(
id bigint (5) auto_increment,
nome varchar (20) not null,
marca varchar (20) not null,
composicao varchar (50) not null,
codigo varchar (20) not null,
preco decimal (4,2),
categoria_id bigint (5) not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)

);

select * from tb_produtos;

insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Bepantol", "Bayer", "Dexpantenol", "bptl", 35.85, 1);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Onemax", "Geolab", "Omeprazol", "ompz", 11.20, 2);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Pharmaton", "Sanofi", "Multivitamínico", "pharmt", 58.85, 4);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Lavitan", "Cimed", "Multivitamínico", "lavt", 32.85, 4);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Dove", "Unilever", "Shampoo", "dove", 18.85, 3);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Sabonete ", "Nivia", "Sabonete", "sbnv", 3.85, 3);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Esmalte", "Risque", "Esmalte", "ricq", 5.85, 5);
insert into tb_produtos (nome, marca, composicao, codigo, preco, categoria_id) value ("Alivium", "Mantecorp ", "Ibuprofeno", "alvu", 9.85, 2);

select * from tb_produtos;

select * from tb_produtos where preco > 50.00;

select * from tb_produtos where preco > 3 and preco <= 60.00
order by preco asc;

select * from tb_produtos where tb_produtos.nome like "%b%";

select tb_produtos.nome,
tb_produtos.preco,
tb_categoria.id,
tb_categoria.tipo,
tb_categoria.validade,
tb_categoria.disponivel_estoque
from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id

where tb_categoria.tipo in ("remedio") or tb_categoria.tipo = "vitamina"