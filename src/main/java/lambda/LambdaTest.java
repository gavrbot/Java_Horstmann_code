package lambda;

import java.util.Arrays;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Mars", "Earth", "Pluto"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets,
                (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
    }
}
