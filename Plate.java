public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void setFood(int value){
        food=value;
        if(food<0)
        food=0;
    }
    public int getFood(){
        return food;
    }
    public Boolean tryTake(int value){
        if(value >food)return false;
        food-=value;
        return true;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}