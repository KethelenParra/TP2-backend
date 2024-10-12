-- Inserir telefone
INSERT INTO telefone (codigoArea, numero) VALUES 
('63', '995832165'), ('62', '965478912'), ('91', '953315987'), ('15', '924578563'), 
('67', '923547896'), ('55', '917589632'), ('56', '974512365'), ('31', '977771234'), 
('41', '966669874'), ('51', '955558796'), ('32', '977574125'), ('32', '974569823'), 
('87', '922038745'), ('11', '912345678'), ('21', '987654321'), ('31', '998765432'), 
('41', '923456789'), ('51', '987654321'), ('61', '998765432'), ('71', '923456789'), 
('81', '987654321'), ('85', '966669999'), ('44', '955550000'), ('88', '912345678'), 
('82', '923456789'), ('34', '987654321'), ('30', '999887766'), ('54', '911223344'), 
('64', '922334455'), ('78', '933445566'), ('80', '944556677'), ('42', '955667788'), 
('36', '966778899'), ('40', '977889900'), ('90', '988990011');

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
       ('George Orwell', 'George Orwell foi um escritor e jornalista inglês. Sua obra é marcada por uma inteligência perspicaz e uma consciência profunda da injustiça social. Suas obras mais famosas incluem 1984 e A Revolução dos Bichos.'),
       ('Stephen King', 'Stephen King é um autor americano conhecido por seus romances de horror e ficção sobrenatural. Suas obras incluem O Iluminado, It e Carrie.'),
       ('Agatha Christie', 'Agatha Christie foi uma escritora inglesa conhecida por seus romances policiais, como Assassinato no Expresso do Oriente e O Caso dos Dez Negrinhos.'),
       ('Paulo Coelho', 'Paulo Coelho é um escritor brasileiro conhecido por seus romances espirituais, sendo o mais famoso O Alquimista.'),
       ('Margaret Atwood', 'Margaret Atwood é uma escritora canadense, amplamente reconhecida por seu romance O Conto da Aia, que explora temas de opressão e feminismo.'),
       ('Isaac Asimov', 'Isaac Asimov foi um autor de ficção científica russo-americano, mais conhecido por suas séries Fundação e Robôs.'),
       ('Neil Gaiman', 'Neil Gaiman é um autor inglês conhecido por suas obras de fantasia sombria, como Deuses Americanos e Sandman.'),
       ('Haruki Murakami', 'Haruki Murakami é um romancista japonês que combina realismo mágico e ficção surrealista, autor de obras como Kafka à Beira-Mar e 1Q84.'),
       ('Tolkien', 'J.R.R. Tolkien foi um autor e professor inglês, mais conhecido por suas obras de fantasia épica, O Senhor dos Anéis e O Hobbit.'),
       ('Gabriel García Márquez', 'Gabriel García Márquez foi um autor colombiano, ganhador do Prêmio Nobel de Literatura e conhecido por seu livro Cem Anos de Solidão.'),
       ('Arthur Conan Doyle', 'Arthur Conan Doyle foi um escritor escocês, mais conhecido por ter criado o detetive Sherlock Holmes.'),
       ('Ernest Hemingway', 'Ernest Hemingway foi um autor e jornalista americano, ganhador do Prêmio Nobel de Literatura, conhecido por obras como O Velho e o Mar.'),
       ('James Joyce', 'James Joyce foi um romancista e poeta irlandês, mais conhecido por seu trabalho modernista Ulisses.'),
       ('F. Scott Fitzgerald', 'F. Scott Fitzgerald foi um romancista americano famoso por seu romance O Grande Gatsby, retratando a Era do Jazz nos Estados Unidos.'),
       ('Jane Austen', 'Jane Austen foi uma autora inglesa cujas obras, como Orgulho e Preconceito, são mundialmente apreciadas por suas críticas sociais e personagens femininas fortes.'),
       ('Virginia Woolf', 'Virginia Woolf foi uma escritora inglesa, uma das figuras mais importantes do modernismo literário do século XX, conhecida por suas obras como Mrs. Dalloway e Ao Farol.');

