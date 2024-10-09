-- Inserir telefone
INSERT INTO telefone (codigoArea, numero) VALUES 
('63', '95832165'), ('62', '65478912'), ('91', '53315987'), ('15', '24578563'), ('67', '23547896'), 
('55', '17589632'), ('56', '74512365'), ('31', '77771234'), ('41', '66669874'), ('51', '55558796'), 
('32', '77574125'), ('32', '74569823'), ('87', '22038745'), ('11', '12345678'), ('21', '87654321'), 
('31', '98765432'), ('41', '23456789'), ('51', '87654321'), ('61', '98765432'), ('71', '23456789'), 
('81', '87654321');


INSERT INTO usuario (nome, username, dataNascimento, email, senha, id_telefone, sexo, cpf) 
VALUES 
('João Silva', 'Joao10', '1990-01-01', 'joao.silva@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 1, 1, '12345678901'),
('Maria Souza', 'Maria20', '1995-03-15', 'maria.souza@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 2, 2, '98765432109'),
('Ana Carolina Oliveira', 'anaoliveira', '1992-08-10', 'ana.oliveira@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 11, 2, '78945612385'),
('Rafael Souza', 'rafaelsouza', '1990-05-15', 'rafael.souza@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 3, 1, '15975346820'),
('Juliana Santos', 'julianasantos', '1994-11-20', 'juliana.santos@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 4, 2, '35715924680'),

('Rodrigo Oliveira', 'rodrigooliveira', '1985-03-05', 'rodrigo.oliveira@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 5, 1, '45698732100'),
('Leticia Alves', 'leticialves', '1998-09-12', 'leticia.alves@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 6, 2, '85236974100'),
('Amanda Oliveira', 'Amanda30', '1998-07-10', 'amanda.oliveira@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 7, 2, '85479632105'),
('Pedro Almeida', 'Pedrinho40', '2000-09-05', 'pedro.almeida@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 8, 1, '14785236987'),
('Lucas Fernandes', 'Luquinhas50', '1999-11-18', 'lucas.fernandes@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 9, 1, '36985214765'),
('Isabela Santos', 'Belinha60', '1997-04-30', 'isabela.santos@gmail.com', 'TRwn0XU29Gwl2sagG00bvjrNJvLuYo+dbOBJ7R3xFpU4m/FAUc5q8OoGbVNwPF7F5713RaYkN4qyufNCDHm/mA==', 10, 2, '25874196385');

-- Inserir Cliente
INSERT INTO cliente (cep, logradouro, complemento, bairro, localidade, uf, id_usuario) 
VALUES ('01310-100', 'Av. Paulista, 1000','Em frente ao shopping', 'Tabocão', 'São Paulo', 'SP', 1),
       ('20021-180', 'Rua da Lapa, 200', 'atrás do shopping', 'Madureira' , 'Rio de Janeiro', 'RJ', 2),
       ('01305-001', 'Rua Augusta, 300', 'Ao lado do mercado bom jesus', 'Buraco do padre', 'São Paulo', 'SP', 3),
       ('78010-000', 'Rua das Flores, 400', 'Em frente ao supermercado dois irmãos','Bairro abençoado' ,'Cuiabá', 'MT', 4),
       ('77015-002', 'Av. Tocantins, 500', 'Atrás do Big', 'Vila união', 'Palmas', 'TO', 5);

-- Inserir Funcionario
INSERT INTO funcionario (cargo, salario, id_usuario) 
VALUES ('Analista de Sistemas', 6000.00, 6), 
       ('Desenvolvedor Full Stack', 4500.00, 7),
       ('Analista de Suporte', 4000.00, 8),
       ('Estagiário de TI', 2500.00, 9),
       ('Estagiário de TI', 2500.00, 10),
       ('Estagiária de Marketing', 2500.00, 11);


-- Inserir autores
INSERT INTO autor (nome, biografia) 
VALUES 
       ('Colleen Hoover', 'Colleen Hoover é uma escritora norte-americana que escreve principalmente romances nos gêneros romântico e ficção para jovens adultos. Muitos de seus trabalhos foram autopublicados antes de serem adquiridos por uma editora.'),

       ('Ali Hazelwood', 'Ali Hazelwood é uma autora italiana, que viveu em diversos países antes de se mudar para os Estados Unidos para se doutorar em Neurociência. Que conquistou o mundo da literatura com seus romances de ficção científica que combinam humor, inteligência e romance'),
       
       ('Augusto Cury', 'Augusto Jorge Cury é um psiquiatra, professor e escritor brasileiro. Augusto é autor da Teoria da Inteligência Multifocal e seus livros foram publicados em mais de 70 países, com mais de 25 milhões de livros vendidos somente no Brasil.'),
       
       ('Nicholas Sparks', 'Nicholas Charles Sparks é um escritor norte-americano. Ele é conhecido por suas novelas românticas, muitas das quais se passam em Carolina do Norte, onde Sparks cresceu. Suas obras incluem O Diário da Nossa Paixão, Um Amor Para Recordar e Querido John.'),
       
       ('J.K. Rowling', 'Joanne Rowling, mais conhecida pelo pseudônimo J.K. Rowling, é uma escritora, roteirista e produtora cinematográfica britânica, mundialmente famosa pela série de livros Harry Potter.'),
       
       ('George Orwell', 'George Orwell foi um escritor e jornalista inglês. Sua obra é marcada por uma inteligência perspicaz e uma consciência profunda da injustiça social. Suas obras mais famosas incluem 1984 e A Revolução dos Bichos.');

-- Inserir gênero
INSERT INTO genero (nome, descricao) 
VALUES 
       ('Romance', 'Livros que enfocam em relacionamentos amorosos e desenvolvimento emocional dos personagens.'),

       ('Ficção Científica', 'Gênero literário que lida principalmente com cenários futuristas, tecnologia avançada e outras ciências e tecnologias imaginárias.'),
       
       ('Suspense', 'Gênero literário que cria um sentimento de excitação ou tensão emocional no leitor, frequentemente gerado por uma sequência de eventos inesperados.'),

       ('Fantasia', 'Gênero literário que envolve elementos sobrenaturais, como magia, criaturas místicas e mundos imaginários.'),
       
       ('Mistério', 'Gênero literário que envolve enigmas, investigações e situações inexplicáveis que desafiam a compreensão do leitor.'),
       
       ('Aventura', 'Gênero literário que narra histórias emocionantes e cheias de ação, muitas vezes envolvendo viagens, descobertas e desafios perigosos.');

-- Inserir fornecedores
INSERT INTO fornecedor (nome, cnpj, inscricaoEstadual, email, estado, cidade, quantLivrosFornecido, id_telefone) 
VALUES 
       ('Loja Moderna Ltda', '11.222.333/0001-99', '123456789', 'moderna@gmail.com', 'São Paulo', 'São Paulo', 300, 12),

       ('Companhia das Letras Ltda', '55.444.666/0001-88', '987654321', 'letras@gmail.com', 'São Paulo', 'São Paulo', 400, 13),
       
       ('Sextante Ltda', '99.777.333/0001-55', '123654987', 'sextante@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 350, 14),
       
       ('Livraria Cultura Ltda', '88.999.777/0001-66', '456123789', 'cultura@gmail.com', 'São Paulo', 'São Paulo', 500, 15),
       
       ('Saraiva S.A.', '77.666.555/0001-44', '789456123', 'saraiva@gmail.com', 'São Paulo', 'São Paulo', 450, 16),
       
       ('Editora Abril Ltda', '66.555.444/0001-33', '654987321', 'abril@gmail.com', 'São Paulo', 'São Paulo', 550, 17);

-- Inserir editora
INSERT INTO editora (nome, email, estado, cidade, id_telefone) 
VALUES 
       ('Atria Books', 'atriabooks@gmail.com', 'nova york', 'nova york', 18),
       
       ('Globo Livros', 'globolivros@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 19),
       
       ('Intrínseca', 'intrinseca@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 20),
       
       ('Editora Rocco', 'rocco@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 21);

-- Inserir livro
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, dataLancamento, descricao, classificacao, id_fornecedor, id_editora) 
VALUES 
       ('Confess', 39.90, 50, '9781501176838', '10/03/2015', 'Confess é um romance contemporâneo escrito por Colleen Hoover. O livro foi publicado em 2015 e é centrado em Auburn Reed e Owen Gentry. Auburn tem um passado difícil e encontra Owen, um artista misterioso, enquanto trabalha em uma galeria de arte. Juntos, eles embarcam em uma jornada emocional, desvendando segredos e enfrentando desafios que testam seu amor.', 6, 1, 1),

       ('A Hipotese do Amor', 29.99, 100, '9780593336823', '14/09/2021', 'The Love Hypothesis é um romance contemporâneo escrito por Ali Hazelwood. O livro narra a história de Olive Smith, uma estudante de pós-graduação determinada a provar uma teoria científica sobre o amor. Com a ajuda de seu charmoso professor, eles embarcam em uma jornada de descoberta científica e pessoal.', 5, 2, 2),
       
       ('O Vendedor de Sonhos', 34.90, 80, '9788575429039', '01/09/2021', 'O Vendedor de Sonhos é um romance psicológico escrito por Augusto Cury. O livro conta a história de um homem misterioso que salva a vida de um suicida e o convence a acompanhar em uma jornada para mudar a sociedade através de sonhos e reflexões profundas sobre a vida.', 1, 1, 2),
       
       ('Harry Potter e a Pedra Filosofal', 49.90, 100, '9788532530802', '26/06/1997', 'Harry Potter é uma série de sete romances de fantasia escrita pela autora britânica J.K. Rowling. Os livros narram as aventuras de um jovem bruxo, Harry Potter, e seus amigos Hermione Granger e Ron Weasley, todos estudantes na Escola de Magia e Bruxaria de Hogwarts.', 4, 4, 4),
       
       ('1984', 35.00, 80, '9788532530803', '08/06/1946', '1984 é um romance distópico escrito por George Orwell em 1948 e publicado em 1949. A obra é um dos maiores clássicos da literatura mundial e uma das mais influentes e importantes do século XX.', 4, 6, 3),
       
       ('O Diário da Nossa Paixão', 29.90, 70, '9788532511666', '01/10/1949', 'O Diário da Nossa Paixão é um romance do escritor norte-americano Nicholas Sparks, que relata a história de amor entre Noah Calhoun e Allie Nelson, que se conhecem e se apaixonam durante um verão.', 3, 5, 2),
       
       ('Harry Potter e as Relíquias da morte', 65.00, 20, '9788532522610', '21/07/2007', 'Encontro inevitável com Lord Voldemort não pode mais ser adiado. Harry, no entanto, precisa ganhar tempo para encontrar as Horcruxes que ainda estão faltando. E, pelo caminho, descobrir o que são afinal as Relíquias da Morte e como ele pode usá-las contra o Lorde das Trevas', 5, 5, 2);

-- Inserir relacionamento entre livro e autor
INSERT INTO livro_autor (idlivro, idautor) VALUES (1, 1);
INSERT INTO livro_autor (idlivro, idautor) VALUES (2, 2);
INSERT INTO livro_autor (idlivro, idautor) VALUES (3, 3);
INSERT INTO livro_autor (idlivro, idautor) VALUES (4, 4);
INSERT INTO livro_autor (idlivro, idautor) VALUES (5, 5);
INSERT INTO livro_autor (idlivro, idautor) VALUES (6, 6);

-- Inserir relacionamento entre livro e gênero
INSERT INTO livro_genero (idlivro, idgenero) VALUES (1, 1);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (2, 1);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (3, 2);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (4, 4);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (5, 2);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (6, 1);

-- Avaliacao
INSERT INTO avaliacao (dataAvaliacao, estrela, id_livro, id_cliente) 
VALUES 
       ('2023-01-22', 3, 1, 1),
       ('2023-02-08', 1, 2, 1);
INSERT INTO avaliacao (dataAvaliacao, estrela, id_livro, id_cliente, comentario)
       VALUES ('2022-11-09', 4, 3, 2, 'muito legal');

-- forma de pagamento
INSERT INTO formaPagamento (valor, confirmacaoPagamento, dataPagamento) 
VALUES 
       (511, true, '2023-06-10'),
       (140.25, true, '2023-06-15');

-- pix
INSERT INTO pix (nome, cpf, dataExpiracaoTokenPix, id) 
VALUES 
       ('Maria Souza', '98765432109', '2023-06-11', 1);

-- boleto
INSERT INTO boleto (id, nome, cpf, dataGeracaoBoleto, dataVencimento)
VALUES 
       (2, 'Maria Souza', '98765432109', '2023-06-15', '2023-06-25');

-- pedido
INSERT INTO pedido (dataPedido, valorTotal, ifPedidoFeito, id_formaPagamento, id_cliente)
VALUES 
       ('2023-06-10', 511, true, 1, 2),
       ('2023-06-15', 140.25, true, 2, 2);

-- itemPedido
INSERT INTO itemPedido (desconto, quantidade, subtotal, id_livro) 
VALUES 
       (3.00, 10, 270, 1),
       (1.25, 5, 88.25, 2),
       (0.90, 3, 52.60, 1),
       (0.0, 2, 511, 3),
       (0.0, 1, 140.25, 2);

-- Box
INSERT INTO box (nome, descricaoBox, quantidadeEstoque, id_fornecedor, id_editora, preco) 
VALUES 
       ('Harry Potter Box Set', 
       'Harry Potter é uma série sobre um jovem bruxo que descobre seu destino em um mundo mágico. Ao longo dos sete livros, ele enfrenta desafios, faz amigos e luta contra Voldemort, o bruxo responsável pela morte de seus pais. A história mistura magia, amizade e coragem, tornando-se um dos maiores fenômenos da literatura mundial. 
       1. Harry Potter e a Pedra Filosofal (223 páginas) - Harry descobre que é um bruxo e começa a estudar em Hogwarts. 
       2. Harry Potter e a Câmara Secreta (251 páginas) - Um mistério sobre uma câmara escondida ameaça Hogwarts. 
       3. Harry Potter e o Prisioneiro de Azkaban (317 páginas) - Harry descobre mais sobre seu passado enquanto lida com Sirius Black. 
       4. Harry Potter e o Cálice de Fogo (636 páginas) - Harry participa de um torneio perigoso. 
       5. Harry Potter e a Ordem da Fênix (766 páginas) - A resistência contra Voldemort cresce enquanto Harry descobre mais sobre sua conexão com o vilão. 
       6. Harry Potter e o Enigma do Príncipe (607 páginas) - Harry se aproxima de Dumbledore para entender o passado de Voldemort. 
       7. Harry Potter e as Relíquias da Morte (607 páginas) - A batalha final contra Voldemort se aproxima.', 
       50, 1, 2, 299.99),

       ('The Lord of the Rings Trilogy', 
       'A épica jornada de Frodo e seus amigos para destruir o Um Anel. Escrito por J.R.R. Tolkien, esta trilogia é um dos maiores marcos da literatura fantástica. 
       1. A Sociedade do Anel (423 páginas) - Frodo inicia sua jornada para destruir o Um Anel. 
       2. As Duas Torres (352 páginas) - A Irmandade se separa, e Frodo segue com Sam em direção a Mordor. 
       3. O Retorno do Rei (416 páginas) - A batalha final entre as forças de Sauron e a Terra Média acontece enquanto Frodo tenta destruir o anel.', 
       30, 2, 1, 349.90),

       ('The Chronicles of Narnia', 
       'O clássico de C.S. Lewis, Nárnia é um mundo mágico cheio de criaturas fantásticas e grandes aventuras, onde quatro irmãos são chamados a proteger a terra do mal. 
       1. O Leão, a Feiticeira e o Guarda-Roupa (206 páginas) - Quatro crianças descobrem o mundo de Nárnia e enfrentam a Feiticeira Branca. 
       2. Príncipe Caspian (240 páginas) - As crianças voltam a Nárnia para ajudar o príncipe a reclamar seu trono. 
       3. A Viagem do Peregrino da Alvorada (272 páginas) - Lúcia e Edmundo viajam com Caspian em busca de sete lordes perdidos. 
       4. A Cadeira de Prata (257 páginas) - Uma nova geração tenta resgatar o filho desaparecido do rei Caspian. 
       5. O Cavalo e Seu Menino (240 páginas) - Uma aventura no deserto enquanto um garoto e um cavalo fogem em busca de liberdade. 
       6. O Sobrinho do Mago (240 páginas) - A origem de Nárnia e a criação de seu mundo mágico. 
       7. A Última Batalha (228 páginas) - A conclusão épica da saga, onde Nárnia enfrenta sua batalha final.', 
       40, 1, 2, 259.99),

       ('Sherlock Holmes Collection', 
       'Uma coleção completa das aventuras do detetive mais famoso do mundo, Sherlock Holmes, criado por Sir Arthur Conan Doyle. 
       1. Um Estudo em Vermelho (188 páginas) - A primeira aparição de Sherlock Holmes e Dr. Watson, resolvendo um mistério de assassinato. 
       2. O Signo dos Quatro (283 páginas) - Uma aventura envolvendo um tesouro desaparecido e segredos do passado. 
       3. O Cão dos Baskervilles (256 páginas) - Sherlock investiga a lenda de um cão monstruoso em Dartmoor. 
       4. O Vale do Medo (320 páginas) - Um assassinato misterioso leva Sherlock a desvendar uma trama complexa.', 
       20, 3, 4, 199.90),

       ('Percy Jackson Box Set', 
       'A série Percy Jackson segue um jovem que descobre ser filho de um deus grego, enfrentando aventuras e desafios no mundo moderno. 
       1. O Ladrão de Raios (400 páginas) - Percy descobre que é filho de Poseidon e precisa encontrar o raio de Zeus. 
       2. O Mar de Monstros (304 páginas) - Percy enfrenta novos desafios para salvar seu amigo Grover. 
       3. A Maldição do Titã (336 páginas) - Percy e seus amigos tentam salvar a deusa Ártemis e uma amiga sequestrada. 
       4. A Batalha do Labirinto (368 páginas) - Percy precisa navegar no Labirinto para impedir a invasão de Luke. 
       5. O Último Olimpiano (400 páginas) - A batalha final entre os deuses e os titãs ameaça o Olimpo.', 
       35, 4, 2, 229.90);

-- Inserir relacionamento entre box e autor
-- INSERT INTO box_autor (idbox, idautor) VALUES (1, 1);
-- INSERT INTO box_autor (idbox, idautor) VALUES (2, 2);
-- INSERT INTO box_autor (idbox, idautor) VALUES (3, 3);
-- INSERT INTO box_autor (idbox, idautor) VALUES (4, 4);
-- INSERT INTO box_autor (idbox, idautor) VALUES (5, 5);

-- Inserir relacionamento entre box e gênero
INSERT INTO box_genero (idbox, idgenero) VALUES (1, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (2, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (3, 2);
INSERT INTO box_genero (idbox, idgenero) VALUES (4, 4);
INSERT INTO box_genero (idbox, idgenero) VALUES (5, 2);
