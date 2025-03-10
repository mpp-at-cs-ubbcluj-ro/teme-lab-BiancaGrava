import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainBD {
    public static void main(String[] args) {

        Properties props=new Properties();
        try {
            props.load(new FileReader("bd.config"));
        } catch (IOException e) {
            System.out.println("Cannot find bd.config "+e);
        }

        CarRepository carRepo=new CarsDBRepository(props);
        carRepo.add(new Car("Mercedes","CLS", 2023));
        carRepo.update(1,new Car("Opel","Astra", 2011));
        System.out.println("Toate masinile din baza de date: ");
        for(Car car:carRepo.findAll())
            System.out.println(car);
        Integer min=2000;
        Integer max=2025;
        System.out.println("Masinile produse intre anii "+min+" si "+max);
        for(Car car:carRepo.findBetweenYears(min,max))
            System.out.println(car);

    }
}
