package com.java.practice.threads.exercises.exerciseOne;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PackOne {

    private static PackOne instance;
    final Function<String, Integer> stringIntegerFunction = String::length;
    final Function<Integer, Integer> integerIntegerFunction = x -> x * 2;
    final BiFunction<String, String, Integer> stringStringIntegerBiFunction = String::indexOf;
    final BiConsumer<? super Integer, ? super Integer> integerIntegerBiConsumer = (x, y) -> System.out.println("x=" + x + ", y=" + y);
    final BiConsumer<String, String> stringStringBiConsumer = (x, y) -> System.out.println("x=" + x + ", y=" + y);
    public String value;

    private PackOne(String value) {
        this.value = value;
    }

    public PackOne() {
    }

    static <T> void sss(T a1, T a2, BiConsumer<T, T> ttBiConsumer) {
        ttBiConsumer.accept(a1, a2);
    }

    public static void main(String[] args) {
//        sampleOne();
//        sampleTwo();
        Test test = new Test();
        test.printTheResult();
        PackOne packOne = new PackOne();
        sss("32", "sdasdf", (a1, a2) -> System.out.println(a1 + a2));
        packOne.integerIntegerBiConsumer.accept(packOne.stringStringIntegerBiFunction.apply("quwieuoiqw", "uo"), packOne.stringIntegerFunction.andThen(packOne.integerIntegerFunction).apply("hdjhsj234234fsd"));

        List<Integer> stringListKeys = Stream.of("1 2 3 4 5 6 7 8 9 10 11 13".split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        List<String> stringListValues = Stream.of("a b c d e f g h i j k l".split(" ")).map(String::toUpperCase).collect(Collectors.toList());

        List<Integer> integerList = Arrays.asList(1, 5, 7, 8, 9, 6, 5, 4, 3, 7, 89, 9, 4);

        for (Integer d : integerList) {
            System.out.println(d);
        }

        integerList.stream().distinct().forEachOrdered(System.out::println);

        Stream<String> stringStream = Stream.of("s111s ahd sSFFGGs dasdf df".split(" "));
        List<Integer> integers = stringStream.distinct().filter(x -> x.endsWith("s") && x.startsWith("s")).mapToInt(String::length).boxed().collect(Collectors.toList());
        integers.forEach(System.out::println);

        Stream<String> stringStream1 = Stream.of("h ff ds g".split(" "));
        stringStream1.skip(2).forEach(System.out::println);
        stringListKeys.forEach(System.out::print);
        BiConsumer<String, Integer> stringIntegerBiConsumer = (s, i) -> System.out.println("s: " + s + " i: " + i);
        System.out.println();
        stringListValues.forEach(System.err::print);
        Map<Integer, String> integerStringHashMap = new HashMap<>();
        stringIntegerBiConsumer.accept("3242", 243423);

        Stream<String> streamBuilder =
                Stream.<String>builder().add(" salam ".trim()).add(" hello ".trim()).add(" hi man ma ".trim()).build();
        streamBuilder.filter(x -> x.endsWith("a")).forEach(System.err::println);
        Iterator<Integer> integerIterator = stringListKeys.iterator();
        Iterator<String> stringIterator = stringListValues.iterator();
        while (integerIterator.hasNext()) {
            if (stringIterator.hasNext()) {
                integerStringHashMap.put(integerIterator.next(), stringIterator.next());
            }

        }
        System.err.println(integerStringHashMap);
    }

    private static void sampleTwo() {
        CountDownLatch latch = new CountDownLatch(4);

        Worker first = new Worker(1000, latch, "WORKER-1");
        Worker second = new Worker(2000, latch, "WORKER-2");
        Worker third = new Worker(3000, latch, "WORKER-3");
        Worker forth = new Worker(4000, latch, "WORKER-4");

        first.start();
        second.start();
        third.start();
        forth.start();


        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }

    private static void sampleOne() {
        // write your code here
        BigDecimal value = new BigDecimal(BigInteger.probablePrime(10, new Random()));
        BigDecimal toFiatRatio = BigDecimal.valueOf(451.917262435);
        BigDecimal fromFiatRatio = BigDecimal.valueOf(445.1385034985);
        BigDecimal result = value.divide(toFiatRatio.divide(fromFiatRatio, 20, RoundingMode.HALF_EVEN), 20, RoundingMode.HALF_UP).round(new MathContext(1, RoundingMode.HALF_EVEN));
        //  result = value / (to fiat / from fiat)
        System.out.println(result);
        System.out.println(value);
        BigDecimal bd = new BigDecimal("-12345.6789");
        Optional<String> s = Optional.of("fsdfsd");


        System.out.println(bd.precision());
        System.out.println(bd.scale());
        System.out.println(bd.signum());

        BigInteger bigInteger = new BigInteger("24526457856867585685685678784234");

        System.out.println(3);
        System.out.println("Value is: " + bigInteger);

        List<ArrayList<String>> arrays = new ArrayList<>();

        DecimalFormat df = new DecimalFormat();
        Number val = df.parse("3.5669E3", new ParsePosition(0));
        System.out.println(val.intValue());

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("fs", 34);
        System.err.println(stringIntegerMap);
        System.out.println("sdfdsd");
        System.err.format("^ %d", 0B101 ^ 0B111);
        System.out.println("dd".hashCode() ^ 45 >>> 16);
    }

    public static PackOne getInstance(String value) {
        if (instance == null) {
            instance = new PackOne(value);
        }
        return instance;
    }

}
