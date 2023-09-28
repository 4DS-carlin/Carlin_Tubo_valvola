public class Tubo {
    //attributi
    private int altezza;
    private int raggio;
    final float pi = (float) 3.1415;


    //metodi
    public Tubo(int r, int h) throws Exception{
        if(r <= 0 || h <= 0){
            throw new Exception("Input errati!");
        }
        altezza = h;
        raggio = r;
    }

    public double volume(){
        return 3.14*(raggio*raggio)*altezza;
    }


    public double superficie(){
        return 2*(3.1415)*raggio*altezza;
    }

    public String toString() {
        return "Tubo{" +
                "altezza=" + altezza +
                ", raggio=" + raggio +
                '}';
    }
}

