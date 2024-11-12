public class Wall {
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {
        //set both fields to 0 if parameters are less than 0
        if(width < 0) width = 0;
        if(height < 0) height = 0;
        //sets the data
        this.width = width;
        this.height = height;
    }

    //getters and setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        //set width to 0 if parameter is less than 0
        if(width < 0) width = 0;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        //set height to 0 if parameter is less than 0
        if(height < 0) height = 0;
        this.height = height;
    }

    //calculate and return the area of the wall
    public double getArea() {
        return width * height;
    }
}
