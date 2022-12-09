1.1:
CREATE TABLE IF NOT EXISTS clients (
              id    serial
                  CONSTRAINT clients_pk PRIMARY KEY,
              name  varchar(20),
              email varchar(255) UNIQUE NOT NULL,
              phone bigint UNIQUE       NOT NULL,
              about varchar );

1.2:
CREATE TABLE IF NOT EXISTS statuses (
                     id          serial
                         CONSTRAINT statuses_pk
                             PRIMARY KEY,
                     alias       varchar(15) UNIQUE NOT NULL,
                     description text               NOT NULL );

1.3:
CREATE TABLE IF NOT EXISTS client_status (
                     client_id int NOT NULL,
                     status_id int NOT NULL );

1.4:
CREATE TABLE IF NOT EXISTS accounts (
                     id        SERIAL
                         CONSTRAINT accounts_pk PRIMARY KEY,
                     client_id int                NOT NULL,
                     number    varchar(20) UNIQUE NOT NULL,
                     value     double precision   NOT NULL );

2.1:
INSERT INTO clients (name, email, phone, about) VALUES ('Alex', 'alex@mail.com', 380958089090, 'One');
INSERT INTO clients (name, email, phone, about) VALUES ('Bob', 'bob@mail.com', 380958089091, 'Two');
INSERT INTO clients (name, email, phone, about) VALUES ('Mike', 'mike@mail.com', 380958089092, 'Three');
INSERT INTO clients (name, email, phone, about) VALUES ('John', 'john@mail.com', 380958089093, 'Four');
INSERT INTO clients (name, email, phone, about) VALUES ('Jack', 'jack@mail.com', 380958089094, 'Five');
INSERT INTO clients (name, email, phone, about) VALUES ('Kyle', 'kyle@mail.com', 380958089095, 'Six');
INSERT INTO clients (name, email, phone, about) VALUES ('Boris', 'boris@mail.com', 380958089096, 'Seven');
INSERT INTO clients (name, email, phone, about) VALUES ('Nikolay', 'nikolay@mail.com', 380958089097, 'Eight');
INSERT INTO clients (name, email, phone, about) VALUES ('Vlad', 'vlad@mail.com', 380958089098, 'Nine');
INSERT INTO clients (name, email, phone, about) VALUES ('Eddy', 'eddy@mail.com', 380958089099, 'Ten');

2.2:
INSERT INTO statuses (alias, description) VALUES ('STANDARD', 'limit up to 100 thousand.');
INSERT INTO statuses (alias, description) VALUES ('PREMIUM', 'limit up to 250 thousand.');
INSERT INTO statuses (alias, description) VALUES ('VIP', 'half a million limit.');

2.3:
INSERT INTO client_status (client_id, status_id) VALUES (1, 1);
INSERT INTO client_status (client_id, status_id) VALUES (2, 1);
INSERT INTO client_status (client_id, status_id) VALUES (3, 2);
INSERT INTO client_status (client_id, status_id) VALUES (4, 1);
INSERT INTO client_status (client_id, status_id) VALUES (5, 1);
INSERT INTO client_status (client_id, status_id) VALUES (6, 2);
INSERT INTO client_status (client_id, status_id) VALUES (7, 1);
INSERT INTO client_status (client_id, status_id) VALUES (8, 1);
INSERT INTO client_status (client_id, status_id) VALUES (9, 3);
INSERT INTO client_status (client_id, status_id) VALUES (10, 3);

2.4:
INSERT INTO accounts (client_id, number, value) VALUES (1, '5168685151680101', 3000.00);
INSERT INTO accounts (client_id, number, value) VALUES (2, '5168685151680202', 55000.00);
INSERT INTO accounts (client_id, number, value) VALUES (3, '5168685151680303', 150000.00);
INSERT INTO accounts (client_id, number, value) VALUES (4, '5168685151680404', 35000.00);
INSERT INTO accounts (client_id, number, value) VALUES (5, '5168685151680505', 76850.00);
INSERT INTO accounts (client_id, number, value) VALUES (6, '5168685151680606', 215500.00);
INSERT INTO accounts (client_id, number, value) VALUES (7, '5168685151680707', 500.00);
INSERT INTO accounts (client_id, number, value) VALUES (8, '5168685151680808', 70.00);
INSERT INTO accounts (client_id, number, value) VALUES (9, '5168685151680909', 450000.00);
INSERT INTO accounts (client_id, number, value) VALUES (10, '5168685151681010', 320000.00);

3.1:
SELECT * FROM clients WHERE phone = 380958089090;

3.2:
SELECT alias, description FROM statuses;

3.3:
SELECT number FROM accounts WHERE value > 1000.00;

3.4:
SELECT * FROM clients WHERE length(name) > 7;

3.5:
SELECT name, phone, about FROM clients WHERE name IS NOT NULL AND phone > 380951111111 AND about IS NOT NULL;

3.6:
SELECT * FROM clients WHERE starts_with(email, 'alex');

3.7:
SELECT * FROM clients ORDER BY -phone;

3.8:
SELECT * FROM clients AS c INNER JOIN accounts a ON c.id = a.client_id;

3.9:
SELECT c.name, c.email, c.phone, s.alias FROM clients AS c INNER JOIN
client_status cs ON c.id = cs.client_id INNER JOIN statuses s ON cs.status_id = s.id;
