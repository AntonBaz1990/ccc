// Object
// Тип данных
// public class Ex01_object {
// public static void main(String[] args) {
// Object o = 1; GetType(o); // java.lang.Integer
// o = 1.2; GetType(o); // java.lang.Double
// }
// static void GetType(Object obj) {
// System.out.println(obj.getClass().getName());
// }
// }

// Object
// public class Ex01_object {
// public static void main(String[] args) {
// System.out.println(Sum(1, 2));
// System.out.println(Sum(1.0, 2));
// System.out.println(Sum(1, 2.0));
// System.out.println(Sum(1.2, 2.1));
// }
// static Object Sum(Object a, Object b) {
// if (a instanceof Double && b instanceof Double) {
// return (Object)((Double) a + (Double) b);
// } else if(a instanceof Integer && b instanceof Integer) {
// return (Object)((Integer) a + (Integer) b);
// } else return 0;
// }
// }


// Массивы
// Проблема. Как увеличить размер массива?
// Есть массив из 2 элементов
// Например
// public class Ex01_object {
// public static void main(String[] args) {
// int[] a = new int[] { 1, 9 };
// int[] b = new int[3];
// System.arraycopy(a, 0, b, 0, a.length);
// for (int i : a) { System.out.printf("%d ", i);} // 1 9
// for (int j : b) { System.out.printf("%d ", j);}
// // 0 9 0 0 0 0 0 0 0 0
// } }

// Массивы
// public class Ex01_object {
// static int[] AddItem(int[] array, int item) {
// int length = array.length;
// int[] temp = new int[length + 1];
// System.arraycopy(array, 0, temp, 0, length);
// temp[length] = item;
// return temp;
// }
// public static void main(String[] args) {
// int[] a = new int[] { 0, 9 };
// for (int i : a) { System.out.printf("%d ", i); }
// a = AddItem(a, 2);
// a = AddItem(a, 3);
// for (int j : a) { System.out.printf("%d ", j); }
// }
// }

// Коллекции. Функционал
// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
// get(pos) – возвращает элемент из списка по указанной позиции
// indexOf(item) – первое вхождение или -1
// lastIndexOf(item) – последнее вхождение или -1
// remove(pos) – удаление элемента на указанной позиции и его возвращение
// set(int pos, T item) – gjvtoftn значение item элементу, который находится
// на позиции pos
// void sort(Comparator) – сортирует набор данных по правилу
// subList(int start, int end) – получение набора данных от позиции start до end
 

// import java.util.Arrays;
// import java.util.List;
// public class Ex005_ArraysMethod {
// public static void main(String[] args) {
// StringBuilder day = new StringBuilder("28");
// StringBuilder month = new StringBuilder("9");
// StringBuilder year = new StringBuilder("1990");
// StringBuilder[] date = { day, month, year };
// List<StringBuilder> d = Arrays.asList(date);
// System.out.println(d); // [29, 9, 1990]
// date[1] = new StringBuilder("09");
// System.out.println(d); // [29, 09, 1990]
// }
// }


// Коллекции. Функционал
// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список

