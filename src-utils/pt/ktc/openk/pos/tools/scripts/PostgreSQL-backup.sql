-- DEVE SER EXCEUTADO COM O LOGIN DE ADMINISTRACAO DO POSTGRES
-- Script de Backup : AINDA EM DESENVOLVIMENTO

-- A SEGUINTE INSTRUCAO E NECESSARIA PARA QUE O BACKUP E RESTORE FUNCIONEM
grant create on database museu_da_fogaca to openk;

CREATE OR REPLACE FUNCTION prepare_restore()  RETURNS varchar AS $$
DECLARE
    versao varchar := 'Erro';
 BEGIN
	DROP SCHEMA IF EXISTS backup CASCADE;
	
    CREATE SCHEMA backup;
    
    ALTER SCHEMA backup OWNER TO openk; 
	
    versao := 'Sucesso';
    RETURN versao; 
 END;
 $$ LANGUAGE plpgsql security definer;
ALTER FUNCTION prepare_restore() OWNER TO openk;
 
CREATE OR REPLACE FUNCTION execute_backup()  RETURNS varchar AS $$
DECLARE
    versao varchar := 'Erro';
 BEGIN
    
	DROP SCHEMA IF EXISTS backup CASCADE;
	
    CREATE SCHEMA backup;
    
    ALTER SCHEMA backup OWNER TO openk;

    -- GRANT ALL on schema backup to openk;

    CREATE TABLE backup.applications AS SELECT * FROM public.applications;
    CREATE TABLE backup.attribute AS SELECT * FROM public.attribute;
	CREATE TABLE backup.attributeinstance AS SELECT * FROM public.attributeinstance;
	CREATE TABLE backup.attributeset AS SELECT * FROM public.attributeset;
	CREATE TABLE backup.attributesetinstance AS SELECT * FROM public.attributesetinstance;
	CREATE TABLE backup.attributeuse AS SELECT * FROM public.attributeuse;
	CREATE TABLE backup.attributevalue AS SELECT * FROM public.attributevalue;
	CREATE TABLE backup.categories AS SELECT * FROM public.categories;
	CREATE TABLE backup.closedcash AS SELECT * FROM public.closedcash;
	CREATE TABLE backup.company AS SELECT * FROM public.company;
	CREATE TABLE backup.customers AS SELECT * FROM public.customers;
	CREATE TABLE backup.floors AS SELECT * FROM public.floors;
	CREATE TABLE backup.locations AS SELECT * FROM public.locations;
	CREATE TABLE backup.payments AS SELECT * FROM public.payments;
	CREATE TABLE backup.people AS SELECT * FROM public.people;
	CREATE TABLE backup.places AS SELECT * FROM public.places;
	CREATE TABLE backup.products AS SELECT * FROM public.products;
	CREATE TABLE backup.products_cat AS SELECT * FROM public.products_cat;
	CREATE TABLE backup.products_com AS SELECT * FROM public.products_com;
	CREATE TABLE backup.receipts AS SELECT * FROM public.receipts;
	CREATE TABLE backup.reservation_customers AS SELECT * FROM public.reservation_customers;
	CREATE TABLE backup.reservations AS SELECT * FROM public.reservations;
	CREATE TABLE backup.resources AS SELECT * FROM public.resources;
	CREATE TABLE backup.roles AS SELECT * FROM public.roles;
	CREATE TABLE backup.sharedtickets AS SELECT * FROM public.sharedtickets;
	CREATE TABLE backup.signatures AS SELECT * FROM public.signatures;
	CREATE TABLE backup.stockcurrent AS SELECT * FROM public.stockcurrent;
	CREATE TABLE backup.stockdiary AS SELECT * FROM public.stockdiary;
	CREATE TABLE backup.stocklevel AS SELECT * FROM public.stocklevel;
	CREATE TABLE backup.taxcategories AS SELECT * FROM public.taxcategories;
	CREATE TABLE backup.taxcustcategories AS SELECT * FROM public.taxcustcategories;
	CREATE TABLE backup.taxes AS SELECT * FROM public.taxes;
	CREATE TABLE backup.taxlines AS SELECT * FROM public.taxlines;
	CREATE TABLE backup.thirdparties AS SELECT * FROM public.thirdparties;
	CREATE TABLE backup.ticketlines AS SELECT * FROM public.ticketlines;
	CREATE TABLE backup.tickets AS SELECT * FROM public.tickets;
	
	GRANT ALL on table backup.applications to openk;
	ALTER TABLE backup.applications OWNER TO openk;
	
	GRANT ALL on table backup.attribute  to openk;
	ALTER TABLE backup.attribute OWNER TO openk;
	
	GRANT ALL on table backup.attributeinstance to openk;
		ALTER TABLE backup.attributeinstance OWNER TO openk;

	GRANT ALL on table backup.attributeset to openk;
		ALTER TABLE backup.attributeset OWNER TO openk;

	GRANT ALL on table backup.attributesetinstance to openk;
		ALTER TABLE backup.attributesetinstance OWNER TO openk;

	GRANT ALL on table backup.attributeuse to openk;
		ALTER TABLE backup.attributeuse OWNER TO openk;

	GRANT ALL on table backup.attributevalue to openk;
		ALTER TABLE backup.attributevalue OWNER TO openk;

	GRANT ALL on table backup.categories to openk;
		ALTER TABLE backup.categories OWNER TO openk;

	GRANT ALL on table backup.closedcash to openk;
		ALTER TABLE backup.closedcash OWNER TO openk;

	GRANT ALL on table backup.company to openk;
		ALTER TABLE backup.company OWNER TO openk;

	GRANT ALL on table backup.customers to openk;
		ALTER TABLE backup.customers OWNER TO openk;

	GRANT ALL on table backup.floors to openk;
		ALTER TABLE backup.floors OWNER TO openk;

	GRANT ALL on table backup.locations to openk;
		ALTER TABLE backup.locations OWNER TO openk;

	GRANT ALL on table backup.payments to openk;
		ALTER TABLE backup.payments OWNER TO openk;

	GRANT ALL on table backup.people to openk;
		ALTER TABLE backup.people OWNER TO openk;

	GRANT ALL on table backup.places to openk;
		ALTER TABLE backup.places OWNER TO openk;

	GRANT ALL on table backup.products to openk;
		ALTER TABLE backup.products OWNER TO openk;

	GRANT ALL on table backup.products_cat to openk;
		ALTER TABLE backup.products_cat OWNER TO openk;

	GRANT ALL on table backup.products_com to openk;
		ALTER TABLE backup.products_com OWNER TO openk;

	GRANT ALL on table backup.receipts to openk;
		ALTER TABLE backup.receipts OWNER TO openk;

	GRANT ALL on table backup.reservation_customers  to openk;
		ALTER TABLE backup.reservation_customers OWNER TO openk;

	GRANT ALL on table backup.reservations to openk;
		ALTER TABLE backup.reservations OWNER TO openk;

	GRANT ALL on table backup.resources to openk;
		ALTER TABLE backup.resources OWNER TO openk;

	GRANT ALL on table backup.roles to openk;
		ALTER TABLE backup.roles OWNER TO openk;

	GRANT ALL on table backup.sharedtickets to openk;
		ALTER TABLE backup.sharedtickets OWNER TO openk;

	GRANT ALL on table backup.signatures to openk;
		ALTER TABLE backup.signatures OWNER TO openk;

	GRANT ALL on table backup.stockcurrent to openk;
		ALTER TABLE backup.stockcurrent OWNER TO openk;

	GRANT ALL on table backup.stockdiary to openk;
		ALTER TABLE backup.stockdiary OWNER TO openk;

	GRANT ALL on table backup.stocklevel to openk;
		ALTER TABLE backup.stocklevel OWNER TO openk;

	GRANT ALL on table backup.taxcategories to openk;
		ALTER TABLE backup.taxcategories OWNER TO openk;

	GRANT ALL on table backup.taxcustcategories to openk;
		ALTER TABLE backup.taxcustcategories OWNER TO openk;

	GRANT ALL on table backup.taxes to openk;
		ALTER TABLE backup.taxes OWNER TO openk;

	GRANT ALL on table backup.taxlines to openk;
		ALTER TABLE backup.taxlines OWNER TO openk;

	GRANT ALL on table backup.thirdparties to openk;
		ALTER TABLE backup.thirdparties OWNER TO openk;

	GRANT ALL on table backup.ticketlines to openk;
		ALTER TABLE backup.ticketlines OWNER TO openk;

	GRANT ALL on table backup.tickets to openk;
		ALTER TABLE backup.tickets OWNER TO openk;

    versao := 'Sucesso';
    RETURN versao;
