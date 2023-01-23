
package lab09.pkg13.pkg03.pkg2019;


public class Player {
    private String name;
    private int score;
    
    Player(){
        
    }
    Player(String name, int score){
        this.name=name;
        this.score=score;
    }
    public String toString(){
        return this.name+" "+this.score;
    }
    
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    
}
