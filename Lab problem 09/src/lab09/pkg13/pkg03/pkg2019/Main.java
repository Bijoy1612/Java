
package lab09.pkg13.pkg03.pkg2019;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input number:");
        int n = input.nextInt();
        System.out.println("Enter name and score:");
        Player[] players = new Player[n];
        for(int i=0; i<n; i++){
            String name = input.next();
            int score = input.nextInt();
            players[i] = new Player(name,score);
        }
        System.out.println("After sort");
        Arrays.sort(players,new Checker());
        for(int i=0; i<n; i++)
            System.out.println(players[i].toString());
    }
}
