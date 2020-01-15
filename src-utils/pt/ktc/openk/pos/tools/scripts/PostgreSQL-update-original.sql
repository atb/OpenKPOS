

INSERT INTO CATEGORIES(ID, NAME) VALUES ('11', 'Diversos');

-- MAX 18 CHARS PARA O NOME

-- Categoria 1: Cafetaria
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Cafe', PRICESELL=(0.65/1.23), IMAGE=$FILE{/pt/ktc/openk/pos/images/product_001.jpg} WHERE ID='1';
UPDATE PRODUCTS SET NAME='Descafeinado', PRICESELL=0.65/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_002.jpg}  WHERE ID='2';
UPDATE PRODUCTS SET NAME='Cevada', PRICESELL=0.60/1.23 WHERE ID='3';
UPDATE PRODUCTS SET NAME='Carioca de Cafe', PRICESELL=0.65/1.23 WHERE ID='4';
UPDATE PRODUCTS SET NAME='Carioca de Limao', PRICESELL=0.60/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_005.jpg} WHERE ID='5';
UPDATE PRODUCTS SET NAME='Carioca Limao Duplo', PRICESELL=1.00/1.23 WHERE ID='6';
UPDATE PRODUCTS SET NAME='Pingo', PRICESELL=0.65/1.23 WHERE ID='7';
UPDATE PRODUCTS SET NAME='Meia de Leite', PRICESELL=0.90/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_008.jpg} WHERE ID='8';
UPDATE PRODUCTS SET NAME='Galao', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_009.jpg} WHERE ID='9';
UPDATE PRODUCTS SET NAME='Copo de Leite', PRICESELL=0.90/1.06, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_010.jpg} WHERE ID='10';
UPDATE PRODUCTS SET NAME='Cafe com Natas', PRICESELL=1.80/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_011.jpg} WHERE ID='11';
UPDATE PRODUCTS SET NAME='Leite Achocolatado UCAL', PRICESELL=1.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_012.jpg} WHERE ID='12';

-- Categoria 2: Aguas
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Agua 50 cl', PRICESELL=1.00/1.06, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_020.jpg} WHERE ID='20';
UPDATE PRODUCTS SET NAME='Agua das PEDRAS', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_021.jpg} WHERE ID='21';
UPDATE PRODUCTS SET NAME='Agua PEDRAS Limao', PRICESELL=1.25/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_022.jpg} WHERE ID='22';
UPDATE PRODUCTS SET NAME='Agua FRIZE Limao', PRICESELL=1.25/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_023.jpg} WHERE ID='23';
UPDATE PRODUCTS SET NAME='Pneu', PRICESELL=1.75/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_024.jpg} WHERE ID='24';
 
-- Categoria 3: Cervejas
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Cerveja Fino', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_030.jpg} WHERE ID='30';
UPDATE PRODUCTS SET NAME='Cerveja 20cl MINI', PRICESELL=1.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_031.jpg} WHERE ID='31';
UPDATE PRODUCTS SET NAME='Cerveja branca 33cl', PRICESELL=1.30/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_032.jpg} WHERE ID='32';
UPDATE PRODUCTS SET NAME='Panache', PRICESELL=1.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_033.jpg} WHERE ID='33';
UPDATE PRODUCTS SET NAME='Diesel', PRICESELL=1.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_034.jpg} WHERE ID='34';
UPDATE PRODUCTS SET NAME='Cerveja sem Alcool', PRICESELL=1.30/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_035.jpg} WHERE ID='35';
UPDATE PRODUCTS SET NAME='SUPER BOCK Stout', PRICESELL=1.50/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_036.jpg} WHERE ID='36';
UPDATE PRODUCTS SET NAME='CARLSBERG', PRICESELL=1.75/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_037.jpg} WHERE ID='37';
UPDATE PRODUCTS SET NAME='HEINEKEN', PRICESELL=1.75/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_038.jpg} WHERE ID='38';
UPDATE PRODUCTS SET NAME='1664 KRONENBOURG', PRICESELL=2.75/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_039.jpg} WHERE ID='39';

