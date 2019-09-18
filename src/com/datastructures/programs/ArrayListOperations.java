package com.datastructures.programs;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;


public class ArrayListOperations {

    public static void main (String[] args) {


        List<String> names = new ArrayList<> ( Arrays.asList ( "a", "c", "b", "c", "d", "e", "d", "f" ) );
        Set<String> set = new HashSet<> ();
        set.addAll ( names );
        names.clear ();
        names.addAll ( set );
        Map<Character, Integer> characterMap = new HashMap<> ();
        System.out.println ( names );
        Map<Character, Integer> mergeMap = new HashMap<> ();
        String string = "abcaba";
        Character c = 'a';
        long count = string.chars ().filter ( x -> x == c ).count ();
        String s = "varun";
        System.out.println ( arrangeCharactersLexicographically ( s ) );
        Map<Character, Integer> charAsciiMap = new LinkedHashMap<> ();
        s.chars ().boxed ().map ( integer -> (char) integer.intValue () ).forEach ( character -> charAsciiMap.put ( character, (int) character ) );
        System.out.println ( charAsciiMap );
        characterMap = string.chars ().boxed ().collect ( Collectors.toMap ( k -> (char) k.intValue (), v -> 1, Integer::sum ) );
        System.out.println ( characterMap );
        string.chars ().boxed ().map ( x -> (char) x.intValue () ).forEach ( x -> mergeMap.merge ( x, 1, Integer::sum ) );
        System.out.println ( mergeMap );
        Character[] chars = {'a', 'c', 'D', 'E', 'F', '@'};
        Arrays.stream ( chars ).mapToInt ( key -> (int) key ).forEach ( val -> System.out.print ( val + " ," ) );
        int n = 20;
        // computeSquareOfN(n);
    }

    static String arrangeCharactersLexicographically (String input) {
        Instant current = Instant.now ();
        StringBuilder builder = new StringBuilder ();
        input.chars ().sorted ().forEach ( character -> builder.append ( ((char) character) ) );
        Instant finish = Instant.now ();
        System.out.println ( Duration.between ( current, finish ).toNanos () );
        return builder.toString ();
    }


    private static void computeSquareOfN (int n) {
        if (n > 0) {
            computeSquareOfN ( n - 1 );
            System.out.println ( "square of " + n + "is" + ": " + (n * n) );
        }
    }
}
