package Homework_15.Task_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JsonParser {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student egorka = objectMapper.readValue(new File("C:\\Users\\apenk\\IdeaProjects\\apenko1992\\apenko-pingwit\\src\\main\\resources\\json\\egorka.json"),Student.class);
        Student daniil = objectMapper.readValue(new File("C:\\Users\\apenk\\IdeaProjects\\apenko1992\\apenko-pingwit\\src\\main\\resources\\json\\Daniil.json"),Student.class);
        Student kate = objectMapper.readValue(new File("C:\\Users\\apenk\\IdeaProjects\\apenko1992\\apenko-pingwit\\src\\main\\resources\\json\\Kate.json"),Student.class);
        List<Student> students = List.of(egorka,kate,daniil);
        List<Student> sortedList = students.stream().sorted(Comparator.comparing(Student::firstname).reversed()).collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
