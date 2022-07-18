package Homework;

public class Homework_1_Light {
    public static void main(String[] args) {
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //затроить (Можно вызвать тольку одну команду System.out.println())
        //Привести к правильному виду (Ниже) используя String.trim()
        String result = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(result.repeat(3));




    }
}
