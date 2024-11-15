public class ComplexNumber {
    private double real;
    private double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        double sumReal = this.real + real;
        double sumImaginary = this.imaginary + imaginary;
        this.real = sumReal;
        this.imaginary = sumImaginary;
        System.out.println("real = " + this.real + ", imaginary = " + this.imaginary);
    }

    public void add(ComplexNumber number) {
        this.real += number.getReal();
        this.imaginary += number.getImaginary();
        System.out.println("real = " + this.real + ", imaginary = " + this.imaginary);
    }

    public void subtract(double real, double imaginary) {
        double subReal = this.real - real;
        double subImaginary = this.imaginary - imaginary;
        this.real = subReal;
        this.imaginary = subImaginary;
        System.out.println("real = " + this.real + ", imaginary = " + this.imaginary);
    }

    public void subtract(ComplexNumber number) {
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
        System.out.println("real = " + this.real + ", imaginary = " + this.imaginary);
    }
}
