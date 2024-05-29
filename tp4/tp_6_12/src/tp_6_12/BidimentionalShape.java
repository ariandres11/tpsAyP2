package tp_6_12;

public abstract class BidimentionalShape extends Shape
{
    
    public BidimentionalShape()
    {}
    
    public BidimentionalShape(double len)
    {
        super(len);
    }
    
    public BidimentionalShape(double len, double wid)
    {
        super(len, wid);
    }
    
    public abstract double getArea();
}