END;
$$ LANGUAGE plpgsql security definer;
ALTER FUNCTION execute_backup() OWNER TO postgres;

CREATE OR REPLACE FUNCTION execute_restore()  RETURNS varchar AS $$
DECLARE
    versao varchar := 'Erro';
 BEGIN

	 -- Primeiro remover os dados todos
	DELETE FROM public.sharedtickets WHERE 1=1;
	DELETE FROM public.thirdparties WHERE 1=1;
	DELETE FROM public.reservation_customers WHERE 1=1;
	DELETE FROM public.reservations WHERE 1=1;
	DELETE FROM public.places WHERE 1=1;
	DELETE FROM public.floors WHERE 1=1;
	DELETE FROM public.taxlines WHERE 1=1;
	DELETE FROM public.payments WHERE 1=1;
	DELETE FROM public.ticketlines WHERE 1=1;
	DELETE FROM public.tickets WHERE 1=1;
	DELETE FROM public.receipts WHERE 1=1;
	DELETE FROM public.closedcash WHERE 1=1;
	DELETE FROM public.stockcurrent WHERE 1=1;
	DELETE FROM public.stocklevel WHERE 1=1;
	DELETE FROM public.stockdiary WHERE 1=1;
	DELETE FROM public.locations WHERE 1=1;
	DELETE FROM public.products_com WHERE 1=1;
	DELETE FROM public.products_cat WHERE 1=1;
	DELETE FROM public.products WHERE 1=1;
	DELETE FROM public.attributeinstance WHERE 1=1;
	DELETE FROM public.attributesetinstance WHERE 1=1;
	DELETE FROM public.attributeuse WHERE 1=1;
	DELETE FROM public.attributeset WHERE 1=1;
	DELETE FROM public.attributevalue WHERE 1=1;
    DELETE FROM public.attribute WHERE 1=1;
	DELETE FROM public.taxes WHERE 1=1;
	DELETE FROM public.taxcategories WHERE 1=1;
	DELETE FROM public.categories WHERE 1=1;
	DELETE FROM public.customers WHERE 1=1;
	DELETE FROM public.taxcustcategories WHERE 1=1;
	DELETE FROM public.resources WHERE 1=1;
	DELETE FROM public.people WHERE 1=1;
	DELETE FROM public.roles WHERE 1=1;
    DELETE FROM public.applications WHERE 1=1;
	DELETE FROM public.signatures WHERE 1=1;
	DELETE FROM public.company WHERE 1=1;

	-- depois inserir os dados oriundos do backup
	INSERT INTO public.company SELECT * FROM backup.company;
	INSERT INTO public.signatures SELECT * FROM backup.signatures;
    INSERT INTO public.applications SELECT * FROM backup.applications;
	INSERT INTO public.roles SELECT * FROM backup.roles;
	INSERT INTO public.people SELECT * FROM backup.people;
	INSERT INTO public.resources SELECT * FROM backup.resources;
	INSERT INTO public.taxcustcategories SELECT * FROM backup.taxcustcategories;
	INSERT INTO public.customers SELECT * FROM backup.customers;
	INSERT INTO public.categories SELECT * FROM backup.categories;
	INSERT INTO public.taxcategories SELECT * FROM backup.taxcategories;
	INSERT INTO public.taxes SELECT * FROM backup.taxes;
    INSERT INTO public.attribute SELECT * FROM backup.attribute;
 	INSERT INTO public.attributevalue SELECT * FROM backup.attributevalue;
	INSERT INTO public.attributeset SELECT * FROM backup.attributeset;
	INSERT INTO public.attributeuse SELECT * FROM backup.attributeuse;
	INSERT INTO public.attributesetinstance SELECT * FROM backup.attributesetinstance;
	INSERT INTO public.attributeinstance SELECT * FROM backup.attributeinstance;
	INSERT INTO public.products SELECT * FROM backup.products;
	INSERT INTO public.products_cat SELECT * FROM backup.products_cat;
	INSERT INTO public.products_com SELECT * FROM backup.products_com;
	INSERT INTO public.locations SELECT * FROM backup.locations;
	INSERT INTO public.stockdiary SELECT * FROM backup.stockdiary;
	INSERT INTO public.stocklevel SELECT * FROM backup.stocklevel;
	INSERT INTO public.stockcurrent SELECT * FROM backup.stockcurrent;
	INSERT INTO public.closedcash SELECT * FROM backup.closedcash;
	INSERT INTO public.receipts SELECT * FROM backup.receipts;
	INSERT INTO public.tickets SELECT * FROM backup.tickets;
	INSERT INTO public.ticketlines SELECT * FROM backup.ticketlines;
	INSERT INTO public.payments SELECT * FROM backup.payments;
	INSERT INTO public.taxlines SELECT * FROM backup.taxlines;
	INSERT INTO public.floors SELECT * FROM backup.floors;
	INSERT INTO public.places SELECT * FROM backup.places;
	INSERT INTO public.reservations SELECT * FROM backup.reservations;
	INSERT INTO public.reservation_customers SELECT * FROM backup.reservation_customers;
	INSERT INTO public.thirdparties SELECT * FROM backup.thirdparties;
	INSERT INTO public.sharedtickets SELECT * FROM backup.sharedtickets;
    
    versao := 'Sucesso';
    RETURN versao;
END;
$$ LANGUAGE plpgsql security definer;
ALTER FUNCTION execute_restore() OWNER TO postgres;