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
-- Colleen Hoover
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('É Assim que Acaba', 34.90, 100, '9788501110646', 'História emocionante de amor, superação e escolhas difíceis.', '02/08/2016', 9, 10, 4, 'e-assim-que-acaba.jpg'),
    ('Verity', 36.90, 80, '9788501110653', 'Thriller psicológico sobre segredos sombrios de uma autora famosa.', '01/12/2018', 9, 10, 4, 'verity.jpg'),
    ('Todas as Suas (Im)perfeições', 32.90, 70, '9788501110660', 'Um olhar profundo sobre os desafios e imperfeições de um relacionamento.', '17/07/2018', 9, 10, 4, 'todas-suas-imperfeicoes.jpg'),
    ('Talvez um Dia', 31.90, 60, '9788501110677', 'Romance sobre amor e música entre duas almas criativas e apaixonadas.', '18/03/2014', 9, 10, 4, 'talvez-um-dia.jpg'),
    ('Novembro, 9', 30.00, 90, '9788501110684', 'História de amor marcada por encontros anuais no mesmo dia.', '10/11/2015', 9, 10, 4, 'novembro-9.jpg'),
    ('Confesse', 29.50, 75, '9788501110691', 'Romance sobre segredos, perdão e um amor que desafia as circunstâncias.', '10/03/2015', 9, 10, 3, 'confesse.jpg'),
    ('Métrica', 28.90, 85, '9788501110707', 'A descoberta do amor e da poesia na vida de uma jovem em transição.', '05/01/2012', 9, 10, 3, 'metrica.jpg'),
    ('Pausa', 27.90, 80, '9788501110714', 'Continuação de "Métrica", explorando desafios e amadurecimento em um relacionamento.', '21/08/2012', 9, 10, 3, 'pausa.jpg'),
    ('Essa Garota', 26.90, 70, '9788501110721', 'Terceiro livro da série Slammed, com novos olhares sobre os eventos passados.', '13/04/2013', 9, 10, 3, 'essa-garota.jpg'),
    ('Sem Esperança', 33.50, 65, '9788501110738', 'Versão da história de Holder de "Um Caso Perdido", com novos detalhes e revelações.', '07/07/2013', 9, 10, 4, 'sem-esperanca.jpg'),
    ('Em Busca de Cinderela', 24.90, 60, '9788501110745', 'Spin-off da série "Hopeless", sobre um encontro inesperado que muda vidas.', '14/10/2013', 9, 10, 3, 'em-busca-de-cinderela.jpg'),
    ('Um Caso Perdido', 32.00, 70, '9788501110752', 'Primeiro livro da série Hopeless, sobre segredos familiares e novos começos.', '17/12/2012', 9, 10, 4, 'um-caso-perdido.jpg'),
    ('Tarde Demais', 28.90, 75, '9788501110769', 'História intensa e controversa sobre obsessão e relacionamentos tóxicos.', '28/03/2016', 9, 10, 3, 'tarde-demais.jpg'),
    ('Heart Bones', 34.00, 60, '9788501110776', 'Romance sobre descobertas, dor e amor entre duas pessoas em mundos diferentes.', '19/08/2020', 9, 10, 3, 'heart-bones.jpg'),
    ('Layla', 31.50, 65, '9788501110783', 'Romance sobrenatural que mistura amor, suspense e o inexplicável.', '08/12/2020', 9, 10, 3, 'layla.jpg'),
    ('Reminders of Him', 35.90, 80, '9788501110790', 'Uma história sobre redenção, perdão e a força do amor de uma mãe.', '18/01/2022', 9, 10, 4, 'reminders-of-him.jpg');

-- George Orwell
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('1984', 35.00, 80, '9788532530803', '1984 é um romance distópico escrito por George Orwell que explora o totalitarismo.', '14/09/1987', 4, 3, 4, '1984.jpg'),
    ('A Revolução dos Bichos', 19.90, 80, '9788535925385', 'A Revolução dos Bichos é uma fábula política que critica o totalitarismo.', '17/08/1945', 1, 3, 1, 'a-revolucao-dos-bichos.jpg'),
    ('Dias na Birmânia', 30.00, 50, '9788535917762', 'Romance que retrata o colonialismo britânico na Birmânia e suas consequências.', '01/03/1934', 2, 3, 2, 'dias-na-birmania.jpg'),
    ('O Caminho para Wigan Pier', 27.90, 40, '9788535905615', 'Uma crítica à situação da classe trabalhadora na Inglaterra na década de 1930.', '08/02/1937', 1, 2, 3, 'o-caminho-para-wigan.jpg'),
    ('Lutando na Espanha', 32.50, 35, '9788535912347', 'Relato da experiência de George Orwell na Guerra Civil Espanhola.', '25/10/1938', 2, 3, 4, 'lutando-na-espanha.jpg');

