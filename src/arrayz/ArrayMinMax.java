package arrayz;

public class ArrayMinMax {
    public static void main(String[] args) {
        int num [] = {123, -453, 129, 132, -392, 239, 234, 456, 453, 321};
        int min = 0, max = 0;
        int numX;
        //Выводим исходный массив
        System.out.println("Исходный массив");

        for (int i = 0; i < num.length; i++){
            System.out.print( num [i] + "\t\t");
        }
        System.out.println();

        //алгоритм сортировки
        for (int a = 1; a < num.length; a++)
        for (int i = num.length-1; i >= a; i--){
            if (num[i] < num[i-1]) {
                numX = num[i];
                num[i] = num[i-1];
                num[i-1] = numX;
            }
        }
        //Выводим отсортированный массив
        System.out.println("Отсортированный массив");
        for (int i =0 ; i < 10; i ++)
            System.out.print(num[i] + "\t\t");
        System.out.println();

        //находим мин/макс
        for (int i = 0; i <num.length; i++){
            if (num [i] < min)
                min = num [i];
            if (num [i] > max)
                max = num[i];
        }
        System.out.println("Наибольшее = " + max );
        System.out.println("Наименьшее = " + min);
    }
}
