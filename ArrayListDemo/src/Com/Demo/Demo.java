package Com.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,6,5,7,88,999,34,56);
		List<Integer> newList=list.stream().map(i->i*i).collect(Collectors.toList());
		for(Integer i:newList) {
			
			System.out.print(i+"  "); 
		}

	}

}
