package ro.mpp2024;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors = ImmutableList.of("Pink", "Green", "Blue");
        colors.forEach(System.out::println);
    }
}