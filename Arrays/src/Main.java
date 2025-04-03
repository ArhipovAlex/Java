import javax.xml.transform.Source;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
/*        System.out.println("Hello, Arrays!");
        System.out.println("Введите размер массива ");
        int n = 5; //kb.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = rand.nextInt(0,100);
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("Сумма элементов массива "   +   IntStream.of(arr).sum());
        System.out.println("Среднее арифметическое "    +   IntStream.of(arr).average().getAsDouble());
        System.out.println("Минимальное значение "      +   IntStream.of(arr).min().getAsInt());
        System.out.println("Максимальное значение "     +   IntStream.of(arr).max().getAsInt());

        arr = IntStream.of(arr).sorted().toArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }*/
        System.out.println("Введите количество строк: ");
        int rows = 4;//kb.nextInt();
        System.out.println("Введите количество столбцов: ");
        int cols = 5;//kb.nextInt();
        int[][] arrs = new int[rows][cols];
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arrs[i][j]=rand.nextInt(0,100);;
            }
        }
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arrs[i][j]+"\t");
            }
            System.out.println();
        }
        //System.out.println("Сумма элементов массива "+IntStream.of(arrs.).sum());
        int[] flatten = Arrays.stream(arrs)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println("Сумма элементов массива "+IntStream.of(flatten).sum());
        System.out.println("Среднее арифметическое "+IntStream.of(flatten).average().getAsDouble());
        System.out.println("Минимальное "+IntStream.of(flatten).min().getAsInt());
        System.out.println("Максимальное "+IntStream.of(flatten).max().getAsInt());

        Arrays.sort(arrs,Comparator.comparingInt(a ->a[0]));
        for (int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arrs[i][j]+"\t");
            }
            System.out.println();
        }
    }
}