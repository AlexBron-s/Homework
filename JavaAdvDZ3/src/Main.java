import java.util.*;
import java.util.stream.Collectors;

//1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
//вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//Посчитать, сколько раз встречается каждое слово.
public class Main {

    public static void main(String[] args) {

        String[] strings = new String[] {
                "Реликвия", "Кофе", "Оборона", "Капкан", "Шутник",
                "Синтетика", "Кавказцы", "Зарумянить", "Стервозный", "Ротозейничать",
                "Вкупе", "Наворовать", "Шутник", "Чудесить", "Кенаф",
                "Реликвия", "Ротозейничать", "Единородный", "Вкупе", "Реликвия"
        };

        Map<String, Integer> hmap = new HashMap<String, Integer>();

        for ( String string : strings ) {
            Integer integer = hmap.get(string);
            if ( integer == null ) {
                integer = 0;
            }
            hmap.put(string, integer + 1);
        }

        System.out.println(hmap);

//        var shmap = Arrays.stream(strings)
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        System.out.println(shmap);
    }
}
