package com.word_creator.service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class wordService {
    public void create() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("- enter the characters you want to build your sentences with (comma separated): ");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.equals("0exit")) break;
            System.out.print("- enter the characters you want to build your sentences with (comma separated): ");
            List<String> strings = Arrays.asList(str.split(","));

            for (int i = 0; i < strings.size(); i++) {
                if (!strings.get(i).isEmpty()) {
                    char c = strings.get(i).charAt(0);
                    strings.set(i, String.valueOf(c));
                }
            }
            System.err.println(strings);

            switch (strings.size()) {
                case 2 -> twoCharSentences(strings);
                case 3 -> ThreeCharSentences(strings);
                case 4 -> fourCharSentences(strings);
                case 5 -> fiveCharSentences(strings);

                case 6 -> sixCharSentences(strings);


                case 7 -> sevenCharSentences(strings);


                case 8 -> eightCharSentences(strings);


                case 9 -> nineCharSentences(strings);


                default -> System.err.println("the size is not valid");
            }
        }
        scanner.close();
    }


    private void twoCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (String string : strings) {
                System.out.println(strings.get(i) + string);
            }
        }
    }

    private void ThreeCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (String string : strings) {
                    System.out.println(strings.get(i) + strings.get(j) + string);
                }
            }
        }
    }

    private void fourCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (int k = 0; k < strings.size(); k++) {
                    for (String string : strings) {
                        System.out.println(strings.get(i) + strings.get(j) + strings.get(k) + string);
                    }
                }
            }
        }
    }

    private void fiveCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (int k = 0; k < strings.size(); k++) {
                    for (int l = 0; l < strings.size(); l++) {
                        for (String string : strings) {
                            System.out.println(strings.get(i) + strings.get(j) + strings.get(k) + strings.get(l) + string);
                        }
                    }
                }
            }
        }
    }


    private void sixCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (int k = 0; k < strings.size(); k++) {
                    for (int l = 0; l < strings.size(); l++) {
                        for (int m = 0; m < strings.size(); m++) {
                            for (String string : strings) {
                                System.out.println(strings.get(i) + strings.get(j) + strings.get(k) + strings.get(l) + strings.get(m) + string);
                            }
                        }
                    }
                }
            }
        }
    }

    private void sevenCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (int k = 0; k < strings.size(); k++) {
                    for (int l = 0; l < strings.size(); l++) {
                        for (int m = 0; m < strings.size(); m++) {
                            for (int n = 0; n < strings.size(); n++) {
                                for (String string : strings) {
                                    System.out.println(strings.get(i) + strings.get(j) + strings.get(k) + strings.get(l) + strings.get(m) + strings.get(n) + string);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void eightCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (int k = 0; k < strings.size(); k++) {
                    for (int l = 0; l < strings.size(); l++) {
                        for (int m = 0; m < strings.size(); m++) {
                            for (int n = 0; n < strings.size(); n++) {
                                for (int o = 0; o < strings.size(); o++) {
                                    for (String string : strings) {
                                        System.out.println(strings.get(i) + strings.get(j) + strings.get(k) + strings.get(l) + strings.get(m) + strings.get(n) + strings.get(o) + string);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void nineCharSentences(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                for (int k = 0; k < strings.size(); k++) {
                    for (int l = 0; l < strings.size(); l++) {
                        for (int m = 0; m < strings.size(); m++) {
                            for (int n = 0; n < strings.size(); n++) {
                                for (int o = 0; o < strings.size(); o++) {
                                    for (int p = 0; p < strings.size(); p++) {
                                        for (String string : strings) {
                                            System.out.println(strings.get(i) + strings.get(j) + strings.get(k) + strings.get(l) + strings.get(m) + strings.get(n) + strings.get(o) + strings.get(p) + string);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

