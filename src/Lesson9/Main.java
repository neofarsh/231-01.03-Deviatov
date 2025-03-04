package Lesson9;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        db.isConnection();

        db.selectTable("track");

//        db.createTable("account", "id INT PRIMARY KEY, name VARCHAR(30), count_track INT, is_premium BOOLEAN");
//        db.createTable("album", "id INT PRIMARY KEY, name VARCHAR(30), count_track INT, name_album VARCHAR(30), years_exit INT");
//        db.createTable("artist", "id INT PRIMARY KEY, name VARCHAR(30), count_listen INT");
//        db.createTable("track", "id INT PRIMARY KEY, name VARCHAR(30), author VARCHAR(30), longless VARCHAR(10)");
//
//        db.addValue("account", "1, 'дмитрий', 345, true");
//        db.addValue("account", "2, 'алексей', 20, false");
//        db.addValue("account", "3, 'игнат', 23, true");
//        db.addValue("account", "4, 'аня', 12, false");
//        db.addValue("account", "5, 'диана', 65, true");
//        db.addValue("account", "6, 'михаил', 123, true");
//        db.addValue("account", "7, 'максимочка', 35, true");
//        db.addValue("account", "8, 'лена', 20, false");
//        db.addValue("account", "9, 'салли', 6, true");
//        db.addValue("account", "10, 'лера', 658, true");
//        db.addValue("account", "11, 'диана', 145, false");
//        db.addValue("account", "12, 'aleksei', 452, false");
//        db.addValue("account", "13, 'егор', 124, true");
//        db.addValue("account", "14, 'челолвек', 12, false");
//        db.addValue("account", "15, 'черный', 63, false");
//        db.addValue("account", "16, 'ваня', 345, false");
//        db.addValue("account", "17, 'богдан', 543, false");
//        db.addValue("account", "18, 'илья', 45, true");
//        db.addValue("account", "19, 'дима', 25, false");
//        db.addValue("account", "20, 'егор', 258, true");
//        db.addValue("account", "21, 'рома', 845, false");
//        db.addValue("account", "22, 'данила', 453, false");
//        db.addValue("account", "23, 'алексей', 142, false");
//        db.addValue("account", "24, 'лина', 745, true");
//        db.addValue("account", "25, 'кирилл', 82, true");
//        db.addValue("account", "26, 'аянами', 45, false");
//        db.addValue("account", "27, 'майоров', 68, false");
//        db.addValue("account", "28, 'увелка', 5763, false");
//        db.addValue("account", "29, 'игнат', 56, true");
//        db.addValue("account", "30, 'чонгук', 234, false");
//
//        db.addValue("album", "1, 'раскраски для взрослых', 9, 'монеточка', 2017");
//        db.addValue("album", "2, 'Geometrical', 8, 'F-777', 2009");
//        db.addValue("album", "3, 'Really Cares', 12, 'TV Girl', 2020");
//        db.addValue("album", "4, 'Lover', 15, 'Lover', 2023");
//        db.addValue("album", "5, 'episode 0', 6, 'ndptvfr', 2024");
//        db.addValue("album", "6, 'With YOU-th', 12, 'Twice', 2020");
//        db.addValue("album", "7, 'Instupendo', 9, 'Instupendo', 2021");
//        db.addValue("album", "8, 'nobody', 10, 'Mr. Kitty', 2019");
//        db.addValue("album", "9, 'wergrejk', 1, 'foijerwjgo', 2000");
//        db.addValue("album", "10, '505', 16, 'Время и Стекло', 2014");
//        db.addValue("album", "14, 'KIss Me again', 12, 'Roy Bee', 2009");
//        db.addValue("album", "15, 'в пряничном домике', 12, 'mzvff', 2024");
//        db.addValue("album", "11, 'Smash It', 11, 'F-777', 2012");
//        db.addValue("album", "12, 'ВИТОН 2', 1, 'INSTASAMKA', 2020");
//        db.addValue("album", "13, 'Симфонии Чайковского', 9, 'Чайковский', 1970");
//        db.addValue("album", "16, 'ДЕВОЧКА С КАРЕ', 5, 'МУККА', 2019");
//        db.addValue("album", "17, 'Я люблю хардкор', 1, 'Xrdee', 2022");
//        db.addValue("album", "18, 'Последний герой', 10, 'Кино', 1989");
//        db.addValue("album", "19, 'Королева Тик Тока', 13, 'АЛьбина Сексова', 2020");
//        db.addValue("album", "20, 'Кискисмяумяу', 1, 'Артей Кей', 2018");
//        db.addValue("album", "21, 'POPSTAR', 10, 'INSTASAMKA', 2022");
//        db.addValue("album", "22, 'QUEEN OF RAP', 9, 'INSTASAMKA', 2022");
//        db.addValue("album", "23, 'Moneydealer', 10, 'INSTASAMKA', 2021");
//        db.addValue("album", "24, 'Молитвы. Анекдоты.', 10, 'монеточка', 2024");
//        db.addValue("album", "25, 'Я лиза', 8, 'монеточка', 2017");
//        db.addValue("album", "26, 'Deltrarune 2 chapter', 47, 'Toby Fox', 2021");
//        db.addValue("album", "27, 'Свиное рыло', 10, 'ЛСП', 2020");
//        db.addValue("album", "28, 'Секретарша', 1, 'ЛСП', 2024");
//        db.addValue("album", "29, 'Бриллианты', 1, 'ЛСП', 2024");
//        db.addValue("album", "30, 'Tragic City', 12, 'ЛСП', 2020");
//
//        db.addValue("artist", "1, 'ЛСП', 1");
//        db.addValue("artist", "2, 'монеточка', 7");
//        db.addValue("artist", "3, 'Geometrical', 1");
//        db.addValue("artist", "4, 'TV Girl', 7");
//        db.addValue("artist", "5, 'ndptvfr', 4");
//        db.addValue("artist", "6, 'Twice', 4");
//        db.addValue("artist", "7, 'Дайте танк (!)', 6");
//        db.addValue("artist", "8, 'лорипшугкш', 3");
//        db.addValue("artist", "9, 'Земфира', 8");
//        db.addValue("artist", "10, 'Смешарики', 1");
//        db.addValue("artist", "11, 'Fleur', 5");
//        db.addValue("artist", "12, 'Марина Девятова', 1");
//        db.addValue("artist", "13, 'Электрофорез', 5");
//        db.addValue("artist", "14, 'Время и стекло', 10");
//        db.addValue("artist", "15, 'Little Big', 3");
//        db.addValue("artist", "16, 'plenka', 4");
//        db.addValue("artist", "17, 'Алена Швец', 4");
//        db.addValue("artist", "18, 'МЫ', 5");
//        db.addValue("artist", "19, 'Пошлая молли', 3");
//        db.addValue("artist", "20, 'ЩЕНКИ', 2");
//        db.addValue("artist", "21, 'Ёлка', 3");
//        db.addValue("artist", "22, 'Dead Blonde', 3");
//        db.addValue("artist", "23, 'Игорёк', 2");
//        db.addValue("artist", "24, 'Vtornik', 2");
//        db.addValue("artist", "25, 'Дорофеева', 2");
//        db.addValue("artist", "26, 'Noice MC', 6");
//        db.addValue("artist", "27, 'IC3PEAK', 1");
//        db.addValue("artist", "28, 'Король и Шут', 4");
//        db.addValue("artist", "29, 'Ольга Бузова', 3");
//        db.addValue("artist", "30, 'ooes', 1");

    }
}
