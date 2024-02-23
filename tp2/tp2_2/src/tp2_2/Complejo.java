
package tp2_2;

public class Complejo {
    float pReal;
    float pImag;
    
    public Complejo(){
    }

    public Complejo(float pReal, float pImag) {
        this.pReal = pReal;
        this.pImag = pImag;
    }

    public float getpReal() {
        return pReal;
    }

    public void setpReal(float pReal) {
        this.pReal = pReal;
    }

    public float getpImag() {
        return pImag;
    }

    public void setpImag(float pImag) {
        this.pImag = pImag;
    }
    @Override
    public String toString(){
        return this.pReal + " + " + this.pImag + "i";
    }
}