-- J.K. Rowling
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('Harry Potter e a Pedra Filosofal', 49.90, 100, '9788532530802', 'Primeiro livro da série Harry Potter, onde Harry descobre ser um bruxo.', '08/08/2011', 4, 4, 4, 'pedra-filosofal.jpg'),
    ('Harry Potter e a Câmara Secreta', 44.90, 90, '9788532530819', 'Segundo livro da série, onde Harry retorna a Hogwarts e enfrenta novos perigos.', '02/07/1998', 4, 4, 4, 'camara-secreta.jpg'),
    ('Harry Potter e o Prisioneiro de Azkaban', 45.90, 85, '9788532530826', 'Terceiro livro da série, onde Harry descobre mais sobre seu passado e Sirius Black.', '08/03/1999', 4, 4, 4, 'prisioneiro-de-azkaban.jpg'),
    ('Harry Potter e o Cálice de Fogo', 59.90, 70, '9788532530833', 'Quarto livro da série, onde Harry participa do Torneio Tribruxo.', '01/08/2000', 4, 4, 4, 'calice-de-fogo.jpg'),
    ('Harry Potter e as Relíquias da Morte', 65.00, 20, '9788532522610', 'Último livro da série, com o confronto final entre Harry e Voldemort.', '12/09/1998', 4, 3, 1, 'reliquias-da-morte.jpg');

-- Gabriel García Márquez
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('Cem Anos de Solidão', 29.99, 40, '9788535925224', 'História da família Buendía em Macondo, abordando realismo mágico.', '05/06/1967', 2, 3, 1, 'cem-anos-de-solidao.jpg'),
    ('O Amor nos Tempos do Cólera', 34.90, 50, '9788535922230', 'Romance que narra a paixão duradoura entre Florentino Ariza e Fermina Daza.', '15/09/1985', 2, 2, 2, 'o-amor-nos-tempos-de-colera.jpg'),
    ('Crônica de uma Morte Anunciada', 25.90, 60, '9788535916726', 'História baseada em um evento real, onde todos sabiam do assassinato, exceto a vítima.', '06/03/1981', 2, 3, 2, 'cronica-de-uma-morte-anuciada.jpg'),
    ('O General em Seu Labirinto', 28.50, 45, '9788535923143', 'Relato ficcional dos últimos dias de Simón Bolívar.', '01/07/1989', 2, 2, 3, 'o-general-em-seu-labirinto.jpg'),
    ('Doze Contos Peregrinos', 23.90, 55, '9788535907892', 'Coletânea de contos que exploram temas de exílio e destino.', '12/10/1992', 2, 3, 3, 'doze-contos-peregrinos.jpg');

-- Jane Austen
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('Orgulho e Preconceito', 39.90, 75, '9788532531292', 'Clássico romance sobre as complexidades sociais e amorosas na Inglaterra do século XIX.', '28/01/1813', 6, 6, 4, 'orgulho-e-preconceito.jpg'),
    ('Razão e Sensibilidade', 37.90, 60, '9788532531308', 'História das irmãs Dashwood e seus desafios emocionais e financeiros.', '01/10/1811', 6, 6, 3, 'razao-e-sensibilidade.jpg'),
    ('Emma', 36.50, 50, '9788532531315', 'Romance que acompanha as tentativas de casamenteira da jovem e rica Emma Woodhouse.', '23/12/1815', 6, 6, 3, 'emma.jpg'),
    ('Persuasão', 32.90, 40, '9788532531322', 'História de amor e redenção entre Anne Elliot e o Capitão Wentworth.', '20/12/1817', 6, 6, 4, 'persuasao.jpg'),
    ('Mansfield Park', 33.90, 55, '9788532531339', 'Relato das dificuldades de Fanny Price ao se mudar para a mansão de seus tios ricos.', '09/07/1814', 6, 6, 3, 'mansfield-park.jpg');

-- Machado de Assis
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('Dom Casmurro', 29.90, 100, '9788535920127', 'Clássico de Machado de Assis que aborda amor, ciúme e traição.', '01/01/1899', 1, 2, 4, 'dom-casmurro.jpg'),
    ('Memórias Póstumas de Brás Cubas', 27.50, 90, '9788535910487', 'Narrativa inovadora com reflexões críticas sobre a sociedade brasileira.', '01/01/1881', 1, 2, 4, 'memorias-postumas.jpg'),
    ('Quincas Borba', 26.90, 80, '9788535914560', 'Romance sobre ambição e loucura, centrado na filosofia do Humanitismo.', '01/01/1891', 1, 2, 3, 'quincas-borba.jpg'),
    ('Esaú e Jacó', 28.00, 75, '9788535917219', 'História de dois irmãos gêmeos com visões políticas opostas.', '01/01/1904', 1, 2, 3, 'esau-e-jaco.jpg'),
    ('Helena', 25.50, 65, '9788535920912', 'Romance que explora amor e hierarquia social na sociedade carioca do século XIX.', '01/01/1876', 1, 2, 2, 'helena.jpg');

