package org.asif;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
If using collection framework and change or modify the collections we need loops.
but using stream api we can easily do that the same things without loops.
 */

public class JavaStreamApi {
    private List<String> names = Arrays.asList("A", "B", "C", "D", "E", "F");
    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 4, 3);

    public void printNames() {
        names = names.stream()
                .filter(name -> !name.isEmpty())//Intermediate operation
                .collect(Collectors.toList());// Terminal operation
        System.out.println(names);
    }

    public void distinctMethod(){
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
    }
}
