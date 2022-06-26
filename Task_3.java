// 3.	+Написать программу вычисления n-ого треугольного числа

public class Task_3 {
    public static void main(String[] args) {
        int n = (int) ( Math.random() * 11 );
        
        System.out.println("При n = " + n + " => Tn = " + Triangular_number (n));
        
    }
    
    public static int Triangular_number(int n) {
        if (n == 1){
            return n;
        }
        else{
        return Triangular_number(n-1)  + n;}       
    }
}
