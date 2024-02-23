package tp2_fecha;

public class Fecha {

    int año;
    int mes;
    int dia;

    public Fecha(){
    }

    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    @Override
    public String toString(){
        return this.dia + "/" + this.mes +"/" + this.año;
    }
}
