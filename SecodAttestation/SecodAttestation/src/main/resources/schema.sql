
--создание схемы данных магазина
create schema if not exists shop;

-- таблица продуктов
create table if not exists shop.product
(
    id         serial primary key, -- идентификатор строки, всегда уникальный, генерируется базой данных
    -- определяем столбцы
    description varchar(100), -- описание 100 символов
    cost integer check (cost > 0), -- стоимость товара, не может быть меньше 0
    quantity integer check (quantity > 0) -- количество товара, не может быть меньше 0
    );

-- insert добавление данных в таблицу продукт (создание перечня товаров)
insert into shop.product(description, cost, quantity)
VALUES
    ('книга', 3500, 7),
    ('мяч', 1000, 20),
    ('стол', 4000, 6),
    ('стул', 1500, 12),
    ('настольная лампа', 1000, 10),
    ('ноутбук', 100000, 5),
    ('компьютерная мышь', 500, 9),
    ('диван', 15000, 3),
    ('кактус', 2000, 8),
    ('шкаф', 5000, 4);

-- создание таблицы аккаунт (покупатель)
create table if not exists shop.account
(
    id         serial primary key, -- идентификатор строки, всегда уникальный, генерируется базой данных
    first_name varchar(20), -- имя покупателя (до 20 символов)
    last_name  varchar(20) -- фамилия покупателя (до 20 символов)
    );
-- insert добавление данных в таблицу аккаунт (создание перечня покупателей)
insert into shop.account(first_name, last_name)
VALUES
    ('Павел', 'Петров'),
    ('Светлана', 'Арзамасова'),
    ('Виктор', 'Логинов'),
    ('Дмитрий', 'Деревянко'),
    ('Юлия', 'Максютина'),
    ('Андрей', 'Соловьёв'),
    ('Александр', 'Коровин'),
    ('Надежда', 'Тарасенко'),
    ('Айгуль', 'Садыкова'),
    ('Дмитрий', 'Петров');

-- таблица заказов (корзина покупателя)
create table if not exists shop.order
(
    id         serial primary key, -- идентификатор строки, всегда уникальный, генерируется базой данных
     account_id integer references shop.account(id), --связка с талицей аккаунт по id покупателя
    product_id integer references shop.product(id), --связка с талицей продукт по id товара
    order_date timestamp, --дата заказа
    quantity_order integer  --количество купленного товара
    -- check (quantity_order <= product(quantity))
    );

-- insert добавление данных в таблицу заказов (создание перечня покупок)
insert into shop.order(account_id, product_id, order_date, quantity_order)
VALUES
    (1, 10, CURRENT_DATE, 1),
    (2, 9, CURRENT_DATE, 1),
    (3, 8, CURRENT_DATE, 1),
    (4, 7, CURRENT_DATE, 1),
    (5, 6, CURRENT_DATE, 1),
    (6, 5, CURRENT_DATE, 1),
    (7, 4, CURRENT_DATE, 1),
    (8, 3, CURRENT_DATE, 1),
    (9, 2, CURRENT_DATE, 1),
    (10, 1, CURRENT_DATE, 1);
-- запрос к таблице
select *
from shop.order;





