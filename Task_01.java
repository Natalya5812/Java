/**
 * Task_01
 */
/*1.	+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000*/


public class Task_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        if (a==0 & b==0)  System.out.println("не определено");
        else 
        System.out.println(powIter(a, b));
}



public static double powIter(double a, int b) {
    if (a == 0 || a == 1) return a;
    //if (a !=0 & b == 0) return 1;

    if (b < 0) {
        b = -b;
        a = 1 / a;
    }

    double res = 1;
    while (b > 0) {
        if (b % 2 == 1)
            res = res * a;
        a = a * a;
        b = b / 2;
    }

    return res;
}
}

// public static double powRecursion(int a, int b){
//     if(b == 0) return 1;

//     if(b < 0) {
//         powRecursion(1/a, -b);
//     }
//     double res = powRecursion(a, b/2);

//     return b % 2 == 0 ? res * res : res * res * a;
// }