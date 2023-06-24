public class Main {

    //1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
    //подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
    //просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
    //ячейке лежит символ или текст вместо числа), должно быть брошено исключение
    //MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //3 В методе main() вызвать полученный метод, обработать возможные исключения
    //MyArraySizeException и MyArrayDataException и вывести результат расчета.

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] characters = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

            System.out.println(sumValuesFromArray4x4(characters));

    }

    private static int sumValuesFromArray4x4 (String[][] characters) throws MyArraySizeException, MyArrayDataException {
        if (characters.length > 4) {
            throw new MyArraySizeException("В масиве больше 4 рядов");
        }
        for (int i = 0; i < 4; i++) {
            if (characters[i].length < 4) {
                throw new MyArraySizeException( i + " ряд масива меньше 4");
            } if (characters[i].length > 4) {
                throw new MyArraySizeException( i + " ряд масива ,больше 4");
            }
        }

        int sumValues = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (characters[i][j].matches("[^0-9]")) {
                    throw new MyArrayDataException(
                            "Допускаються только цифры в ячейке [" + i + "], [" + j + "] стороние символы");
                }
                sumValues = sumValues + Integer.valueOf(characters[i][j]);
            }
        }
        return sumValues;
    }

    private static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    private static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }
}