-- Stephen King
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('O Iluminado', 44.90, 70, '9788532517894', 'Thriller psicológico sobre um hotel assombrado e a sanidade de seu zelador.', '01/01/1977', 3, 4, 4, 'o-iluminado.jpg'),
    ('A Coisa', 59.90, 50, '9788532517931', 'História de terror que segue um grupo de crianças enfrentando uma entidade maléfica.', '01/01/1986', 3, 4, 4, 'a-coisa.jpg'),
    ('Carrie, a Estranha', 34.90, 65, '9788532517849', 'O primeiro romance de King, abordando bullying e vingança sobrenatural.', '01/01/1974', 3, 4, 3, 'carrie-a-estranha.jpg'),
    ('Misery', 38.00, 55, '9788532517818', 'Suspense psicológico sobre um escritor sequestrado por uma fã obsessiva.', '01/01/1987', 3, 4, 4, 'misery.jpg'),
    ('Sob a Redoma', 47.50, 40, '9788532517993', 'História de uma cidade presa sob uma cúpula misteriosa e suas lutas pelo poder.', '01/01/2009', 3, 4, 4, 'sob-a-redoma.jpg');

-- Agatha Christie
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('Assassinato no Expresso do Oriente', 35.90, 90, '9788535925672', 'Uma das mais famosas investigações de Hercule Poirot.', '01/01/1934', 2, 3, 4, 'o-assassinato-no-expresso.jpg'),
    ('E Não Sobrou Nenhum', 39.90, 95, '9788535917844', 'Dez estranhos são convidados para uma ilha e começam a ser assassinados um por um.', '01/01/1939', 2, 3, 4, 'e-nao-sobrou-nenhum.jpg'),
    ('O Misterioso Caso de Styles', 28.50, 80, '9788535917899', 'Primeiro livro de Hercule Poirot, com sua estreia no gênero policial.', '01/01/1920', 2, 3, 3, 'o-misterioso-caso-de-styles.jpg'),
    ('Morte no Nilo', 36.00, 85, '9788535917882', 'Poirot investiga um assassinato durante um cruzeiro no rio Nilo.', '01/01/1937', 2, 3, 4, 'morte-no-nilo.jpg'),
    ('Os Crimes ABC', 33.50, 75, '9788535917875', 'Poirot enfrenta um assassino em série que escolhe suas vítimas em ordem alfabética.', '01/01/1936', 2, 3, 4, 'os-crimes-abc.jpg');

-- J.R.R. Tolkien
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('O Senhor dos Anéis: A Sociedade do Anel', 59.90, 70, '9788535902772', 'Primeiro volume da épica trilogia de fantasia de Tolkien.', '01/07/1954', 3, 3, 4, 'a-sociedade-do-anel.jpg'),
    ('O Senhor dos Anéis: As Duas Torres', 59.90, 65, '9788535902789', 'Segundo volume da trilogia com batalhas épicas e intrigas.', '01/11/1954', 3, 3, 4, 'as-duas-torres.jpg'),
    ('O Senhor dos Anéis: O Retorno do Rei', 59.90, 60, '9788535902796', 'Conclusão da trilogia, com a batalha final pela Terra-média.', '01/10/1955', 3, 3, 4, 'o-retorno-do-rei.jpg'),
    ('O Hobbit', 49.90, 100, '9788535902826', 'História de Bilbo Bolseiro e sua jornada até a Montanha Solitária.', '01/09/1937', 3, 3, 3, 'o-hobbit.jpg'),
    ('O Silmarillion', 45.50, 50, '9788535902840', 'História da Primeira Era da Terra-média e das Silmarils.', '15/09/1977', 3, 3, 3, 'o-silmarilion.jpg');

-- Ali Hazelwood
INSERT INTO livro (titulo, preco, quantidadeEstoque, isbn, descricao, datalancamento, id_fornecedor, id_editora, classificacao, nomeImagem)
VALUES
    ('A Hipótese do Amor', 38.90, 50, '9788501110806', 'Comédia romântica sobre uma cientista que se envolve em um falso relacionamento para ajudar uma amiga.', '14/09/2021', 9, 10, 4, 'a-hipotese-do-amor.jpg'),
    ('Amor, Teoricamente', 41.90, 45, '9788501110820', 'História divertida e romântica sobre uma cientista que se envolve com seu rival em um projeto acadêmico.', '23/08/2022', 9, 10, 4, 'amor-teoricamente.jpg'),
    ('A Razão do Amor', 35.90, 30, '9788501110837', 'Romance sobre os desafios e surpresas enfrentados por uma professora universitária enquanto lida com conflitos profissionais e pessoais.', '14/02/2023', 9, 10, 4, 'a-razao-do-amor.jpg');

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
