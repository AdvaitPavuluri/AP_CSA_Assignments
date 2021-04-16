public class Fraction
{
  
  private int numerator;
  private int denominator;
  private static int counter = 0;

  public Fraction() {
    numerator = 1;
    denominator = 1;
    counter++;
  }
  
  public Fraction(int n, int d) {
    if (n > 0) {
      numerator = n;
    } else {
      numerator = 1;
    }
    if (d > 0) {
      denominator = d;
    } else {
      denominator = 1;
    }
    counter++;
  }
  
  public int getNumerator() {
    return numerator;
  }
  
  public int getDenominator() {
    return denominator;
  }
  
  public static int getNumFractions() {
    return counter;
  }
  
  public String toString() {
    return (numerator + "/" + denominator);
  }
  
  public String mixedNumber() {
    if (numerator == 0) {
      return "0";
    }
    if (numerator < denominator) {
      return this.toString();
    }
    int firstPart = numerator/denominator;
    int top = numerator%denominator;
    return (firstPart + " " + top + "/" + denominator);
  }
  
  public void setNumerator(int n) {
    if (n > 0) {
      numerator = n;
    }
  }
  
  public void setDenominator(int d) {
    if (d > 0) {
      denominator = d;
    }
  }
  
  public void add(int n, int d) {
    if (n > 0 && d > 0) {
      this.setNumerator(numerator * d + n * denominator);
      this.setDenominator(denominator * d);
    }
  }
  
  public void add(Fraction other) {
    this.add(other.getNumerator(), other.getDenominator());
  }
  
  public void multiply(int n, int d) {
    if (n > 0 && d > 0) {
      this.setNumerator(numerator * n);
      this.setDenominator(denominator * d);
    }
  }
  
  public void multiply(Fraction other) {
    this.multiply(other.getNumerator(), other.getDenominator());
  }
  
  
  
  
}