-- Categoria 4: Nectares/Sumos
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Compal', PRICESELL=1.20/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_050.jpg} WHERE ID='50';
UPDATE PRODUCTS SET NAME='Compal Fresh Maracuja', PRICESELL=1.20/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_051.jpg} WHERE ID='51';
UPDATE PRODUCTS SET NAME='Compal Vit Frut Vermelhos', PRICESELL=1.20/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_052.jpg} WHERE ID='52';
UPDATE PRODUCTS SET NAME='Compal Light Man/Laranja', PRICESELL=1.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_053.jpg} WHERE ID='53';

-- Categoria 5: Refrigerantes
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='CCola 33cl Lim/Gelo', PRICESELL=1.75/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_060.jpg} WHERE ID='60';	
UPDATE PRODUCTS SET NAME='Seven Up 33cl', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_061.jpg} WHERE ID='61';
UPDATE PRODUCTS SET NAME='Ice Tea 33cl', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_062.jpg} WHERE ID='62';
UPDATE PRODUCTS SET NAME='BI 33cl', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_063.jpg} WHERE ID='63';                                         
UPDATE PRODUCTS SET NAME='Sumol 25cl', PRICESELL=0.90/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_064.jpg} WHERE ID='64';

UPDATE PRODUCTS SET NAME='Lata 33cl Guarana', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_065.jpg} WHERE ID='65';
UPDATE PRODUCTS SET NAME='Lata 33cl Seven UP', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_066.jpg} WHERE ID='66';
UPDATE PRODUCTS SET NAME='Lata 33cl Coca-cola', PRICESELL=1.10 /1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_067.jpg} WHERE ID='67';
UPDATE PRODUCTS SET NAME='Lata 33cl Pepsi', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_068.jpg} WHERE ID='68';
UPDATE PRODUCTS SET NAME='Lata 33cl Sumol', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_069.jpg} WHERE ID='69';
UPDATE PRODUCTS SET NAME='Lata 33cl Ice tea', PRICESELL=1.10/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_070.jpg} WHERE ID='70';

-- Categoria 6: Cha
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Cha Saqueta', PRICESELL=1.50/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_080.jpg} WHERE ID='80';
UPDATE PRODUCTS SET NAME='Cha Saqueta Duplo', PRICESELL=1.90/1.23 WHERE ID='81';
UPDATE PRODUCTS SET NAME='Cha Saqueta Triplo', PRICESELL=2.40/1.23 WHERE ID='82';
UPDATE PRODUCTS SET NAME='Cha Infusor Seda', PRICESELL=3.00/1.23 WHERE ID='83';
UPDATE PRODUCTS SET NAME='Cha Inf Seda Duplo', PRICESELL=4.00/1.23 WHERE ID='84';
UPDATE PRODUCTS SET NAME='Cha Inf Seda Triplo', PRICESELL=5.00/1.23 WHERE ID='85';

-- Categoria 7: Fogacas
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Fogaca 1,5 kg', PRICESELL=15.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_100.jpg} WHERE ID='100';
UPDATE PRODUCTS SET NAME='Fogaca 1,0 kg', PRICESELL=10.00/1.23 WHERE ID='101';
UPDATE PRODUCTS SET NAME='Fogaca 500 gr', PRICESELL=5.00/1.23 WHERE ID='102';
UPDATE PRODUCTS SET NAME='*Caixa Suplementar', PRICESELL=2.00/1.23 WHERE ID='103';

UPDATE PRODUCTS SET NAME='Fogaca Frutos Secos', PRICESELL=4.50/1.23 WHERE ID='104';
UPDATE PRODUCTS SET NAME='Fogacinha', PRICESELL=1.20/1.23 WHERE ID='105';
UPDATE PRODUCTS SET NAME='Princesinha Chocolate', PRICESELL=2.00/1.23 WHERE ID='106';
UPDATE PRODUCTS SET NAME='Fogacinha queijo', PRICESELL=2.50/1.23 WHERE ID='107';
UPDATE PRODUCTS SET NAME='Fogacinha fiambre', PRICESELL=2.50/1.23 WHERE ID='108';
UPDATE PRODUCTS SET NAME='Fogacinha presunto', PRICESELL=2.50/1.23 WHERE ID='109';
UPDATE PRODUCTS SET NAME='Fogacinha mista/fiambre', PRICESELL=3.00/1.23 WHERE ID='110';
UPDATE PRODUCTS SET NAME='Fogacinha mista/presunto', PRICESELL=2.50/1.23 WHERE ID='111';
UPDATE PRODUCTS SET NAME='Torrada de Fogaca', PRICESELL=3.50/1.23 WHERE ID='112';;
UPDATE PRODUCTS SET NAME='Rabanada de Fogaca', PRICESELL=4.00/1.23 WHERE ID='113';
-- UPDATE PRODUCTS SET NAME='114', '114', '114', 'Pudim de Fogaca', PRICESELL=0.00/1.23 WHERE ID='114';

