--создание схемы данных магазина
create schema if not exists online_record;

-- таблица продуктов
create table if not exists online_record.customer
(
    id integer primary key, -- идентификатор строки,
    -- определяем столбцы
    firstName varchar(100), -- имя 100 символов
    lastName varchar(100), -- фамилия 100 символов,
    phone bigint  -- номер телефона
    );
create table if not exists online_record.order
(
    id integer primary key, -- идентификатор строки,
    -- определяем столбцы
    productName varchar(100), -- описание услуги
    price integer -- цена услуги
    );

create table if not exists online_record.calendar
(
    id integer primary key, -- идентификатор строки,
    -- определяем столбцы
    dateOrder DATA, -- дата услуги
    timeOrder TIME -- время услуги
    );

insert into online_record.customer(id, firstName, lastName, phone)
values
    (1, 'Татьяна', 'Полякова', 89604561237),
    (2, 'Ольга', 'Чепурная', 89289876543),
    (3, 'Анна', 'Гильмиярова', 89045612376),
    (4, 'Юлия', 'Ивлева', 89614561237),
    (5, 'Ксения', 'Момотова', 89184561237),
    (6, 'Злата', 'Осипова', 89054561237),
    (7, 'Томара', 'Зинченко', 89894561237);

insert into online_record.order(id, productName, price)
values
    (1, 'Маникюр с покрытием гель-лак', 1500),
    (2, 'Маникюр без покрытия', 1000),
    (3, 'Маникюр с покрытием гель-лак и дизайном', 2000),
    (4, 'Педикюр с покрытием гель-лак', 1900),
    (5, 'Педикюр без покрытия', 1200);

insert into online_record.calendar(id, dateOrder, timeOrder)
values
    (1, 15.02.2024, 9:00),
    (2, 15.02.2024, 12:00),
    (3, 15.02.2024, 15:00),
    (4, 15.02.2024, 18:00),
    (5, 16.02.2024, 9:00),
    (6, 16.02.2024, 12:00),
    (7, 16.02.2024, 15:00),
    (8, 16.02.2024, 18:00);