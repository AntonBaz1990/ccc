// package JAVA.Lekciya;

// /**
//  * program
//  */
// public class program {
//     public static void main(String[] args) {

//         String s ="qwerty";

//         var a = 123;
//         System.out.println(s.length());
//         System.out.println(++a);
//         System.out.println(s.charAt(3));

//         System.out.println(Integer.MAX_VALUE );
//         s.length();

//         int [] att = new int[10];
//         att[3] = 45;
//         System.out.println(att[3]);

//         int []  [] arr  =new int [3] [5];
//         for (int[] line : arr) {
//             for (int item : line){
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }

//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }

// }

 
// import java.util.Scanner;
// public class Program { 
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
// }
// }

// import java.util.Scanner;
// public class Program {
// 	public static void main(String[] args) {

// 		Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         String name = iScanner.nextLine();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//          System.out.printf("%d + %f = %f" , x , y, x + y);

//         iScanner.close();
// 	}
// }


// import java.util.Scanner;
// public class Program {
// 	public static void main(String[] args) {

// 		Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         String name = iScanner.nextLine();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//          System.out.printf("%d + %f = %f" , x , y, x + y);

//         iScanner.close();
// 	}
// }


// public class Program {
// 	public static void main(String[] args) {

// 		String s  = "qwe";
//         int a = 123;
//         String q = s+a;
//         System.out.println(q);


//     .    
// 	}
// }



// Неявная типизация!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// public class Program {
// public static void main(String[] args) {
// var a = 123;
// System.out.println(a); // 123
// var d = 123.456;
// System.out.println(d); // 123.456
// System.out.println(getType(a)); // Integer
// System.out.println(getType(d)); // Double
// d = 1022;
// System.out.println(d); // 1022
// //d = "mistake";
// //error: incompatible types:
// //String cannot be converted to double
// }
// static String getType(Object o){
// return o.getClass().getSimpleName();
// }
// }

// Основы: классы-обертки!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// Основы: классы-обертки
// Примитив              Обертка
// int                    Integer
// short                  Short
// long                  Long
// byte                  Byte
// float                 Float
// double                Double
// char                  Character
// boolean               Boolean

// !!!!!!!Массивы Oдномерные
// public class Program {
// public static void main(String[] args) {
// int[] arr = new int[10];
// System.out.println(arr.length); // 10
// arr = new int[] { 1, 2, 3, 4, 5 };
// System.out.println(arr.length); // 5
// }
// }


// Массивы
// Многомерные
// public class Program {
// public static void main(String[] args) {
// int[] arr[] = new int[3][5];
// for (int[] line : arr) {
// for (int item : line) {
// System.out.printf("%d ", item);
// }
// System.out.println();
// }
// }
// }

// Массивы
// Многомерные
// public class Program {
// public static void main(String[] args) {
// int[][] arr = new int[3][5];
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// System.out.printf("%d ", arr[i][j]);
// }
// System.out.println();
// }
// }



// Получение данных из терминала
// Строки

// import java.util.Scanner;
// public class Program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("name: ");
// String name = iScanner.nextLine();
// System.out.printf("Привет, %s!", name);
// iScanner.close();
// }
// }



// Получение данных из терминала
// Некоторые примитивы

// import java.util.Scanner;
// public class Program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// int x = iScanner.nextInt();
// System.out.printf("double a: ");
// double y = iScanner.nextDouble();
// System.out.printf("%d + %f = %f", x, y, x + y);
// iScanner.close();
// }}

// Получение данных из терминала
// Проверка на соответствие получаемого типа
// import java.util.Scanner;


// public class Program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// boolean flag = iScanner.hasNextInt();
// System.out.println(flag);
// int i = iScanner.nextInt();
// System.out.println(i);
// iScanner.close();
// } }

// Форматированный вывод
// public class Program {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = String.format("%d + %d = %d \n", a, b, c);
// System.out.printf("%d + %d = %d \n", a, b, c);
// System.out.println(res);
// }
// }

// Виды спецификаторов!!!!!!!!!!!!!!!!!
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме,
// например, 3.1415e+01
// %c: для вывода одиночного символа
// %s: для вывода строковых значений


// Виды спецификаторов!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// public class Program {
// public static void main(String[] args) {
// float pi = 3.1415f;
// System.out.printf("%f\n", pi); // 3,141500
// System.out.printf("%.2f\n", pi); // 3,14
// System.out.printf("%.3f\n", pi); // 3,141
// System.out.printf("%e\n", pi); // 3,141500e+00
// System.out.printf("%.2e\n", pi); // 3,14e+00
// System.out.printf("%.3e\n", pi); // 3,141e+00
// }
// }


// Оператор выбора!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// import java.util.Scanner;
// public class Program {
// public static void main(String[] args) {
// int mounth = value;
// String text = "";
// switch (mounth) {
// case 1:
// text = "Autumn";
// break;
// ...
// default:
// text = "mistake";
// break;
// }
// System.out.println(text);
// iScanner.close();
// }
// }



// Вложенные циклы!!!!!!!!!!!!!!!!!!!!!!!!!!!
// public class Program {
// public static void main(String[] args) {
// for (int i = 0; i < 5; i++) {
// for (int j = 0; j < 5; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// }
// }


// for :  Работает только для коллекций!!!!!!!!!!!

// public class Program {
// public static void main(String[] args) {
// int arr[] = new int[10];
// for (int item : arr) {
// System.out.printf("%d ", item);
// }
// System.out.println();
// }
// }



// Работа с файлами!!!!!!!!!!!!!!!!!!!!!!!!
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
// public static void main(String[] args) {
// try (FileWriter fw = new FileWriter("file.txt", false)) {
// fw.write("line 1");
// fw.append('\n');
// fw.append('2');
// fw.append('\n');
// fw.write("line 3");
// fw.flush();
// } catch (IOException ex) {
// System.out.println(ex.getMessage());
// }
// } }


// Работа с файлами
// Чтение, Вариант посимвольно
// import java.io.*;
// public class Program {
// public static void main(String[] args) throws Exception {
// FileReader fr = new FileReader("file.txt");
// int c;
// while ((c = fr.read()) != -1) {
// char ch = (char) c;
// if (ch == '\n') {
// System.out.print(ch);
// } else {
// System.out.print(ch);
// }
// }
// } }


// Работа с файлами
// Вариант построчно
// import java.io.*;
// public class Program {
// public static void main(String[] args) throws Exception {
// BufferedReader br = new BufferedReader(new FileReader("file.txt"));
// String str;
// while ((str = br.readLine()) != null) {
// System.out.printf("== %s ==\n", str);
// }
// br.close();
// }
// }

