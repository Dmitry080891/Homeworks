-- вывод всех данных из таблицы продукты
SELECT * FROM shop.product;

-- вывод всех продуктов, количество которых больше 3
SELECT * FROM shop.product
WHERE product.quantity > 3;

-- вывод всех продуктов, кцена которых меньше 2000
SELECT * FROM shop.product
WHERE product.cost < 2000;

-- всего товаров в магазине
SELECT sum(quantity) FROM shop.product;

-- вывод всех данных из таблицы аккаунт
SELECT * FROM shop.account;

-- вывод всех строк из таблицы заказы
SELECT * FROM shop.order;

-- вывод общего числа заказов
SELECT count(*) FROM shop.order;

-- изменение данных таблицы аккаунт у id=10
UPDATE shop.account SET first_name = 'Антон',
                        last_name = 'Деревянко'
                    WHERE shop.account.id = 10;
SELECT * FROM shop.account;

-- вывод не повторяющихся фамилий из таблицы аккаунт отсортированные по алфавиту
SELECT distinct account.last_name
FROM shop.account
ORDER BY account.last_name;

-- вывод не повторяющихся фамилий из таблицы аккаунт отсортированные по алфавиту в обратном порядке
SELECT distinct account.last_name
FROM shop.account
ORDER BY account.last_name DESC ;

-- вывод количества покупок у пользователя с id=10
SELECT distinct shop.order.quantity_order, shop.account.first_name, shop.account.last_name
FROM shop.order
    INNER JOIN shop.account ON shop.account.id = 10;

-- удаление аккаунта по фамилии
DELETE FROM shop.account WHERE last_name='Петров';



