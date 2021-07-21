create database ecommerc_tech; -- criando tabela

use ecommerc_tech;

-- Atributos
create table tb_prodtech (
id bigint (5) auto_increment,
nome varchar (20) not null,
codigo varchar (20) not null,
marca varchar (20) not null,
estoque boolean,
preco decimal (10,2),
primary key (id)
);

-- inserindo os dados
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Fone de ouvido", "fdo", "Sony",true, 1300.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Webcam", "wcm", "Logitech",true, 300.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Teclado", "tcl", "Multilaser",true, 150.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Mousse", "mus", "logitech",true, 32.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Cabo HDMI", "cabH", "Ecko",true, 15.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Notebook", "ntk", "Samsung",true, 2890.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Echo Dot", "ehod", "Amazon ",true, 195.00);
insert into tb_prodtech (nome, codigo, marca, estoque, preco) values ("Pilha", "pla", "Duracell",true, 25.00);

select * from tb_prodtech;

select * from tb_prodtech where preco > 500.00;

select * from tb_prodtech where preco < 500.00;

-- atualizando dados
update tb_prodtech set preco = 1150.00 where id = 3;

select * from tb_prodtech;