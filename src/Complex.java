
/**
 * A complex number with a real and imaginary part
 * 
 * @author Phill Conrad
 * @author Insert your name here
 * @author If working in pair, insert 2nd pair here, otherwise delete this line
 * @version 2014/01/12 for lab02, cs56, W14
 */
public class Complex
{
   private double real;
   private double imag;

    /**
     * noarg Constructor for objects of class Complex
     */
    
    public Complex() {
	real = 0;
	imag = 0;
    }
  
     /**
     * Two-arg Constructor for objects of class Complex
     * @param realPart real part
     * @param imagPart imaginary part
     */
  
     public Complex(double realPart, double imagPart) {
	this.real = realPart;
	this.imag = imagPart;
     }
    
    /**
     * set the real part
     * 
     * @param  r   the new real part
     */
    
    public void setReal(double r) {
	real = r;
    }
  
    
    /**
     * set the imaginary part
     * 
     * @param  i   the new imaginary part
     */

    public void setImag(double i) {
	imag = i;
    }

    
    /**
     * get the real part
     * 
     * @return real part
     */
     
    public double getReal() {
	return real;
    }

    /**
     * get the imaginary part
     * 
     * @return imaginary part
     */
    
    public double getImag() {
	return imag;
    }
    

    
    /** format Complex number as String, in an expression like:
     *  2.0 + 3.0i, 2.5 + 0.0i, 0.0 + 0.0i, or -3.33 + -1.5i
     *  
     *  @return formatted complex number (e.g. 2.0 + 3.0i)
     */

    public String toString() {
	String s = String.format("%.1f + %.1fi", this.real, this.imag);
	return s;
    }
}
