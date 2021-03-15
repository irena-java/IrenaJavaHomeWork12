/* 1) Написать класс Person, у которого есть следующие поля:
- Фамилия, Имя, Отчество, дата рождения.
Написать конструкторы:
- на все поля,
- только на ФИО
- который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович", и задает отдельные значения в поля Фамилия, Имя, Отчество.
Написать методы:
- который возвращает полное ФИО типа "Иванов Иван Иванович"
- краткое ФИО типа "Иванов И. И."
2*) Дата рождения задается как строка типа "18.12.1985"
- добавить метод который выводит количество полных лет */
package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] person = new Person[20];
        person[0] = new Person("Петров Василий Степанович");
        person[1] = new Person("Лысенко", "Иванович", "Николай", "18.03.2006");
        System.out.println("ФИО: " + person[1].fioLong());
        System.out.println("Фамилия и инициалы: " + person[1].fioShort());

        int yearsPerson = person[1].years();
        int monthPerson = person[1].month();
        int daysPerson = person[1].days();
        LocalDate today = LocalDate.now();
        int years = today.getYear() - yearsPerson;
        if (today.getMonthValue() < monthPerson) {
            years--;
        } else if (today.getMonthValue() == monthPerson && today.getDayOfMonth() < daysPerson) {
            years--;
        }
        System.out.println("Полных лет - "+years);

        System.out.println(Arrays.toString(person));
    }
}
