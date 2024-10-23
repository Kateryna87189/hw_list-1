import java.util.ArrayList;
import java.util.List;

/*
# 1
Допустим, у вас есть List целых чисел. Напишите метод, который формирует List,
в котором будут цифры из первого листа, которые больше некоторого заданного значения
Например: дано 10,44, 7, 6,12, 89 значение 33 результат: 44, 89

 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 44, 7, 6, 12, 89);
        int limit = 33;


        List<Integer> result = filterGreaterThan(numbers, limit);
        System.out.println(result);
    }
    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold){
        {
            List<Integer> result = new ArrayList<>();
            for (int number : numbers) {
                if (number > threshold) {
                    result.add(number);
                }
            }
            return result;
        }
    }
}