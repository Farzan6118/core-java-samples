package com.practice.collections.exercises.two;

import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.instancio.Instancio;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Demonstrates mapping and filtering operations on two lists of device objects.
 * It compares `DeviceOne` and `DeviceTwo` objects based on their `code` field,
 * and collects the IDs of `DeviceTwo` entries that have a matching `code` in `DeviceOne`.
 */
@Slf4j
public class MapFilterDemo {

    private final List<DeviceOne> deviceOneList = new ArrayList<>();
    private final List<DeviceTwo> deviceTwoList = new ArrayList<>();
    private final List<Integer> matchedDeviceTwoIds = new ArrayList<>();
    private final Faker faker = new Faker();

    /**
     * Initializes the demo with sample data.
     * Each list is filled with 5 random device objects using Instancio.
     * One entry is intentionally set with the same code to simulate a match.
     */
    public MapFilterDemo() {
        IntStream.range(0, 5).forEach(i -> {
            deviceOneList.add(Instancio.create(DeviceOne.class));
            deviceTwoList.add(Instancio.create(DeviceTwo.class));
        });

        // Force a matching code between one DeviceOne and one DeviceTwo for demonstration
        deviceOneList.get(3).setCode(deviceTwoList.get(2).getCode());
    }

    /**
     * Filters DeviceTwo entries whose `code` exists in any DeviceOne entry,
     * and collects the matching DeviceTwo IDs into the result list.
     *
     * Time complexity: O(n + m), where n = size of deviceOneList, m = size of deviceTwoList
     */
    public void mapMatchingCodesToDeviceTwoIds() {
        Set<String> deviceOneCodes = deviceOneList.stream()
                .map(DeviceOne::getCode)
                .collect(Collectors.toSet());

        deviceTwoList.stream()
                .filter(deviceTwo -> deviceOneCodes.contains(deviceTwo.getCode()))
                .map(DeviceTwo::getId)
                .forEach(matchedDeviceTwoIds::add);
    }

    /**
     * Creates two maps indexed by `code` for both device lists.
     * Then finds matching keys and collects the corresponding DeviceTwo IDs into the result list.
     *
     * This approach is helpful if you later need to look up devices by code for more advanced operations.
     */
    public void mapMatchingCodesToDeviceTwoIdsWithMap() {
        Map<String, DeviceOne> deviceOneMap = deviceOneList.stream()
                .collect(Collectors.toMap(DeviceOne::getCode, Function.identity(), (a, b) -> b));

        Map<String, DeviceTwo> deviceTwoMap = deviceTwoList.stream()
                .collect(Collectors.toMap(DeviceTwo::getCode, Function.identity(), (a, b) -> b));

        deviceOneMap.keySet().stream()
                .filter(deviceTwoMap::containsKey)
                .map(code -> deviceTwoMap.get(code).getId())
                .forEach(matchedDeviceTwoIds::add);
    }

    /**
     * Prints all DeviceOne entries to standard output.
     */
    public void printDeviceOneList() {
        System.out.println("DeviceOne list:");
        deviceOneList.forEach(System.out::println);
    }

    /**
     * Prints all DeviceTwo entries to standard output.
     */
    public void printDeviceTwoList() {
        System.out.println("DeviceTwo list:");
        deviceTwoList.forEach(System.out::println);
    }

    /**
     * Prints all matched DeviceTwo IDs to standard error.
     */
    public void printMatchedDeviceTwoIds() {
        System.err.println("Matched DeviceTwo IDs:");
        matchedDeviceTwoIds.forEach(System.err::println);
    }
}
