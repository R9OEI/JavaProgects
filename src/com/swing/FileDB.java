package com.swing;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class FileDB {

    static Functions functions = new Functions();

    public static int getQuantityOfWords() {
        int quantityOfWordsInFile = 0;
        File directory = new File("files");
        if (!directory.exists()) {
            directory.mkdir();
        }
        File answers = new File("files/answers.rex");
        if (!answers.exists()) {
            String zero = "0";
            Base64.Encoder encoder = Base64.getEncoder();
            String encode = encoder.encodeToString(zero.getBytes(StandardCharsets.UTF_8));
            try {
                answers.createNewFile();
                PrintWriter pw = new PrintWriter(answers);
                pw.print(encode);
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File errors = new File("files/errors.rex");
        if (!errors.exists()) {
            String zero = "0";
            Base64.Encoder encoder = Base64.getEncoder();
            String encode = encoder.encodeToString(zero.getBytes(StandardCharsets.UTF_8));
            try {
                errors.createNewFile();
                PrintWriter pw = new PrintWriter(errors);
                pw.print(encode);
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File level = new File("files/level.rex");
        if (!level.exists()) {
            String zero = "0";
            Base64.Encoder encoder = Base64.getEncoder();
            String encode = encoder.encodeToString(zero.getBytes(StandardCharsets.UTF_8));
            try {
                level.createNewFile();
                PrintWriter pw = new PrintWriter(level);
                pw.print(encode);
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file = new File("files/words.rex");
        if (!file.exists()) {
            try {
                file.createNewFile();
                PrintWriter pw = new PrintWriter(file);
                pw.println("I  Я");
                pw.println("YOU  ТЫ");
                pw.println("SHE  ОНА");
                pw.println("HE  ОН");
                pw.println("IT  ОНО");
                pw.println("WE  МЫ");
                pw.println("THEY  ОНИ");
                pw.println("ME  МНЕ");
                pw.println("HER  ЕЁ");
                pw.println("HIM  ЕМУ");
                pw.println("US  НАС");
                pw.println("THEM  ИМ");
                pw.println("MY  МОЙ");
                pw.println("YOUR  ТВОЙ");
                pw.println("HIS  ЕГО");
                pw.println("ITS  ЕГО, ЕЁ");
                pw.println("OUR  НАШ");
                pw.println("THEIR  ИХ");
                pw.println("THIS  ЭТОТ, ЭТО, ЭТА");
                pw.println("THESE  ЭТИ");
                pw.println("THAT  ТОТ, ТА, ТО");
                pw.println("THOSE  ТЕ");
                pw.println("ALL  ВСЁ");
                pw.println("EVERY  КАЖДЫЙ");
                pw.println("ANY  ЛЮБОЙ ЛЮБАЯ");
                pw.println("SOME  НЕКОТОРЫЙ");
                pw.println("OTHER  ДРУГОЙ");
                pw.println("NO  НЕТ");
                pw.println("WHAT  ЧТО");
                pw.println("WHO  КТО");
                pw.println("WHICH  КАКОЙ");
                pw.println("WHOSE  ЧЕЙ");
                pw.println("PEOPLE  ЛЮДИ");
                pw.println("FAMILY  СЕМЬЯ");
                pw.println("WOMAN  ЖЕНЩИНА");
                pw.println("MAN  МУЖЧИНА");
                pw.println("GIRL  ДЕВОЧКА");
                pw.println("BOY  МАЛЬЧИК");
                pw.println("CHILD  РЕБЁНОК");
                pw.println("FRIEND  ДРУГ");
                pw.println("HUSBAND  МУЖ");
                pw.println("WIFE  ЖЕНА");
                pw.println("NAME  ИМЯ");
                pw.println("HEAD  ГОЛОВА");
                pw.println("FACE  ЛИЦО");
                pw.println("HAND  РУКА");
                pw.println("LIFE  ЖИЗНЬ");
                pw.println("HOUR  ЧАС");
                pw.println("WEEK  НЕДЕЛЯ");
                pw.println("DAY  ДЕНЬ");
                pw.println("NIGHT  НОЧЬ");
                pw.println("MONTH  МЕСЯЦ");
                pw.println("YEAR  ГОД");
                pw.println("TIME  ВРЕМЯ");
                pw.println("WORLD  МИР");
                pw.println("SUN  СОЛНЦЕ");
                pw.println("ANIMAL  ЖИВОТНОЕ");
                pw.println("TREE  ДЕРЕВО");
                pw.println("WATER  ВОДА");
                pw.println("FOOD  ЕДА");
                pw.println("FIRE  ОГОНЬ");
                pw.println("COUNTRY  СТРАНА");
                pw.println("CITY  ГОРОД");
                pw.println("STREET  УЛИЦА");
                pw.println("WORK  РАБОТА");
                pw.println("SCHOOL  ШКОЛА");
                pw.println("SHOP  МАГАЗИН");
                pw.println("HOUSE  ДОМ");
                pw.println("ROOM  КОМНАТА");
                pw.println("CAR  АВТОМОБИЛЬ");
                pw.println("PAPER  БУМАГА");
                pw.println("PEN  РУЧКА");
                pw.println("DOOR  ДВЕРЬ");
                pw.println("CHAIR  СТУЛ");
                pw.println("TABLE  СТОЛ");
                pw.println("MONEY  ДЕНЬГИ");
                pw.println("WAY  ПУТЬ");
                pw.println("END  КОНЕЦ");
                pw.println("PRICE  ЦЕНА");
                pw.println("QUESTION  ВОПРОС");
                pw.println("ANSWER  ОТВЕТ");
                pw.println("NUMBER  НОМЕР");
                pw.println("BE  БЫТЬ");
                pw.println("HAVE  ИМЕТЬ");
                pw.println("DO  ДЕЛАТЬ");
                pw.println("GET  ПОЛУЧАТЬ");
                pw.println("CAN  МОЧЬ");
                pw.println("FEEL  ЧУВСТВОВАТЬ");
                pw.println("LIVE  ЖИТЬ");
                pw.println("LOVE  ЛЮБИТЬ");
                pw.println("WANT  ХОТЕТЬ");
                pw.println("SAY  СКАЗАТЬ");
                pw.println("TELL  ГОВОРИТЬ");
                pw.println("SEE  ВИДЕТЬ");
                pw.println("HEAR  СЛЫШАТЬ");
                pw.println("LISTEN TO  СЛУШАТЬ");
                pw.println("BELIEVE  ВЕРИТЬ");
                pw.println("TAKE  БРАТЬ");
                pw.println("GIVE  ДАВАТЬ");
                pw.println("GO  ИДТИ");
                pw.println("RUN  БЕЖАТЬ");
                pw.println("WALK  ГУЛЯТЬ");
                pw.println("COME  ПРИХОДИТЬ");
                pw.println("LEAVE  ПОКИДАТЬ");
                pw.println("SIT  СИДЕТЬ");
                pw.println("STAND  СТОЯТЬ");
                pw.println("MAKE  ДЕЛАТЬ");
                pw.println("KNOW  ЗНАТЬ");
                pw.println("UNDERSTAND  ПОНИМАТЬ");
                pw.println("REMEMBER  ПОМНИТЬ");
                pw.println("THINK  ДУМАТЬ");
                pw.println("BRING  ПРИНОСИТЬ");
                pw.println("FIND  НАХОДИТЬ");
                pw.println("LOSE  ТЕРЯТЬ");
                pw.println("USE  ИСПОЛЬЗОВАТЬ");
                pw.println("WORK  РАБОТАТЬ");
                pw.println("STUDY  УЧИТЬСЯ");
                pw.println("LEARN  УЧИТЬ");
                pw.println("ASK  СПРАШИВАТЬ");
                pw.println("ANSWER  ОТВЕТИТЬ");
                pw.println("LET  ПОЗВОЛЯТЬ");
                pw.println("HELP  ПОМОГАТЬ");
                pw.println("BEGIN  НАЧИНАТЬ");
                pw.println("PLAY  ИГРАТЬ");
                pw.println("WRITE  ПИСАТЬ");
                pw.println("READ  ЧИТАТЬ");
                pw.println("TURN  ПОВОРАЧИВАТЬ");
                pw.println("MEET  ВСТРЕТИТЬ");
                pw.println("CHANGE  ИЗМЕНИТЬ");
                pw.println("STOP  ОСТАНАВЛИВАТЬ");
                pw.println("OPEN  ОТКРЫТЬ");
                pw.println("CLOSE  ЗАКРЫТЬ");
                pw.println("IN  В");
                pw.println("ON  НА");
                pw.println("AT  У");
                pw.println("UNDER  ПОД");
                pw.println("OVER  НАД");
                pw.println("BETWEEN  МЕЖДУ");
                pw.println("TO  К");
                pw.println("FROM  ИЗ");
                pw.println("UP  ВВЕРХ");
                pw.println("DOWN  ВНИЗ");
                pw.println("THROUGH  ЧЕРЕЗ");
                pw.println("ALONG  ВДОЛЬ");
                pw.println("DURING  ВО ВРЕМЯ");
                pw.println("AFTER  ПОСЛЕ");
                pw.println("BEFORE  ДО");
                pw.println("SINCE  С (НАЧИНАЯ С...)");
                pw.println("WITH  С");
                pw.println("WITHOUT  БЕЗ");
                pw.println("ABOUT  О");
                pw.println("FOR  ДЛЯ");
                pw.println("ALWAYS  ВСЕГДА");
                pw.println("NEVER  НИКОГДА");
                pw.println("ALSO  ТАКЖЕ");
                pw.println("JUST  ПРОСТО");
                pw.println("ONLY  ТОЛЬКО");
                pw.println("AGAIN  ОПЯТЬ");
                pw.println("OFTEN  ЧАСТО");
                pw.println("STILL  ВСЁ ЕЩЁ");
                pw.println("ALREADY  УЖЕ");
                pw.println("ALMOST  ПОЧТИ");
                pw.println("ENOUGH  ДОСТАТОЧНО");
                pw.println("VERY  ОЧЕНЬ");
                pw.println("SOMETIMES  ИНОГДА");
                pw.println("NOW  СЕЙЧАС");
                pw.println("THEN  ТОГДА");
                pw.println("USUALLY  ОБЫЧНО");
                pw.println("QUICKLY  БЫСТРО");
                pw.println("SLOWLY  МЕДЛЕННО");
                pw.println("WELL  ХОРОШО");
                pw.println("ESPECIALLY  ОСОБЕННО");
                pw.println("GOOD  ХОРОШИЙ");
                pw.println("BAD  ПЛОХОЙ");
                pw.println("NEW  НОВЫЙ");
                pw.println("YOUNG  МОЛОДОЙ");
                pw.println("OLD  СТАРЫЙ");
                pw.println("BIG  БОЛЬШОЙ");
                pw.println("SMALL  МАЛЕНЬКИЙ");
                pw.println("LONG  ДЛИННЫЙ");
                pw.println("LOW  НИЗКИЙ");
                pw.println("HIGH  ВЫСОКИЙ");
                pw.println("STRONG  СИЛЬНЫЙ");
                pw.println("FREE  СВОБОДНЫЙ");
                pw.println("OPEN  ОТКРЫТЫЙ");
                pw.println("EASY  ЛЁГКИЙ");
                pw.println("RIGHT  ВЕРНЫЙ");
                pw.println("WRONG  НЕВЕРНЫЙ");
                pw.println("HOT  ГОРЯЧИЙ");
                pw.println("COLD  ХОЛОДНЫЙ");
                pw.println("HAPPY  СЧАСТЛИВЫЙ");
                pw.println("READY  ГОТОВЫЙ");


                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("files/words.rex"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (br.readLine() != null) {
                quantityOfWordsInFile++;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quantityOfWordsInFile;
    }

    public static String[] readAllFromFile(int quantityOfWordsInFile) {
        String[] allWords = new String[quantityOfWordsInFile];
        BufferedReader br = null;
        String str = "";

        try {
            br = new BufferedReader(new FileReader("files/words.rex"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i = 0;
        try {
            while ((str = br.readLine()) != null) {
                allWords[i] = str;
                i++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allWords;
    }

    public static String[] getEnWords(String[] allWords){
        String[] enWords = new String[allWords.length];
        for(int i = 0; i < allWords.length; i++){
            String string = allWords[i];
            int index = string.indexOf("  ");
            enWords[i] = string.substring(0, index);
        }
        return enWords;
    }

    public static String[] getRusWords(String[] allWords){
        String[] rusWords = new String[allWords.length];
        for(int i = 0; i < allWords.length; i++){
            String string = allWords[i];
            int index = string.indexOf("  ");
            rusWords[i] = string.substring((index + 2));
        }
        return rusWords;
    }

    public static void setTextIntoBase(int quantityOfWords, String entext, String rustext, String[] allWords){
        File file = new File("files/words.rex");
        try {
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0; i < quantityOfWords; i++){
                pw.println(allWords[i]);
            }
            pw.println(entext + "  " + rustext);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void setQuantityOfAnswersIntoBase(int quantityOfAnswers){
        File answers = new File("files/answers.rex");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(answers);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.print(functions.encrypt(quantityOfAnswers));
        pw.close();
    }

    public static void setQuantityOfErrorsIntoBase(int quantityOfErrors){
        File errors = new File("files/errors.rex");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(errors);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.print(functions.encrypt(quantityOfErrors));
        pw.close();
    }

    public static void setLevelIntoBase(int levelNum){
        File level = new File("files/level.rex");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(level);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.print(functions.encrypt(levelNum));
        pw.close();
    }

    public static int getQuantityOfAnswersFromBase(){
        String encryptString = "";
        File answers = new File("files/answers.rex");
        int quantityOfAnswers = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(answers));
            encryptString = br.readLine();
            quantityOfAnswers = functions.decrypt(encryptString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quantityOfAnswers;
    }

    public static int getQuantityOfErrorsFromBase(){
        String encryptString = "";
        File errors = new File("files/errors.rex");
        int quantityOfErrors = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(errors));
            encryptString = br.readLine();
            quantityOfErrors = functions.decrypt(encryptString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quantityOfErrors;
    }

    public static int getLevelFromBase(){
        String encryptString = "";
        File level = new File("files/level.rex");
        int levelNum = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(level));
            encryptString = br.readLine();
            levelNum = functions.decrypt(encryptString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return levelNum;
    }
}
