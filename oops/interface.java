public class interface{

    public static void main(String[] args){

    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println(" queen can move up down left right diagnl (in all dirn)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("moves");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,  down ,left,right");
    }
}


interface herbivore{
 void eatPlants();
}

interface carnivores{
    void eatMeat();
}


class Bear implements herbivore, carnivores{
    public void eatPlants(){
        System.out.println("Bear eat grass");
    }


    public void eatMeat(){
        System.out.println("Bear eats meat");
    }
}