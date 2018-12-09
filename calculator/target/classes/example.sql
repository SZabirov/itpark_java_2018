--Язык SQL - язык для написания запросов к Базе Данных
--База данных - Database. Сокращения: БД, DB.
--Система управления базой данных, которую мы
--используем - PostgreSQL.
--Данные в базе данных хранятся в таблицах
--Ссылка на иструкцию: https://info-comp.ru/sisadminst/512-review-and-install-postgresql-9-5.html

--Удаляет всю таблицу (не данные в ней)
DROP TABLE product;

--Создание таблицы с четырьмя колонками
CREATE TABLE product (
	id INT,
	name VARCHAR(255),
	price INT,
	factory_id INT
);

--Запрос для вставки строки в таблицу
--сначала указываем имя таблицы и колонки,
--в которые вставляем значения, а затем
--конкретные значения
INSERT INTO product(id, name, price, factory_id)
VALUES (1, 'Молоко', 40, 1);

--Запрос для того, чтобы получить содержимое
--всех колонок таблицы
SELECT * FROM product;

INSERT INTO product(id, name, price)
VALUES (2, 'Кефир', 30);
INSERT INTO product(id, name, price)
VALUES (3, 'Сметана', 60);

--Получить все строки из таблицы,
--у которых цена больше 35
SELECT * FROM product WHERE price > 35;

--Удаление строк, в которых id равно 1
DELETE FROM product WHERE id = 1;

--Установить цену в 80 у продукта с id 3
UPDATE product SET price = 80
WHERE id = 3;

CREATE TABLE factory (
	id INT,
	name VARCHAR(255),
	address VARCHAR(255)
);
DELETE FROM factory;
INSERT INTO factory(id, name, address)
VALUES (1, 'Молокозавод 42', 'Kazan');
INSERT INTO factory(id, name, address)
VALUES (2, 'Хлебзавод 15', 'Kazan');

SELECT * from factory;
SELECT * from product;








