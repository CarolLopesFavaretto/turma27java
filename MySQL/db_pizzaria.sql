create database db_pizzaria;

use db_pizzaria;

create table tb_categoria (
id bigint (5) auto_increment,
sabor varchar (20) not null,
massa varchar (20) not null,
sabor_disponivel varchar (20) not null,
primary key (id)

);

select * from tb_categoria;

insert into tb_categoria (sabor, massa, sabor_disponivel) values ("Doce", "Normal", "sim");
insert into tb_categoria (sabor, massa, sabor_disponivel) values ("Salgado", "Normal", "sim");
insert into tb_categoria (sabor, massa, sabor_disponivel) values ("Salgado", "Pam", "sim");
insert into tb_categoria (sabor, massa, sabor_disponivel) values ("Doce", "Integral", "sim");
insert into tb_categoria (sabor, massa, sabor_disponivel) values ("Salgado", "Integral", "sim");

select * from tb_categoria;



create table tb_pizza (
id bigint (5) auto_increment,
nome varchar (20) not null,
tamanho  varchar (20) not null,
borda_recheada boolean,
ingrediente_extra  varchar (20) not null,
preco decimal (4,2),
categoria_id bigint (5) not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)

);

select * from tb_pizza;



insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Manjericao", "Grande", true, "Cebola", 38.50, 2);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Brocolis", "Grande", false, "Milho", 42.50, 2);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("KitKat", "Broto", false, "Nao", 48.90, 1);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Banana com canela", "Grande", false, "Acucar Mascavo", 37.80, 4);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Baiana", "Grande", true, "Bacon", 47.80, 3);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Portuguesa", "Broto", true, "Palmito", 49.50, 3);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Atum", "Grande", true, "Cebola", 44.50, 2);
insert into tb_pizza (nome, tamanho, borda_recheada, ingrediente_extra, preco, categoria_id ) values ("Calabresa", "Broto", true, "Queijo", 49.50, 2);

select * from tb_pizza;

select * from tb_pizza where preco > 45.00;

select * from tb_pizza where preco > 29.00 and preco <= 60.00
order by preco asc;

select * from tb_pizza where tb_pizza.nome like "%Cal%";
select * from tb_pizza where tb_pizza.nome like "%C%";

select tb_pizza.nome, 
tb_pizza.tamanho, 
tb_pizza.preco, 
tb_pizza.categoria_id,
tb_categoria.sabor, 
tb_categoria.massa,
tb_categoria.sabor_disponivel
from tb_pizza
inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id

where tb_categoria.sabor in ("doce") and tb_categoria.massa = "normal" 
or tb_categoria.massa = "integral"

