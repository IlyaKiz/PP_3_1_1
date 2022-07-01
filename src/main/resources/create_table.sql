
# Дамп таблицы users
# ------------------------------------------------------------

DROP TABLE IF EXISTS `users_3_1_1`;

CREATE TABLE `users_3_1_1` (
                         `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
                         `name` varchar(250) DEFAULT NULL,
                         `last_name` varchar(250) DEFAULT NULL,
                         `email` varchar(250) DEFAULT NULL,

                          PRIMARY KEY (`id`)



) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `users_3_1_1` (`id`, `name`, `last_name`,`email`)
VALUES
    (1,'Ivan','Ivanov','ivan@mail.ru'),
    (2,'Ilya','Kizilov','iliakiz@mail.ru');


