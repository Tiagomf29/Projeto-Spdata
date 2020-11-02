create table tb_assunto
( id int auto_increment,
descricao varchar(100) not null,
constraint pk_tb_assunto primary key(id));

create table tb_contato
(id int auto_increment,
nome varchar(80)not null,
email varchar(255) not null,
telefone varchar(11) not null,
nome_empresa varchar(100) not null,
cargo varchar(100) not null,
endereco varchar(255)not null,
estado varchar(100),
data_hora timestamp not null,
mensagem blob not null,
constraint pk_tb_contato primary key(id));

create table tb_contato_assunto
(id int auto_increment,
id_contato int not null,
id_assunto int not null,
constraint pk_tb_contato primary key(id),
constraint fk_id_contato foreign key(id_contato)references tb_contato(id),
constraint fk_id_assunto foreign key(id_assunto)references tb_assunto(id));
