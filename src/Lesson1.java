public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        //Примитивы
        //true - да, false - нет
        boolean answer = false;
        System.out.println("Нравится ли вам кофе?");
        System.out.println(answer);

        // от минуст 127 до 127
        byte bt = 125;
        short sh = 32000;
        int num = -3_000_000;
        long ln = 8_000_000_000l;
        float fl = 4.539999999999999f;
        double db = 3.1232905795723;
        System.out.println(fl);
        System.out.println(bt);
        System.out.println(db);
        db = num / bt;
        System.out.println(db);
        int[] array = new int[9];
        num = 0;
        array[0] = 11;
        array[1] = 8;
        while (num < 4) {
            array[num] = array[num] - array[num+1];
            System.out.println(num + " " + array[num]);
            num=num+1;
        }
        char [] arrayChar = new char [5];
        arrayChar [0] = 'В';
        arrayChar [1] = 'о';
        arrayChar [2] = 'д';
        arrayChar [3] = 'к';
        arrayChar [4] = 'а';
        System.out.println(arrayChar);

    }
}
