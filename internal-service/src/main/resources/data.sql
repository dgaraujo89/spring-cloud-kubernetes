
DROP TABLE IF EXISTS public.users;

CREATE TABLE public.users (
	id INT AUTO_INCREMENT PRIMARY KEY,
	firstname VARCHAR(250) NOT NULL,
	lastname VARCHAR(250) NOT NULL,
	email VARCHAR(250) NOT NULL,
	age INT
);

INSERT INTO users (firstname, lastname, email, age) VALUES ('Maria', 'Rosario', 'maria@kmail.com', 25);
INSERT INTO users (firstname, lastname, email, age) VALUES ('João', 'Amadeu', 'joao@kmail.com', 18);
INSERT INTO users (firstname, lastname, email, age) VALUES ('Pedro', 'Junior', 'pedro@kmail.com', 35);
INSERT INTO users (firstname, lastname, email, age) VALUES ('Claudia', 'Nascimento', 'claudia@kmail.com', 56);