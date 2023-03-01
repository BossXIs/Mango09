public class Heart {
    Turtle t ;
    private String color;
    private double x;
    private double y;
    private double w;
    private double s;

    public Heart(String color,double x,double y,double w,double s){
        this.t = new Turtle(x, y);
        this.t.penColor(color);
        this.t.width(w);
        this.t.speed(s);
    }
    
    void drawHeart(){
        
        this.t.left(140);
        this.t.forward(113);
        for(int i=0;i<200;i++){
            this.t.right(1);
            this.t.forward(1);
        }
        this.t.left(120);

        for(int i=0;i<200;i++){
            this.t.right(1);
            this.t.forward(1);
        }

        this.t.forward(113);
    }


    
}
