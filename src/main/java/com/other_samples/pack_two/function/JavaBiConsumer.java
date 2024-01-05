package com.other_samples.pack_two.function;

import java.util.function.BiConsumer;
public class JavaBiConsumer {

    private final String str = "%d %s %d = %d%n";
    private final BiConsumer<Integer, Integer> biConsumer1 = (int1, int2) -> System.out.format(str, int1, "*", int2, int1 * int2);
    private final BiConsumer<Integer, Integer> biConsumer2 = (int1, int2) -> System.out.format(str, int1, "+", int2, int1 + int2);
    private final BiConsumer<Integer, Integer> biConsumer3 = (int1, int2) -> System.out.format(str, int1, "-", int2, int1 - int2);
    private final BiConsumer<Integer, Integer> biConsumerSum = biConsumer1.andThen(biConsumer2).andThen(biConsumer3);

    public void biConsumerCaller() {

//        biConsumer3.accept(3, 1);
        biConsumerSum.accept(6, 5);

    }
}