class Dice{
    private int face;
    Dice(){
        this.face = 1;
    }
    public void roll(){
        this.face = 1+(int)(Math.random()*10);
    }
    public int getface(){
        return this.face;
    }
    @Override
    public String toString(){
        return "F = "+ this.face;
    }
}