import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static String delim="\n----------------------\n";
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
/*        System.out.println();
        //boolean condition = true;
        //System.out.println(condition);
        //System.out.println(Boolean.TYPE);
        //System.out.println(Character.TYPE);
        System.out.println(Short.TYPE);
        System.out.println(Short.SIZE); //SIZE - размер в битах
        System.out.println(Short.BYTES);//BYTES - размер в Байтах
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("ЦЕЛОЧИСЛЕННЫЕ ТИПЫ");
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%-2d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("byte",Byte.BYTES,Byte.SIZE,Byte.MIN_VALUE,Byte.MAX_VALUE)
                );
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%-2d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("short",Short.BYTES,Short.SIZE,Short.MIN_VALUE,Short.MAX_VALUE)
                );
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%-2d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("integer",Integer.BYTES,Integer.SIZE,Integer.MIN_VALUE,Integer.MAX_VALUE)
                );
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%-2d бит памяти), и принимает значения в диапазоне от %d до %d".
                                formatted("long",Long.BYTES,Long.SIZE,Long.MIN_VALUE,Long.MAX_VALUE)
                );
        System.out.println("ВЕЩЕСТВЕННЫЕ ТИПЫ");
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%-2d бит памяти), и принимает значения в диапазоне от %e до %e".
                                formatted("float",Float.BYTES,Float.SIZE,Float.MIN_VALUE,Float.MAX_VALUE)
                );
        System.out.println
                (
                        "Переменная типа %-7s занимает %d Байт памяти (%-2d бит памяти), и принимает значения в диапазоне от %e до %e".
                                formatted("double",Double.BYTES,Double.SIZE,Double.MIN_VALUE,Double.MAX_VALUE)
                );
        System.out.println(delim);
        System.out.println("КОНСТАНТЫ");
        final int MAX_SPEED=250;

        System.out.println(((Object)512L).getClass().getSimpleName());
        System.out.println(((Object)512f).getClass().getSimpleName());
        System.out.println(delim);
        System.out.println("ВВОД С КЛАВИАТУРЫ");//Для ввода нужно создать Scanner
        Scanner kb = new Scanner(System.in);
        //System.out.println("Введите значение");
        //int a = kb.nextInt();
        //System.out.println("Вы ввели значение " + a);
        System.out.println(delim);
        System.out.println("ОПЕРАТОРЫ");
        System.out.println("Арифметические + - * / %");
        System.out.println(5.5%1);
        System.out.println(delim);
        System.out.println("УПРАВЛЯЮЩИЕ СТРУКТУРЫ");
        System.out.println("Switch может работать со строками");
        System.out.println("Введите направление");
        String direction = kb.nextLine();
        switch (direction)
        {
            case "left":
                System.out.println("Идем налево");
                break;
            case "right":
                System.out.println("Идем направо");
                break;
            case "forward":
                System.out.println("Идем вперед");
                break;
            case "backward":
                System.out.println("Идем назад");
                break;
            default:
                System.out.println("неверная команда");
        }*/
        Scanner kb = new Scanner(System.in);
        System.out.println("Расчет даты Пасхи по Гауссу. Введите год: ");
        int year = kb.nextInt();
        int a = year%19;
        int b = year%4;
        int c = year%7;
        int d = (19*a+15)%30;
        int e = (2*b+4*c+6*d+6)%7;
        int f = d+e;
        if (f<=26)
            System.out.println("Пасха будет "+(4+f)+" апреля");
        else System.out.println("Пасха будет "+(f-26)+" мая");
        System.out.println("Проверка числа на палиндром.");
        System.out.println(Palindrome.isPalindrome("12321"));
        System.out.println("Вывод предела Фибоначчи. Введите предел ряда: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}