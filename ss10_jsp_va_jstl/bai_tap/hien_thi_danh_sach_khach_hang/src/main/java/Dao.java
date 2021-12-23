import java.util.ArrayList;
import java.util.List;

public class Dao {
    public List<Customer> getAll(){
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Le Van Tien", "tien@gmail.com", "100 Nguyen Van Linh", "0903026942"));
        customerList.add(new Customer(2, "Le Van Teo", "teo@gmail.com", "101 Nguyen Van Linh", "0903024952"));
        customerList.add(  new Customer(3, "Le Van Ti", "ti@gmail.com", "102 Nguyen Van Linh", "0903024442"));
        customerList.add( new Customer(4, "Le Van Tin", "tin@gmail.com", "103 Nguyen Van Linh", "0903824942"));
        return  customerList;

    }

}
