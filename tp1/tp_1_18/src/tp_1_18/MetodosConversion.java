package tp_1_18;

public class MetodosConversion {

    public static float fahrToCent(float gradosF) {
        float gradosC = (float) (5.0 / 9.0 * (gradosF - 32));

        return gradosC;
    }

    public static float centToFahr(float gradosC) {
        float gradosF = (float) (9.0 / 5.0 * gradosC + 32);

        return gradosF;

    }

}
 
  

