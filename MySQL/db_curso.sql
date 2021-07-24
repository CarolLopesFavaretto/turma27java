create database db_curso;

use db_curso;

create table tb_categoria (
id bigint (5) auto_increment,
tipo varchar (20) not null,
disponivel boolean,
duracao varchar (20) not null,
primary key (id)
);

select * from tb_categoria;

insert into tb_categoria (tipo, disponivel, duracao) values ("Programacao", true, "6 semestre");
insert into tb_categoria (tipo, disponivel, duracao) values ("Administracao", true, "6 semestre");
insert into tb_categoria (tipo, disponivel, duracao) values ("Comunicacao", true, "8 semestre");
insert into tb_categoria (tipo, disponivel, duracao) values ("Saude", true, "6 semestre");
insert into tb_categoria (tipo, disponivel, duracao) values ("Contabilidade", true, "6 semestre");

select * from tb_categoria;

create table tb_cursos (
id bigint (5) auto_increment,
nome varchar (20) not null,
matricula varchar (20) not null,
inicio varchar (20) not null,
mensalidade decimal (10,2) not null,
categoria_id bigint (5) not null,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)

);

select * from tb_cursos;

insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Relacoes Publicas", "001", "2022", 285.00 , 3);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Enfermagem", "002", "2022", 295.00 , 4);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Recursos Humanos", "003", "2022", 395.00 , 2);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Processos Gerenciais", "004", "2022", 399.00 , 2);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Ciencias Contabeis", "005", "2022", 498.00 , 5);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Comunicacao Social", "006", "2022", 485.00 , 3);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Logistaca", "007", "2022", 475.00 , 2);
insert into tb_cursos (nome, matricula, inicio, mensalidade, categoria_id) values ("Analise de Sistemas", "008", "2022", 699.00 , 1);

select * from tb_cursos;

select * from tb_cursos where mensalidade > 50.00;
select * from tb_cursos where mensalidade between 250.00 and 700.00
order by mensalidade asc;

select * from tb_cursos where nome like "%R%";

select tb_cursos.nome,
tb_cursos.mensalidade,
tb_cursos.categoria_id,
tb_categoria.tipo,
tb_categoria.disponivel
from tb_cursos
inner join tb_categoria on tb_categoria.id = tb_cursos.categoria_id

where tb_categoria.tipo like "%Adm%"