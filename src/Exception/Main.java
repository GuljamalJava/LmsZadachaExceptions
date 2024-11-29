package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//todo    Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
//        Фигуралардын параметрлерин (длина, ширина, высота, радиус)берип жатканда туура эмес маалымат
//        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//
//                todo          Мумкун болгон каталар:
//   todo 1)берилген маалымат терс сан болсо
//        2)берилген маалымат сан эмес тамга болсо
//        3)жана озунуздор берген кошумча каталар болсо да болот
//
//  todo      Параллелепипед:
//                          -Фигуранын аянтын эсептеген формула:
//             2 * ((height * length) + (length * width) + (height * width));
//
//   todo                  -Фигуранын коломун эсептеген формула:
//                  (length * width * height);
//                          -Формулалар Parallelepiped классында жазылуусу керек
//
//   todo                           Цилиндр:
//                   -Фигуранын аянтын эсептеген формула:
//        2 * PI * radius * (height + radius);
//
//       todo       -Фигуранын коломун эсептеген формула:
//        (PI * radius * radius * height);
//
//  todo- Формулалар Cylinder классында жазылуусу керек
//  todo
//        Бардык Exception дор логикасы main класста жазылcын
//        Бардык маалмыттар консоль аркылуу берилсин    //  Scanner
//        Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп
//        бериши керек.          switch menen tandoo

        Parallelepiped parallelepiped = new Parallelepiped();
        Cylinder cylinder= new Cylinder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: ");
        int command = scanner.nextInt();
        switch (command) {
            case 1 -> {
                try {
                    System.out.println("Write height of Parallelepiped: ");
                    double height = scanner.nextDouble();

                    System.out.println("Write length of Parallelepiped: ");
                    double length = scanner.nextDouble();

                    System.out.println("Write width of Parallelepiped:");
                    double width = scanner.nextDouble();

                    System.out.println("Parallelepiped ayanty: ");
                    System.out.println(parallelepiped.getSquarP(height,length,width));

                    System.out.println("Parallelepiped kolomu:");
                    System.out.println(parallelepiped.getVolumeP(length,width,height));

                    if (height < 0 && length < 0 && width < 0) {

                        throw new IllegalArgumentException ("Berilgen san ters san!");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Ters san beruugo bolboit!");
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Tuura emes maalumat berildi!");
                }
            }
            case 2 -> {
             try {
                 System.out.println("Write height of Cylinder: ");
                 double height = scanner.nextDouble();

                 System.out.println("Write radius: ");
                 double radius = scanner.nextDouble();

                 System.out.println("Cylinder ayanty: ");
                 System.out.println(cylinder.getSquareCylender(radius,height));

                 System.out.println("Cylinder kolomu: ");
                 System.out.println(cylinder.getVolumeCylender(radius,height));

             } catch (IllegalArgumentException e) {
                 System.out.println(e.getMessage());
                 System.out.println("Ters san beruugo bolboit!");
             } catch (InputMismatchException e){
                 System.out.println(e.getMessage());
                 System.out.println("Tuura emes maalymat berildy!");
             }

            }

        }

    }
}