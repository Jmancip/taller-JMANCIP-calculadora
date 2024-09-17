package logica;
public class Operaciones {

    // atributos
    int numeroUno;
    int numeroDos;

        //Constructor con dos atributos
    public Operaciones(int numeroUno, int numeroDos){
        this.numeroUno = numeroUno;    //this hace referencia al objeto que se esta utilizando
        this.numeroDos = numeroDos;
    }

    // Metodos
    public int suma(){
        return numeroUno + numeroDos;
    }
    public int resta(){
        return numeroUno - numeroDos;
    }

    public int multiplicacion(){
        return numeroUno * numeroDos;
    }

    public double division(){
        return (double) this.numeroUno / (double) this.numeroDos;

    }

}
