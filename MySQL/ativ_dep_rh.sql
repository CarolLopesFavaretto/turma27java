create database dep_rh; -- criando tabela

use dep_rh;

-- atributos
create table tb_funcionario(
id bigint (5) auto_increment,
nome varchar (20) not null,
idade bigint (5),
formacao boolean,
cargo varchar (20) not null,
salario decimal (10,2),
primary key (id)

); 

-- inserindo os dados
insert into tb_funcionario (nome, idade, formacao, cargo, salario) values ("Camila", 20, true, "Assistente Adm", 2800.00);
insert into tb_funcionario (nome, idade, formacao, cargo, salario) values ("Leonardo", 32, true, "Assistente Adm Pleno", 3300.00);
insert into tb_funcionario (nome, idade, formacao, cargo, salario) values ("Luiz", 19, true, "Estagiario", 1800.00);
insert into tb_funcionario (nome, idade, formacao, cargo, salario) values ("Daniela", 35, true, "Gerente", 4500.00);
insert into tb_funcionario (nome, idade, formacao, cargo, salario) values ("Bruno", 32, true, "Diretor", 7800.00);

select * from tb_funcionario;

-- deletando dado inserido a mais
delete from tb_funcionario where id = 6 ;

select * from tb_funcionario;

select * from tb_funcionario where salario > 2000.00;

select * from tb_funcionario where salario < 2000.00;

-- atualizando dados
update tb_funcionario set salario = 2000.00 where id = 4;

select * from tb_funcionario;
