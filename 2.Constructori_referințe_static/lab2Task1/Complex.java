package lab2Task1;

public class Complex
{
    private int real;
    private int imaginary;

    public Complex()
    {
        this(0,0);
    }

    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex c)
    {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public void setReal(int real)
    {
        this.real = real;
    }

    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }

    public int getReal()
    {
        return real;
    }

    public int getImaginary()
    {
        return imaginary;
    }

    public void addWithComplex(Complex c)
    {
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }

    public void showNumber()
    {
        if(this.imaginary > 0)
            System.out.println("Numarul este: " + real +"+" + "i*" + imaginary);
        else if (this.imaginary < 0)
            System.out.println("Numarul este: " + real +"-" + "i*" + imaginary);
        else System.out.println("Numarul este: "+ real);


    }

}
