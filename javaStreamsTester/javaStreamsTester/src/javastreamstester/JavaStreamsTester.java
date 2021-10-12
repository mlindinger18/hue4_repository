/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreamstester;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author Marcel.Lindinger
 */
public class JavaStreamsTester {

    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static int getCountEmptyString(List<String> strings) {
        long n;
        n = strings.stream()
                .filter(string -> string.isEmpty()).count();
        return (int) n;
    }

    private static int getCountLength3(List<String> strings) {
        long n;
        n = strings.stream()
                .filter((string -> string.length().count()));
    }

    private static List<String> deleteEmptyStrings(List<String> strings) {
        return null;
    }

    private static String getMergedString(List<String> strings, String seperator) {
        return null;
    }

    private static List<Integer> getSquares(List<String> strings) {
        return null;
    }

    private static int getMax(List<Integer> numbers) {
        return 0;
    }

    private static int getMin(List<Integer> numbers) {
        return 0;
    }

    private static int getSum(List<Integer> numbers) {
        return 0;
    }

    private static int getAverage(List<Integer> numbers) {
        return 0;
    }
}
