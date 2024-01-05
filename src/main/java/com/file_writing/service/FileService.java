package com.file_writing.service;

import com.file_writing.model.Employee;

import java.io.*;

public class FileService {
    private static final String pathFile = "src/main/java/com/file_writing/resource/sampleFile.txt";

    public void service() {
        Employee employee = new Employee();
        employee.setAge(40);
        employee.setName("devil");
        employee.setPhoneNumber("09516526563");
        employee.setSalary("18000000");

        String str = readFile();
        System.out.println(str);
        if (str.isEmpty()) {
            writeFile(employee);
        }
    }

    public String readFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(pathFile);
             BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            return stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile(Employee employee) {
        try (FileWriter fileWriter = new FileWriter(pathFile);
             BufferedWriter bw = new BufferedWriter(fileWriter)) {
            bw.write(employee.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
