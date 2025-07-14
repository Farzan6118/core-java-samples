package com.practice.collections.exercises.two;

import com.github.javafaker.Faker;
import org.instancio.Instancio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapFilterDemo {

   private final List<Inquiry> inquiryList = new ArrayList<>();
   private final List<Raw> rawList = new ArrayList<>();
   private final Faker faker = new Faker();

    public MapFilterDemo() {
        Inquiry inquiry = Instancio.create(Inquiry.class);
        Raw raw = Instancio.create(Raw.class);

    }


}
