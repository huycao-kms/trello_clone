CREATE TABLE boards (
   id SERIAL PRIMARY KEY,
   name VARCHAR(50),
   user_id integer,
   FOREIGN KEY (user_id) REFERENCES users (id)
);