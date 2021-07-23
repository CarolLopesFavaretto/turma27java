-- Pesquisa especifica por colunas com inner join;

select tb_produtos.nome, 
tb_produtos.preco, 
tb_marcas.nome 
from tb_produtos
inner join tb_marcas on tb_marcas.id = tb_produtos.marca_id

-- utilizando o like para buscar tudo o que for parecido/proximo do nome Zara;

  where tb_marcas.nome like "%za%" and tb_produtos.preco < 50.00;
  
 -- utilizando condição or para pesquisa
  where tb_produtos.nome = "tenis" or tb_produtos.nome = "camiseta";
