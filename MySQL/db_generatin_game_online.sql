-- criando banco de dados

create database db_generation_game_online;

use db_generation_game_online;

-- criando primeira tabela;

create table tb_classe (
id bigint (5) auto_increment,
nome varchar (20) not null,
disponivel boolean,
primary key (id)
);

select * from tb_classe;

 -- atributos
insert into tb_classe (nome, disponivel) values ("Arqueiro", true);
insert into tb_classe (nome, disponivel) values ("Cacador", true);
insert into tb_classe (nome, disponivel) values ("Bruxo", true);

select * from tb_classe;

-- criando segunda tabela

create table tb_personagens (
id bigint (5) auto_increment,
nome varchar (10) not null,
inteligencia bigint (5) not null,
defesa bigint (5) not null,
ataque bigint (5) not null,
agilidade bigint (5) not null,
classe_id bigint (5) not null,
primary key (id),
foreign key (classe_id) references tb_classe (id) -- adicionando a chave estrangeira

);

select * from tb_personagens;

 -- atributos
insert into tb_personagens (nome, inteligencia, defesa, ataque, agilidade,classe_id) values ("Rakyu", 900, 1500, 2500, 4000, 1);
insert into tb_personagens (nome, inteligencia, defesa, ataque, agilidade, classe_id) values ("Vawie", 1500, 3000, 5500, 6000, 1);
insert into tb_personagens (nome, inteligencia, defesa, ataque, agilidade, classe_id) values ("Camyo", 1000, 1800, 2200, 3000, 2);
insert into tb_personagens (nome, inteligencia, defesa, ataque, agilidade, classe_id) values ("Daimon", 2000, 1500, 3500, 5000, 3);
insert into tb_personagens (nome, inteligencia, defesa, ataque, agilidade, classe_id) values ("Cedro", 2000, 3000, 5500, 7000, 2);

-- Atualizando alguns nomes
update tb_personagens set nome = "Camisy" where id = 4;
update tb_personagens set nome = "Keyvy" where id = 5;
update tb_personagens set nome = "Ody" where id = 6;
update tb_personagens set nome = "Zurik" where id = 7;

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where defesa > 1000 and defesa <=2000;

-- pesquisa de nomes iniciados com a letra C, utilizando where e like

 select * from tb_personagens where tb_personagens.nome like "%C%";
 
 -- pesquisa de colunas especificas com join
 
 select tb_personagens.nome, 
tb_personagens.classe_id,
tb_classe.nome,
tb_classe.disponivel
from tb_personagens
inner join tb_classe on tb_classe.id = tb_personagens.classe_id

-- pesquisa de uma informação especifica utilizando like

  where tb_classe.nome like "%ar%";


	


