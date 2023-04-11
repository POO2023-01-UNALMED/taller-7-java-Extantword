package comunicacion;

public class Alfabeto extends Pictograma {

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String interpretacion, String[] letras, String origen) {
    	super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < cantidadLetras() - 1; i++) {
            str.append(letras[i]).append(", ");
        }

        str.append(letras[letras.length - 1]);

        return str.toString();
    }
}
