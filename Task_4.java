// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class Task_4 {
    public static void main(String[] args) {
        int n = 8;
        String pos1 = "Стержень 1";
        String pos2 = "Стержень 2";
        String pos3 = "Стержень 3";

        hanoy(n, pos1, pos2, pos3);
    }
        
    public static void move (String pos1, String pos2) {
            System.out.print (pos1 + " => " + pos2 + "\n"); 
}

    public static void hanoy(int n,String pos1,String pos2,String pos3) {
   if(n == 1) {
       move(pos1,pos3);  
   } else {
       hanoy(n-1,pos1,pos3,pos2);
       move(pos1,pos3);
       hanoy(n-1,pos2,pos1,pos3);
   }
}    
}
