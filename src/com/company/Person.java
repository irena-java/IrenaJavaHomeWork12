package com.company;

public class Person {
    private String surName;
    private String middleName;
    private String name;
    private String birthday;

    public Person(String surName, String middleName, String name, String birthday) {
        this.surName = surName;
        this.middleName = middleName;
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String surName, String middleName, String name) {
        this.surName = surName;
        this.middleName = middleName;
        this.name = name;
    }

    public Person(String fio) {
        String[] fioTogether = new String[2];
        fioTogether = fio.trim().split("\\s");
        this.surName = fioTogether[0];
        this.middleName = fioTogether[1];
        this.name = fioTogether[2];

    }


    @Override
    public String toString() {
        return "Person{" +
                "surName='" + surName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\n' +
                '}';
    }

    public String fioLong() {
        return surName+" "+name+" "+ middleName;
    }

    public String fioShort() {
        return surName+" "+name.charAt(0)+"."+ middleName.charAt(0)+".";
    }

    public String getBirthday() {
        return birthday;
    }

    public int years() {
        return Integer.parseInt(birthday.substring(6,10));
    }
    public int days() {
        return Integer.parseInt(birthday.substring(0,2));
    }
    public int month() {
        return Integer.parseInt(birthday.substring(3,5));
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
