create database escola_educ; -- criando tabela

use escola_educ;

-- Atributos
create table tb_alunos (
id bigint (5) auto_increment,
nome varchar (20) not null,
idade bigint (5),
matricula boolean,
curso varchar (20) not null,
nota decimal (10,2),
primary key (id)
);

-- inserindo os dados
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Camila", 20, true, "Medicina", 9.5);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Milena", 28, true, "Educacão Fisica", 8.2);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Luiz", 30, true, "Analise de Sistemas", 7.5);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Mariana", 29, true, "Recursos Humanos", 8.5);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Luiza", 35, true, "Advocacia", 9.1);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Bruno", 55, true, "Processos Gerenciais", 10.0);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Alan", 35, true, "Administracao", 8.0);
insert into tb_alunos (nome, idade, matricula, curso, nota) values ("Tais", 26, true, "Psicologia", 9.8);

select * from tb_alunos;

select * from tb_alunos where nota > 7;

select * from tb_alunos where nota < 7;

-- atualizando dados
update tb_alunos set nota = 6.5 where id = 4;

select * from tb_alunos;