-- Inserir gênero
INSERT INTO genero (nome, descricao) 
VALUES 
       ('Romance', 'Livros que enfocam em relacionamentos amorosos e desenvolvimento emocional dos personagens.'),
       ('Ficção Científica', 'Gênero literário que lida principalmente com cenários futuristas, tecnologia avançada e outras ciências e tecnologias imaginárias.'),
       ('Suspense', 'Gênero literário que cria um sentimento de excitação ou tensão emocional no leitor, frequentemente gerado por uma sequência de eventos inesperados.'),
       ('Fantasia', 'Gênero literário que envolve elementos sobrenaturais, como magia, criaturas místicas e mundos imaginários.'),
       ('Mistério', 'Gênero literário que envolve enigmas, investigações e situações inexplicáveis que desafiam a compreensão do leitor.'),
       ('Aventura', 'Gênero literário que narra histórias emocionantes e cheias de ação, muitas vezes envolvendo viagens, descobertas e desafios perigosos.'),
       ('Horror', 'Livros que focam em criar sentimentos de medo e suspense, frequentemente utilizando o sobrenatural ou o desconhecido.'),
       ('Biografia', 'Gênero que narra a vida de uma pessoa, geralmente uma figura histórica ou notável.'),
       ('Histórico', 'Livros ambientados em um contexto histórico específico, focando em eventos passados.'),
       ('Drama', 'Gênero literário que foca em conflitos emocionais e questões humanas profundas.'),
       ('Autobiografia', 'Gênero que narra a vida de uma pessoa escrita pela própria pessoa.'),
       ('Realismo Fantástico', 'Gênero que mistura elementos de fantasia e realidade de forma surrealista.'),
       ('Conto', 'Narrativas curtas que exploram uma única ideia ou conceito.'),
       ('Poesia', 'Gênero literário que utiliza linguagem rítmica e figuras de linguagem para expressar emoções e ideias.'),
       ('Thriller Psicológico', 'Histórias que exploram o lado obscuro da mente humana, geralmente envolvendo manipulação e mistério.'),
       ('Clássico', 'Obras que são amplamente consideradas de grande importância literária.'),
       ('Ficção Histórica', 'Gênero que mistura personagens e eventos reais com ficção, situado em um período histórico.'),
       ('Aventura Espacial', 'Narrativas que se passam em ambientes espaciais com exploração e descobertas.'),
       ('Distopia', 'Gênero literário que descreve uma sociedade imaginária negativa ou indesejável, frequentemente em cenários futuros.'),
       ('Realismo', 'Gênero que se concentra em representar a realidade da forma mais fiel possível.'),
       ('Romance Policial', 'Gênero que explora crimes, investigações e resolução de mistérios.');