-- Categoria 8: Pao e afins…
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Pao manteiga', PRICESELL=0.90/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_120.jpg} WHERE ID='120';
UPDATE PRODUCTS SET NAME='Pao manteiga torrid', PRICESELL=1.20/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_121.jpg} WHERE ID='121';
UPDATE PRODUCTS SET NAME='Pao c queijo', PRICESELL=1.50/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_122.jpg} WHERE ID='122';
UPDATE PRODUCTS SET NAME='Pao queijo aquecido', PRICESELL=1.80/1.23 WHERE ID='123';
UPDATE PRODUCTS SET NAME='Pao c fiambre', PRICESELL=1.50/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_124.jpg} WHERE ID='124';
UPDATE PRODUCTS SET NAME='Pao c presunto', PRICESELL=2.00/1.23 WHERE ID='125';
UPDATE PRODUCTS SET NAME='Pao misto/fiambre', PRICESELL=2.00/1.23 WHERE ID='126';
UPDATE PRODUCTS SET NAME='Pao misto/present', PRICESELL=2.50/1.23 WHERE ID='127';
UPDATE PRODUCTS SET NAME='Torrada Museu', PRICESELL=3.50/1.23 WHERE ID='128';
UPDATE PRODUCTS SET NAME='Tosta Mista', PRICESELL=3.00/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_129.jpg} WHERE ID='129';


-- Categoria 9: Confeitaria
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Fatia de Bolo', PRICESELL=1.50/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_140.jpg} WHERE ID='140';
UPDATE PRODUCTS SET NAME='Fatia de Tarte', PRICESELL=1.50/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_141.jpg} WHERE ID='141';
UPDATE PRODUCTS SET NAME='Fatia de Torta', PRICESELL=1.80/1.23, IMAGE=$FILE{/pt/ktc/openk/pos/images/product_142.jpg} WHERE ID='142';
-- UPDATE PRODUCTS SET NAME='143', '143', '143', 'Semifrio Tarte Afonsina', '9'PRICESELL=		
-- UPDATE PRODUCTS SET NAME='144', '144', '144', 'Semifrio Delicia de Ananas', '9'PRICESELL=

-- Categoria 10: Miminhos
--------------------------123456789012345678---------------------------------------------------------------------
UPDATE PRODUCTS SET NAME='Caladinhos Unid', PRICESELL=0.40/1.23 WHERE ID='160';
UPDATE PRODUCTS SET NAME='Caladinhos 1 kg', PRICESELL=10.00/1.23 WHERE ID='161';
UPDATE PRODUCTS SET NAME='Bolin canela Unid', PRICESELL=0.30/1.23 WHERE ID='162';
UPDATE PRODUCTS SET NAME='Bolin canela 1 kg', PRICESELL=10.00/1.23 WHERE ID='163';
UPDATE PRODUCTS SET NAME='Queijadinhas', PRICESELL=1.00/1.23 WHERE ID='164';
UPDATE PRODUCTS SET NAME='Queques cenoura', PRICESELL=1.00/1.23 WHERE ID='165';
UPDATE PRODUCTS SET NAME='Delicias amendoa', PRICESELL=1.50/1.23 WHERE ID='166';
UPDATE PRODUCTS SET NAME='Brigadeiros', PRICESELL=0.50/1.23 WHERE ID='167';
UPDATE PRODUCTS SET NAME='Bolas de Neve', PRICESELL=0.50/1.23 WHERE ID='168';

-- Categoria 11: Diversos
-- UPDATE PRODUCTS SET NAME='Diversos', PRICESELL=0.50/1.23 WHERE ID='200'   
INSERT INTO PRODUCTS(ID, REFERENCE, CODE, NAME, CATEGORY, PRICEBUY, PRICESELL, TAXCAT) VALUES ('200', '200', '200', 'Diversos', '11', 0.01, 0.50/1.23, '003');

INSERT INTO PRODUCTS_CAT(PRODUCT) VALUES ('200');
