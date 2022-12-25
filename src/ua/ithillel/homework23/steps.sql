/*
 1:
 */
CREATE OR REPLACE FUNCTION update_client_statuses() RETURNS TRIGGER AS
$$
DECLARE
    cl_id int;
    st_id int;
BEGIN
    IF TG_OP = 'INSERT' THEN
        cl_id = NEW.id;
        st_id = (SELECT id FROM statuses WHERE alias = 'Not chosen');
        INSERT INTO client_statuses(client_id, status_id) VALUES (cl_id, st_id);
        RETURN NEW;

    ELSIF TG_OP = 'UPDATE' THEN
        cl_id = OLD.id;
        UPDATE client_statuses SET client_id = cl_id WHERE client_id = OLD.id;
        RETURN OLD;

    ELSIF TG_OP = 'DELETE' THEN
        cl_id = OLD.id;
        DELETE FROM client_statuses WHERE client_id = cl_id;
        RETURN OLD;
    END IF;
END ;
$$ LANGUAGE plpgsql;

/*
 использование курсора для перезаписи данных:
 */
CREATE OR REPLACE FUNCTION rewrite_data() RETURNS void AS
$func$
DECLARE
    curs CURSOR FOR SELECT *
                    FROM clients;

BEGIN
    FOR row IN curs
        LOOP
            INSERT INTO clients_target(id, name, email, phone, about)
            VALUES (row.id, row.name, row.email, row.phone, row.about);

        END LOOP;
END;

$func$ LANGUAGE plpgsql;
SELECT rewrite_data();

/*
 2:
 */
create trigger client_t
    after insert or update or delete
    on clients
    for each row
execute procedure update_client_statuses();

/*
 3:
 */
CREATE TABLE IF NOT EXISTS client_statuses
(
    client_id int NOT NULL,
    CONSTRAINT fk_client
        FOREIGN KEY (client_id) REFERENCES clients (id),
    status_id int NOT NULL,
    CONSTRAINT fk_status
        FOREIGN KEY (status_id) REFERENCES statuses (id)
);