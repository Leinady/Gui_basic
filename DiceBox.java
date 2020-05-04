import java.util.ArrayList;
class DiceBox{
    ArrayList<Dice> list;
    DiceBox(){
        list = new ArrayList<Dice>();
    }
    public void addDice(Dice d){
        list.add(d);
    }
    public void shake(){
        Dice d;
        for(int i=0; i < list.size();i++){
           d = list.get(i);
            d = list.roll();

        }
    }
}