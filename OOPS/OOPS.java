package OOPS;

public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();   //creating a new object p1

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());


    }

}




class pen{
    private String color;
    private int tip;

    // GETTERS
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    //SETTERS
    void setColor (String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
