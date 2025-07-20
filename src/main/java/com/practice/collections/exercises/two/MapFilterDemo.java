package com.practice.collections.exercises.two;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.instancio.Instancio;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public class MapFilterDemo {

    private final List<DeviceOne> deviceOneList = new ArrayList<>();
    private final List<DeviceTwo> deviceTwoList = new ArrayList<>();
    private final List<Integer> matchedDeviceTwoIds = new ArrayList<>();
    private final Faker faker = new Faker();

    public MapFilterDemo() {
        IntStream.range(0, 5).forEach(i -> {
            deviceOneList.add(Instancio.create(DeviceOne.class));
            deviceTwoList.add(Instancio.create(DeviceTwo.class));
        });
    }

    /**
     * Matches DeviceTwo entries whose code exists in DeviceOne entries,
     * and collects their IDs into the result list.
     */
    public void mapMatchingCodesToDeviceTwoIds() {

        deviceOneList.get(3).setCode(deviceTwoList.get(2).getCode());

        Set<String> deviceOneCodes = deviceOneList.stream()
                .map(DeviceOne::getCode)
                .collect(Collectors.toSet());

        deviceTwoList.stream()
                .filter(deviceTwo -> deviceOneCodes.contains(deviceTwo.getCode()))
                .map(DeviceTwo::getId)
                .forEach(matchedDeviceTwoIds::add);
    }

    /**
     * Prints all DeviceOne entries.
     */
    public void printDeviceOneList() {
        deviceOneList.forEach(System.out::println);
    }

    /**
     * Prints all DeviceTwo entries.
     */
    public void printDeviceTwoList() {
        deviceTwoList.forEach(System.out::println);
    }

    /**
     * Prints all matched DeviceTwo IDs.
     */
    public void printMatchedDeviceTwoIds() {
        matchedDeviceTwoIds.forEach(System.err::println);
    }
}