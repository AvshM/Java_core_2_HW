package Homework;

import java.util.Arrays;
import java.util.Locale;

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

        //Задача №2
        //Создать переменные с ростом (!в метрах), весом в кило.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0345645
        double height = 2.1;
        double weight = 80;
        double indexMT = weight / (height * height);
        System.out.println(indexMT);

        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        //Ожидаемый результат:
        //abcde
        //abche

        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(arr);
        arr[3] = 'h';
        System.out.println(arr);

        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String textNum = "234";
        int number = Integer.parseInt(textNum);
        String textLen = "some_text";
        System.out.println(number+textLen.length());

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        double a = 3;
        double b = 5;
        double square;
        square = Math.pow (a+b, 2);
        System.out.println(square);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером

        int[] arr1 = {1, 2, 5, 7, 10};
        int[] arr2 = {2, 3, 2, 17, 15};
        int[] arrRes = new int[15];

        for (int i = 0; i < 5; i++){
            arrRes[i] = arr1[i];
            arrRes[i + 5]=arr2[i];
            arrRes[i + 10]=arr1[i]*arr2[i];
        }
        System.out.println(Arrays.toString(arrRes));

        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран

        String textN4 = "Hello world!";
        String resTextN4 = textN4.replaceAll("l","r").toUpperCase().substring(0, 8);
        System.out.println(resTextN4);

    }

}
