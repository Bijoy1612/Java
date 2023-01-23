
package lab09.pkg13.pkg03.pkg2019;

import java.util.Comparator;


public class Checker implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        if(p1.getScore()==p2.getScore())
            return p1.getName().compareTo(p2.getName());
        else
            return p2.getScore()-p1.getScore();
    }
    
}
