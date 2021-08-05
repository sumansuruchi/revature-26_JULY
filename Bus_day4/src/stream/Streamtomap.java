package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Streamtomap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Strem> list = new ArrayList<>();
		list.add(new Strem(1,"rice",40.00,2));
		list.add(new Strem(2,"dal",50.00,4));
		list.add(new Strem(3,"curry",60.00,2));
		list.add(new Strem(4,"paneer",240.00,1));
		list.add(new Strem(5,"curd",40.00,4));
		Map<Integer, Strem> employeesMap = list.stream()
                .collect( Collectors.toMap(Strem::getId, 
                        Function.identity()) );

           System.out.println(employeesMap);


	}

}
