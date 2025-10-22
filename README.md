# lab3_java
## Задание 1: Создание классов и объектов
Создайте класс Student с полями String name и int studentId. Создайте два объекта Student с разными данными и сохраните их информацию в файл students.txt. Проверьте, что файл записывается корректно на двух ОС.
Результат: Файлы Student.java, Main.java, students.txt. Загрузите в GitLab (ветка task1).

## Задание 2: Конструкторы
В классе Student добавьте конструктор, принимающий name и studentId:
```java
class Student {
    String name;
    int studentId;
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
}
```

В Main создайте несколько объектов с использованием предложенного конструктора. Добавьте конструктор по умолчанию и используйте его для создания еще одного объекта. Сохраните данные всех объектов в constructors.txt:

Файл constructors.txt. Загрузите в Github (ветка task2).
