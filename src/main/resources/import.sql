create database prestamos_libros;
use prestamos_libros;

create table if not exists Book (
    id bigint not null auto_increment,
    title varchar(255),
    author varchar(255),
    isbn varchar(255),
    primary key (id)
);
create table if not exists loan (
    id bigint not null auto_increment,
    fecha_init date,
    fecha_dev date,
    book_id bigint,
    user_id bigint,
    primary key (id)
);

create table if not exists user (
    id bigint not null auto_increment,
    nombre varchar(255),
    email varchar(255),
    primary key (id)
);

alter table loan add constraint FK_loan_book_id foreign key (book_id) references Book (id);
alter table loan add constraint FK_loan_user_id foreign key (user_id) references user (id);

insert into Book (title, author, isbn) values ('The Lord of the Rings', 'J.R.R. Tolkien', '978-0618053267');
insert into Book (title, author, isbn) values ('The Hobbit', 'J.R.R. Tolkien', '978-0345339683');
insert into Book (title, author, isbn) values ('The Catcher in the Rye', 'J.D. Salinger', '978-0316769488');

insert into user (nombre, email) values ('John Doe', 'john.doe@example.com');
insert into user (nombre, email) values ('Jane Smith', 'jane.smith@example.com');

insert into loan (fecha_init, fecha_dev, book_id, user_id) values ('2023-01-01', '2023-01-15', 1, 1);
insert into loan (fecha_init, fecha_dev, book_id, user_id) values ('2023-02-01', '2023-02-28', 2, 2);
insert into loan (fecha_init, fecha_dev, book_id, user_id) values ('2023-03-01', '2023-03-10', 3, 1);
insert into loan (fecha_init, fecha_dev, book_id, user_id) values ('2023-04-01', '2023-04-15', 1, 2);
insert into loan (fecha_init, fecha_dev, book_id, user_id) values ('2023-05-01', '2023-05-30', 2, 1);
insert into loan (fecha_init, fecha_dev, book_id, user_id) values ('2023-06-01', '2023-06-15', 3, 2);