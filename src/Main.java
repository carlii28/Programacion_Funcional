import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<LecturaSensor> lecturas = new ArrayList<>();

        lecturas.add(new LecturaSensor(1, 22.5, "temperatura", LocalDateTime.now().minusHours(2)));
        lecturas.add(new LecturaSensor(2, 25, "temperatura", LocalDateTime.now().minusHours(10)));
        
        System.out.println("Lecturas de tipo temperatura:");

        lecturas.stream()
                .filter(l -> l.getTipo().equals("temperatura"))
                .forEach(System.out::println);

        double promedio = lecturas.stream()
                .filter(l -> l.getTimestamp().isAfter(LocalDateTime.now().minusHours(24)))
                .mapToDouble(LecturaSensor::getValor)
                .average()
                .orElse(0.0);

        System.out.println("Promedio de las últimas 24 horas =  " + promedio);

        Optional<LecturaSensor> max = lecturas.stream()
                .max(Comparator.comparingDouble(LecturaSensor::getValor));

        if (max.isPresent()) {
            System.out.println("Lectura con valor máximo = ");
            System.out.println(max.get());
        }
    }
}
