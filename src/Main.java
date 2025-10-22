import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Создание объектов с использованием конструктора с параметрами
        Student student1 = new Student("Иван Иванов", 101);
        Student student2 = new Student("Мария Петрова", 102);
        Student student3 = new Student("Алексей Сидоров", 103);

        // Создание объекта с использованием конструктора по умолчанию
        Student student4 = new Student();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("constructors.txt"))) {
            // Запись информации о студентах, созданных через конструктор с параметрами
            writer.write("Студенты созданные через конструктор с параметрами:" + System.lineSeparator());
            writer.write(student1.toString() + System.lineSeparator());
            writer.write(student2.toString() + System.lineSeparator());
            writer.write(student3.toString() + System.lineSeparator());

            writer.write(System.lineSeparator());

            // Запись информации о студенте, созданном через конструктор по умолчанию
            writer.write("Студент созданный через конструктор по умолчанию:" + System.lineSeparator());
            writer.write(student4.toString() + System.lineSeparator());

            System.out.println("Данные успешно записаны в файл constructors.txt!");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}