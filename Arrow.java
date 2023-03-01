public class Arrow {
    Turtle nick ;
    Turtle pond ;
    private String color;
    private double x;
    private double y;
    private double w;
    private double s;
    public Arrow(String color,double x,double y,double w,double s){
        this.nick = new Turtle(x,y);
        this.pond = new Turtle(x,y);
        this.nick.penColor(color);
        this.nick.width(w);
        this.pond.setPosition(x, y);
        this.pond.penColor(color);
        this.pond.width(w);
        this.nick.speed(s);
        this.pond.speed(s);
    }

    void drawArrow(){
        this.pond.right(45);
        this.pond.forward(110);
        this.nick.right(45);
        this.nick.forward(110);
        this.nick.penColor("white");
        this.nick.right(90);
        this.nick.forward(25);
        this.nick.left(135);
        this.nick.forward(36);
        this.nick.left(90);
        this.nick.forward(36);
        this.nick.left(135);
        this.nick.forward(25);
        this.pond.left(90);
        this.pond.forward(5);
        this.pond.left(90);
        this.pond.forward(110);
        this.pond.penColor("pink");
        this.pond.forward(122);
        this.pond.penColor("brown");
        this.pond.forward(25);
        this.pond.left(90);
        this.pond.forward(5);
        this.pond.left(90);
        this.pond.forward(27);
        this.pond.backward(27);
        this.pond.penColor("white");
        this.pond.left(45);
        this.pond.backward(15);
        this.pond.right(45);
        this.pond.backward(30);
        this.pond.left(45);
        this.pond.forward(18);
        this.pond.left(90);
        this.pond.forward(18);
        this.pond.right(135);
        this.pond.forward(30);
        this.pond.right(45);
        this.pond.forward(18);
        this.pond.left(45);
        this.pond.backward(28);

    }
}
