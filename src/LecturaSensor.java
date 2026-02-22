import java.time.LocalDateTime;

public class LecturaSensor {

    private int id;
    private double valor;
    private String tipo;
    private LocalDateTime timestamp;

    public LecturaSensor(int id, double valor, String tipo, LocalDateTime timestamp) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return  "id =" + id + ", valor =" + valor + ", tipo ='" + tipo + ", timestamp =" + timestamp;
    }
}

