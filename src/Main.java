import java.util.Scanner; // Импортируем библиотеку Сканер
public class Main  // Обьявляем основной класс
{
    public static void main(String[] args) // Обьявляем основной метод класса
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите A:");//Прошу ввести первое число
        int a = in.nextInt(); //Передаем значение из систему переменной а
        System.out.println("Введите B:");//Просим ввести второе число
        int b = in.nextInt(); //Передаем значение из системы переменной b
        in.close(); // Закрываем ввод данных

        while (b != 0)
        {
            int gcd = a % b;
            a = b;
            b = gcd;
        }
        System.out.println("Наибольший общий делитель равен: " + a);
    }
}
