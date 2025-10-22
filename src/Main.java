import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван Иванов", 101);
        Student student2 = new Student("Мария Петрова", 102);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            writer.write(student1.toString() + System.lineSeparator());
            writer.write(student2.toString() + System.lineSeparator());
            System.out.println("Данные успешно записаны в файл!");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}