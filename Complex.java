import java.util.*;
public class Complex {
    private int real, imaginary;

    Complex()
    {
        real = 0;
        imaginary = 0;
    }

    Complex(int a, int b)
    {
        real = a;
        imaginary = b;
    }

    public int get_real()
    {
        return real;
    }

    public void set_real(int a)
    {
        real = a;
    }
    public void set_imaginary(int b)
    {
        imaginary = b;
    }
    public void print()
    {
        if (real == 0 && imaginary == 0) System.out.print(0);
        else if (real == 0)
        {
            if (imaginary < 0) System.out.print(imaginary + "i");
            else System.out.print(imaginary + "i");
        }
        else
        {
            if (imaginary < 0) System.out.print(real+ " - " + (-imaginary) + "i");
            else if (imaginary == 0) System.out.print(real);
            else System.out.print(real + " + " + imaginary + "i");
        }
    }

    public Complex sum(Complex z2)
    {
        Complex z = new Complex((this.real + z2.real), (this.imaginary + z2.imaginary));
        return z;
    }

    public Complex diff(Complex z2)
    {
        Complex z = new Complex((this.real - z2.real), (this.imaginary - z2.imaginary));
        return z;
    }

    public Complex prod(Complex z2)
    {
        int a = this.real * z2.real - this.imaginary * z2.imaginary;
        int b = this.real * z2.imaginary + this.imaginary * z2.real;
        Complex z = new Complex(a, b);
        return z;
    }
}
