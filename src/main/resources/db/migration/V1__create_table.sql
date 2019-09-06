CREATE TABLE users (
   id SERIAL PRIMARY KEY,
   name VARCHAR(50),
   username VARCHAR(50),
   password VARCHAR(50)
);

CREATE TABLE boards (
   id SERIAL PRIMARY KEY,
   name VARCHAR(50),
   owner_id integer NOT NULL REFERENCES users (id)
);

CREATE TABLE board_members (
   id SERIAL PRIMARY KEY,
   board_id integer NOT NULL REFERENCES boards (id),
   member_id integer NOT NULL REFERENCES users (id)
);

CREATE TABLE lists (
   id SERIAL PRIMARY KEY,
   name VARCHAR(50),
   board_id integer NOT NULL REFERENCES boards (id)
);

CREATE TABLE cards (
   id SERIAL PRIMARY KEY,
   name VARCHAR(50),
   due_date DATE,
   description VARCHAR(200),
   list_id integer NOT NULL REFERENCES lists (id)
);

CREATE TABLE card_members (
   id SERIAL PRIMARY KEY,
   card_id integer NOT NULL REFERENCES cards (id),
   member_id integer NOT NULL REFERENCES users (id)
);

CREATE TABLE checklists (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    card_id integer NOT NULL REFERENCES cards (id)
);

CREATE TABLE checklist_items(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    checklist_id integer NOT NULL REFERENCES checklists (id)
);