-- Inserir fornecedores
INSERT INTO fornecedor (nome, cnpj, inscricaoEstadual, email, estado, cidade, quantLivrosFornecido, id_telefone) 
VALUES 
       ('Loja Moderna Ltda', '11.222.333/0001-99', '123456789', 'moderna@gmail.com', 'São Paulo', 'São Paulo', 300, 12),
       ('Companhia das Letras Ltda', '55.444.666/0001-88', '987654321', 'letras@gmail.com', 'São Paulo', 'São Paulo', 400, 13),
       ('Sextante Ltda', '99.777.333/0001-55', '123654987', 'sextante@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 350, 14),
       ('Livraria Cultura Ltda', '88.999.777/0001-66', '456123789', 'cultura@gmail.com', 'São Paulo', 'São Paulo', 500, 15),
       ('Saraiva S.A.', '77.666.555/0001-44', '789456123', 'saraiva@gmail.com', 'São Paulo', 'São Paulo', 450, 16),
       ('Editora Abril Ltda', '66.555.444/0001-33', '654987321', 'abril@gmail.com', 'São Paulo', 'São Paulo', 550, 17),
       ('Livros e Cia Ltda', '10.222.123/0001-11', '111222333', 'livrosecia@gmail.com', 'Minas Gerais', 'Belo Horizonte', 250, 22),
       ('Editora Planeta Ltda', '33.444.555/0001-77', '987321654', 'planeta@gmail.com', 'São Paulo', 'São Paulo', 350, 23),
       ('Livraria Nobel S.A.', '99.888.777/0001-22', '741852963', 'nobel@gmail.com', 'São Paulo', 'São Paulo', 400, 24),
       ('Editora Record Ltda', '66.777.444/0001-55', '789321456', 'record@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 450, 25),
       ('Cultura Ltda', '77.222.333/0001-66', '159753852', 'cultura@hotmail.com', 'São Paulo', 'São Paulo', 300, 26),
       ('Editora FTD S.A.', '88.111.666/0001-88', '321654987', 'ftd@gmail.com', 'São Paulo', 'São Paulo', 350, 27);

-- Inserir editora
INSERT INTO editora (nome, email, estado, cidade, id_telefone) 
VALUES 
       ('Atria Books', 'atriabooks@gmail.com', 'nova york', 'nova york', 18),
       ('Globo Livros', 'globolivros@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 19),
       ('Intrínseca', 'intrinseca@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 20),
       ('Editora Rocco', 'rocco@gmail.com', 'Rio de Janeiro', 'Rio de Janeiro', 21),
       ('Penguin Books', 'penguinbooks@gmail.com', 'Nova York', 'Nova York', 28),
       ('Random House', 'randomhouse@gmail.com', 'Nova York', 'Nova York', 29),
       ('HarperCollins', 'harpercollins@gmail.com', 'Londres', 'Londres', 30),
       ('Simon & Schuster', 'simon_schuster@gmail.com', 'Nova York', 'Nova York', 31),
       ('Scholastic', 'scholastic@gmail.com', 'Nova York', 'Nova York', 32),
       ('Hachette', 'hachette@gmail.com', 'Paris', 'Paris', 33);

-- Inserir livro
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao) 
VALUES 
       ('Confess', 39.90, 50, '9781501176838', 'Confess é um romance contemporâneo escrito por Colleen Hoover. O livro foi publicado em 2015 e é centrado em Auburn Reed e Owen Gentry. Auburn tem um passado difícil e encontra Owen, um artista misterioso, enquanto trabalha em uma galeria de arte. Juntos, eles embarcam em uma jornada emocional, desvendando segredos e enfrentando desafios que testam seu amor.','12/09/2020', 3, 3, 3),
       ('A Hipotese do Amor', 29.99, 100, '9780593336823', 'The Love Hypothesis é um romance contemporâneo escrito por Ali Hazelwood. O livro narra a história de Olive Smith, uma estudante de pós-graduação determinada a provar uma teoria científica sobre o amor. Com a ajuda de seu charmoso professor, eles embarcam em uma jornada de descoberta científica e pessoal.','12/08/2020', 1, 1, 1),   
       ('O Vendedor de Sonhos', 34.90, 80, '9788575429039',  'O Vendedor de Sonhos é um romance psicológico escrito por Augusto Cury. O livro conta a história de um homem misterioso que salva a vida de um suicida e o convence a acompanhar em uma jornada para mudar a sociedade através de sonhos e reflexões profundas sobre a vida.','12/06/2008', 2, 2, 2),
       ('Harry Potter e a Pedra Filosofal', 49.90, 100, '9788532530802', 'Harry Potter é uma série de sete romances de fantasia escrita pela autora britânica J.K. Rowling. Os livros narram as aventuras de um jovem bruxo, Harry Potter, e seus amigos Hermione Granger e Ron Weasley, todos estudantes na Escola de Magia e Bruxaria de Hogwarts.', '08/08/2011', 4, 4, 4),
       ('1984', 35.00, 80, '9788532530803', '1984 é um romance distópico escrito por George Orwell em 1948 e publicado em 1949. A obra é um dos maiores clássicos da literatura mundial e uma das mais influentes e importantes do século XX.', '14/09/1987', 4, 3, 4),
       ('O Diário da Nossa Paixão', 29.90, 70, '9788532511666', 'O Diário da Nossa Paixão é um romance do escritor norte-americano Nicholas Sparks, que relata a história de amor entre Noah Calhoun e Allie Nelson, que se conhecem e se apaixonam durante um verão.', '12/02/1978', 1, 2, 4),
       ('Harry Potter e as Relíquias da morte', 65.00, 20, '9788532522610', 'Encontro inevitável com Lord Voldemort não pode mais ser adiado. Harry, no entanto, precisa ganhar tempo para encontrar as Horcruxes que ainda estão faltando. E, pelo caminho, descobrir o que são afinal as Relíquias da Morte e como ele pode usá-las contra o Lorde das Trevas','12/09/1998', 4, 3, 1),
       ('O Alquimista', 39.90, 50, '9788577023206', 'O Alquimista, de Paulo Coelho, é uma obra que narra a jornada de Santiago, um jovem pastor que busca um tesouro localizado nas pirâmides do Egito. O livro explora temas de autoconhecimento e a importância de seguir os próprios sonhos.', '01/01/1988', 1, 2, 1),
       ('O Hobbit', 49.90, 60, '9788532530543', 'O Hobbit, de J.R.R. Tolkien, é um romance de fantasia que conta a história de Bilbo Bolseiro, um hobbit que embarca em uma aventura com um grupo de anões para recuperar seu tesouro de um dragão chamado Smaug.', '21/09/1937', 4, 4, 1),
       ('Cem Anos de Solidão', 29.99, 40, '9788535925224', 'Cem Anos de Solidão, de Gabriel García Márquez, narra a história da família Buendía ao longo de várias gerações na mítica cidade de Macondo, abordando temas de solidão e realismo mágico.', '05/06/1967', 2, 3, 1),
       ('A Revolução dos Bichos', 19.90, 80, '9788535925385', 'A Revolução dos Bichos, de George Orwell, é uma fábula política que critica o totalitarismo através da história de um grupo de animais que se revoltam contra seus humanos opressores.', '17/08/1945', 1, 3, 1),
       ('A Menina que Roubava Livros', 39.90, 100, '9788573021761', 'A Menina que Roubava Livros, de Markus Zusak, é um romance ambientado na Alemanha nazista que narra a história de Liesel, uma jovem que encontra consolo em livros e compartilha suas histórias durante tempos difíceis.', '01/03/2005', 3, 2, 2),
       ('A Culpa é das Estrelas', 29.90, 70, '9788580574853', 'A Culpa é das Estrelas, de John Green, é um romance sobre a vida de Hazel Grace, uma adolescente com câncer, que se apaixonada por Augustus Waters, também portador da doença, enquanto enfrentam suas dificuldades.', '10/01/2012', 2, 1, 2),
       ('O Senhor das Moscas', 39.90, 60, '9788535925811', 'O Senhor das Moscas, de William Golding, conta a história de um grupo de meninos que ficam presos em uma ilha deserta e sua luta pela sobrevivência enquanto as estruturas sociais se desintegram.', '17/08/1954', 4, 3, 3),
       ('Orgulho e Preconceito', 49.90, 80, '9788535931225', 'Orgulho e Preconceito, de Jane Austen, é um romance que examina a natureza do amor e do casamento através da história de Elizabeth Bennet e suas interações com o orgulhoso Mr. Darcy.', '28/01/1813', 3, 2, 3),
       ('O Retrato de Dorian Gray', 39.90, 50, '9788535935926', 'O Retrato de Dorian Gray, de Oscar Wilde, conta a história de um jovem que, após ver seu retrato envelhecer em seu lugar, vive uma vida de hedonismo e excessos, com consequências trágicas.', '20/06/1890', 3, 4, 3),
       ('Fahrenheit 451', 29.90, 70, '9788535920845', 'Fahrenheit 451, de Ray Bradbury, é uma distopia que descreve um futuro em que os livros são proibidos e os "bombeiros" queimam qualquer livro encontrado, explorando temas de censura e liberdade.', '19/10/1953', 2, 3, 2);

-- Inserir relacionamento entre livro e autor
INSERT INTO livro_autor (idlivro, idautor) VALUES (1, 1);
INSERT INTO livro_autor (idlivro, idautor) VALUES (2, 2);
INSERT INTO livro_autor (idlivro, idautor) VALUES (3, 3);
INSERT INTO livro_autor (idlivro, idautor) VALUES (4, 4);
INSERT INTO livro_autor (idlivro, idautor) VALUES (5, 5);
INSERT INTO livro_autor (idlivro, idautor) VALUES (6, 6);
INSERT INTO livro_autor (idlivro, idautor) VALUES (7, 1); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (8, 14); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (9, 15); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (10, 6); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (11, 7); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (12, 8);
INSERT INTO livro_autor (idlivro, idautor) VALUES (13, 9); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (14, 10); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (15, 11); 
INSERT INTO livro_autor (idlivro, idautor) VALUES (16, 12); 
-- Inserir relacionamento entre livro e gênero
INSERT INTO livro_genero (idlivro, idgenero) VALUES (1, 1);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (2, 1);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (3, 2);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (4, 4);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (5, 2);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (6, 1);
INSERT INTO livro_genero (idlivro, idgenero) VALUES (7, 1);  
INSERT INTO livro_genero (idlivro, idgenero) VALUES (8, 4);  
INSERT INTO livro_genero (idlivro, idgenero) VALUES (9, 1);  
INSERT INTO livro_genero (idlivro, idgenero) VALUES (10, 3); 
INSERT INTO livro_genero (idlivro, idgenero) VALUES (11, 1); 
INSERT INTO livro_genero (idlivro, idgenero) VALUES (12, 1); 
INSERT INTO livro_genero (idlivro, idgenero) VALUES (13, 3); 
INSERT INTO livro_genero (idlivro, idgenero) VALUES (14, 1); 
INSERT INTO livro_genero (idlivro, idgenero) VALUES (15, 2); 
INSERT INTO livro_genero (idlivro, idgenero) VALUES (16, 2);

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
INSERT INTO box (nome, descricaoBox, quantidadeEstoque, id_fornecedor, id_editora, preco, classificacao) 
VALUES 
       ('Coleção Harry Potter', 
       'Harry Potter é uma série sobre um jovem bruxo que descobre seu destino em um mundo mágico. Ao longo dos sete livros, ele enfrenta desafios, faz amigos e luta contra Voldemort, o bruxo responsável pela morte de seus pais. A história mistura magia, amizade e coragem, tornando-se um dos maiores fenômenos da literatura mundial. 
       1. Harry Potter e a Pedra Filosofal (223 páginas) - Harry descobre que é um bruxo e começa a estudar em Hogwarts. 
       2. Harry Potter e a Câmara Secreta (251 páginas) - Um mistério sobre uma câmara escondida ameaça Hogwarts. 
       3. Harry Potter e o Prisioneiro de Azkaban (317 páginas) - Harry descobre mais sobre seu passado enquanto lida com Sirius Black. 
       4. Harry Potter e o Cálice de Fogo (636 páginas) - Harry participa de um torneio perigoso. 
       5. Harry Potter e a Ordem da Fênix (766 páginas) - A resistência contra Voldemort cresce enquanto Harry descobre mais sobre sua conexão com o vilão. 
       6. Harry Potter e o Enigma do Príncipe (607 páginas) - Harry se aproxima de Dumbledore para entender o passado de Voldemort. 
       7. Harry Potter e as Relíquias da Morte (607 páginas) - A batalha final contra Voldemort se aproxima.', 
       50, 1, 2, 299.99, 1),

       ('Trilogia O Senhor dos Anéis', 
       'A épica jornada de Frodo e seus amigos para destruir o Um Anel. Escrito por J.R.R. Tolkien, esta trilogia é um dos maiores marcos da literatura fantástica. 
       1. A Sociedade do Anel (423 páginas) - Frodo inicia sua jornada para destruir o Um Anel. 
       2. As Duas Torres (352 páginas) - A Irmandade se separa, e Frodo segue com Sam em direção a Mordor. 
       3. O Retorno do Rei (416 páginas) - A batalha final entre as forças de Sauron e a Terra Média acontece enquanto Frodo tenta destruir o anel.', 
       30, 2, 1, 349.90, 2),

       ('As Crônicas de Nárnia', 
       'O clássico de C.S. Lewis, Nárnia é um mundo mágico cheio de criaturas fantásticas e grandes aventuras, onde quatro irmãos são chamados a proteger a terra do mal. 
       1. O Leão, a Feiticeira e o Guarda-Roupa (206 páginas) - Quatro crianças descobrem o mundo de Nárnia e enfrentam a Feiticeira Branca. 
       2. Príncipe Caspian (240 páginas) - As crianças voltam a Nárnia para ajudar o príncipe a reclamar seu trono. 
       3. A Viagem do Peregrino da Alvorada (272 páginas) - Lúcia e Edmundo viajam com Caspian em busca de sete lordes perdidos. 
       4. A Cadeira de Prata (257 páginas) - Uma nova geração tenta resgatar o filho desaparecido do rei Caspian. 
       5. O Cavalo e Seu Menino (240 páginas) - Uma aventura no deserto enquanto um garoto e um cavalo fogem em busca de liberdade. 
       6. O Sobrinho do Mago (240 páginas) - A origem de Nárnia e a criação de seu mundo mágico. 
       7. A Última Batalha (228 páginas) - A conclusão épica da saga, onde Nárnia enfrenta sua batalha final.', 
       40, 1, 2, 259.99, 3),

       ('Coleção Sherlock Holmes', 
       'Uma coleção completa das aventuras do detetive mais famoso do mundo, Sherlock Holmes, criado por Sir Arthur Conan Doyle. 
       1. Um Estudo em Vermelho (188 páginas) - A primeira aparição de Sherlock Holmes e Dr. Watson, resolvendo um mistério de assassinato. 
       2. O Signo dos Quatro (283 páginas) - Uma aventura envolvendo um tesouro desaparecido e segredos do passado. 
       3. O Cão dos Baskervilles (256 páginas) - Sherlock investiga a lenda de um cão monstruoso em Dartmoor. 
       4. O Vale do Medo (320 páginas) - Um assassinato misterioso leva Sherlock a desvendar uma trama complexa.', 
       20, 3, 4, 199.90, 4),

       ('Coleção Percy Jackson', 
       'A série Percy Jackson segue um jovem que descobre ser filho de um deus grego, enfrentando aventuras e desafios no mundo moderno. 
       1. O Ladrão de Raios (400 páginas) - Percy descobre que é filho de Poseidon e precisa encontrar o raio de Zeus. 
       2. O Mar de Monstros (304 páginas) - Percy enfrenta novos desafios para salvar seu amigo Grover. 
       3. A Maldição do Titã (336 páginas) - Percy e seus amigos tentam salvar a deusa Ártemis e uma amiga sequestrada. 
       4. A Batalha do Labirinto (368 páginas) - Percy precisa navegar no Labirinto para impedir a invasão de Luke. 
       5. O Último Olimpiano (400 páginas) - A batalha final entre os deuses e os titãs ameaça o Olimpo.', 
       35, 4, 2, 229.90, 1),

       ('Uma Canção de Gelo e Fogo', 
       'Uma série de fantasia épica escrita por George R.R. Martin, que se passa nos continentes fictícios de Westeros e Essos, onde famílias nobres lutam pelo Trono de Ferro. 
       1. A Guerra dos Tronos (694 páginas) - A luta pelo Trono de Ferro começa com a morte de um rei. 
       2. A Fúria dos Reis (768 páginas) - A guerra se intensifica com novas alianças e traições. 
       3. O Festim dos Corvos (753 páginas) - As consequências da guerra começam a se manifestar. 
       4. A Dança dos Dragões (1016 páginas) - Novas batalhas e dragões se tornam centrais na luta pelo poder.', 
       25, 2, 5, 199.90, 1),

       ('O Guia do Mochileiro das Galáxias', 
       'Uma série de ficção científica cômica escrita por Douglas Adams, que segue as desventuras de Arthur Dent após a destruição da Terra. 
       1. O Guia do Mochileiro das Galáxias (216 páginas) - Arthur Dent conhece Ford Prefect e descobre que a Terra foi destruída. 
       2. O Restaurante no Fim do Universo (246 páginas) - A continuação das aventuras de Arthur e seus amigos. 
       3. A Vida, o Universo e Tudo Mais (215 páginas) - Arthur se vê em situações cada vez mais absurdas. 
       4. Até mais, e Obrigado pelos Peixes (224 páginas) - A busca pelo sentido da vida continua.', 
       30, 2, 6, 149.90, 2),

       ('A Saga Crepúsculo', 
       'A saga de romance e fantasia escrita por Stephenie Meyer, que gira em torno do amor entre Bella Swan e o vampiro Edward Cullen. 
       1. Crepúsculo (498 páginas) - Bella se muda para Forks e se apaixona por Edward. 
       2. Lua Nova (563 páginas) - Após a partida de Edward, Bella se envolve com Jacob Black. 
       3. Eclipse (629 páginas) - A batalha entre vampiros e lobos se intensifica. 
       4. Amanhecer (754 páginas) - O destino de Bella e Edward se decide.', 
       40, 1, 7, 199.90, 1),

       ('Correr ou Morrer', 
       'Uma série de ficção científica distópica escrita por James Dashner, que segue um grupo de adolescentes tentando escapar de um labirinto mortal. 
       1. Correr ou Morrer (374 páginas) - Thomas acorda em um labirinto sem memória. 
       2. Prova de Fogo (368 páginas) - O grupo enfrenta novos desafios fora do labirinto. 
       3. A Cura Mortal (400 páginas) - A luta pela sobrevivência chega ao clímax.', 
       35, 2, 8, 159.90, 1),

       ('Trilogia Divergente', 
       'Uma série de ficção científica distópica escrita por Veronica Roth, que se passa em uma Chicago futurista. 
       1. Divergente (487 páginas) - Tris Prior descobre que é Divergente e luta contra o sistema. 
       2. Insurgente (544 páginas) - A luta contra a opressão continua. 
       3. Convergente (576 páginas) - O final da saga revela verdades chocantes.', 
       30, 2, 9, 179.90, 1),

       ('Quarteto O Dador', 
       'Uma série de fantasia distópica escrita por Lois Lowry, que explora temas de controle social e a importância das memórias. 
       1. O Dador (192 páginas) - Jonas descobre os segredos de sua sociedade. 
       2. A Mensageira (272 páginas) - O mundo começa a se expandir. 
       3. O Mensageiro (211 páginas) - Novas verdades são reveladas. 
       4. A Quarta História (212 páginas) - Uma nova perspectiva sobre o mundo é apresentada.', 
       20, 1, 10, 139.90, 1),

       ('As Vantagens de Ser Invisível', 
       'Um romance de Stephen Chbosky que segue a vida de Charlie, um adolescente tímido que enfrenta os desafios do ensino médio. 
       1. As Vantagens de Ser Invisível (213 páginas) - A jornada de Charlie através do amor e amizade.', 
       50, 1, 2, 89.90, 3),

       ('Um Corte de Espinhos e Rosas', 
       'Uma série de fantasia romântica escrita por Sarah J. Maas, que combina elementos de contos de fadas com uma narrativa emocionante. 
       1. Um Corte de Espinhos e Rosas (432 páginas) - Feyre, uma humana, é levada para o mundo das fadas. 
       2. Um Corte de Névoa e Fúria (624 páginas) - Feyre deve lutar para proteger aqueles que ama. 
       3. Um Corte de Asas e Ruína (699 páginas) - O conflito entre humanos e fadas chega a um clímax.', 
       35, 2, 1, 199.90, 1);

-- Inserir relacionamento entre box e autor
INSERT INTO box_autor (idbox, idautor) VALUES (1, 1);
INSERT INTO box_autor (idbox, idautor) VALUES (2, 2);
INSERT INTO box_autor (idbox, idautor) VALUES (3, 3);
INSERT INTO box_autor (idbox, idautor) VALUES (4, 4);
INSERT INTO box_autor (idbox, idautor) VALUES (5, 5);
INSERT INTO box_autor (idbox, idautor) VALUES (6, 6);
INSERT INTO box_autor (idbox, idautor) VALUES (7, 7);
INSERT INTO box_autor (idbox, idautor) VALUES (8, 8);
INSERT INTO box_autor (idbox, idautor) VALUES (9, 9);
INSERT INTO box_autor (idbox, idautor) VALUES (10, 10);
INSERT INTO box_autor (idbox, idautor) VALUES (11, 11);
INSERT INTO box_autor (idbox, idautor) VALUES (12, 12);
INSERT INTO box_autor (idbox, idautor) VALUES (13, 13);

--Inserir relacionamento entre box e gênero
INSERT INTO box_genero (idbox, idgenero) VALUES (1, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (2, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (3, 2);
INSERT INTO box_genero (idbox, idgenero) VALUES (4, 4);
INSERT INTO box_genero (idbox, idgenero) VALUES (5, 2);
INSERT INTO box_genero (idbox, idgenero) VALUES (6, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (7, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (8, 2);
INSERT INTO box_genero (idbox, idgenero) VALUES (9, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (10, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (11, 3);
INSERT INTO box_genero (idbox, idgenero) VALUES (12, 1);
INSERT INTO box_genero (idbox, idgenero) VALUES (13, 2);
