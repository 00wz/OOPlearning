public class Cat {
    private String name;
    private int appetite;
    private Boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety=false;
    }
    public void eat(Plate plate) {
        if(plate.tryTake(appetite))
            satiety=true;
    }
    public void info(){
        System.out.println(name+(satiety?" сытый":" голодный"));
    }
}