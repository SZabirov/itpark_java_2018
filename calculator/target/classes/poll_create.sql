CREATE TABLE poll (
	id SERIAL,
	question VARCHAR(255)
);
CREATE TABLE option (
	id SERIAL,
	text VARCHAR(255),
	poll_id INT,
	count INT
);
INSERT INTO poll(question)
VALUES ('Какой Ваш любимый цвет?');
INSERT INTO poll(question)
VALUES ('Ваш возраст?');
INSERT INTO option (text, poll_id, count)
VALUES ('белый', 1, 0);
INSERT INTO option (text, poll_id, count)
VALUES ('красный', 1, 0);
INSERT INTO option (text, poll_id, count)
VALUES ('зеленый', 1, 0);

