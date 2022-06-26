// 2.	+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раза, а умножается на c
// - команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1. 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд
/**
 * Task_2
 */
public class Task_2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int c = 2; // K1 mult
        int d = 1; // K2 sum

        recursiveSolve (a, b, c, d, "");
    }

    public static void recursiveSolve (int a, int b, int c, int d, String result)
    {
        if (a > b) return;
        if (a == b){
            System.out.println(result);
            return;
        }
        
        recursiveSolve(a * c, b, c, d, result + "K1 ");
        recursiveSolve(a + d, b, c, d, result + "K2 ");
    }
}
