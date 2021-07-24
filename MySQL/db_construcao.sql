create database db_construcao;

use db_construcao;

create table tb_categoria (
id bigint (5) auto_increment,
tipo varchar (20) not null,
estoque boolean,
primary key (id)
);

select * from tb_categoria;

insert into tb_categoria (tipo, estoque) values ("Hidraulico", true);
insert into tb_categoria (tipo, estoque) values ("Revestimento", true);
insert into tb_categoria (tipo, estoque) values ("Madeira", true);
insert into tb_categoria (tipo, estoque) values ("Acabamento", true);
insert into tb_categoria (tipo, estoque) values ("Eletrica", true);

select * from tb_categoria;

create table tb_produtos (
id bigint (5) auto_increment,
nome varchar (20) not null,
marca varchar (20) not null,
codigo varchar (20) not null,
preco decimal (4,2) not null,
categoria_id bigint (5) not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)

);

select * from tb_produtos;

insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Piso", "Rotocolor", "rotcl", 35.85, 2);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Porta", "MadeiraMa", "madem", 98.00, 3);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Gesso", "Sodimac", "sodm", 48.70, 2);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Macaneta", "MadeiraMa", "maden", 85.90, 4);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Torneira", "Tigre", "tgre", 79.80, 1);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Cuba", "Tigre", "ctgr", 99.30, 1);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Plafon", "Valencia", "vlc", 58.50, 5);
insert into tb_produtos (nome, marca, codigo, preco, categoria_id) values ("Spots Embutir", "Valencia", "svlc", 60.78, 5);

select * from tb_produtos where preco > 50.00;
select * from tb_produtos where preco between 3.00 and 60.00
order by preco asc;

select * from tb_produtos where nome like "%C%";

select tb_produtos.nome,
tb_produtos.preco,
tb_produtos.categoria_id,
tb_categoria.tipo
from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id

where tb_categoria.tipo in ("revestimento", "acabamento") 