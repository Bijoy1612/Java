
package lab09.pkg13.pkg03.pkg2019.problemB;

import java.util.Scanner;
import java.util.ArrayList;



public class ArrayList {
    Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> numbers2d = new ArrayList<ArrayList<Integer>>();
        System.out.print("Input number of rows: ");
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            numbers2d.add(new ArrayList<>());
            System.out.print("Numbers of integer in row :");
            int d = input.nextInt();
            for(int j=0; j<d; j++){
                int x = input.nextInt();
                numbers2d.get(i).add(x);
            }
        }
        System.out.print("Input number of queries: ");
        int d = input.nextInt();
        for(int i=0; i<d;i++){
            int x = input.nextInt();
            int y = input.nextInt();
            if(numbers2d.size()>=x){
                if(numbers2d.get(x-1).size()>=y)
                    System.out.println(numbers2d.get(x-1).get(y-1));
                else
                    System.out.println("Error!");
            }
            else
                System.out.println("Error!");
        }
    }
}
