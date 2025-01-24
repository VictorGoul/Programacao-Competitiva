//link: https://judge.beecrowd.com/en/problems/view/2344

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String Nota = "";
        if(N == 0)
            Nota = "E";
        else if(N <= 35)
            Nota = "D";
        else if(N <= 60)
            Nota = "C";
        else if(N <= 85)
            Nota = "B";
        else if(N <= 100)
            Nota = "A";
        System.out.println(Nota);
    }
}