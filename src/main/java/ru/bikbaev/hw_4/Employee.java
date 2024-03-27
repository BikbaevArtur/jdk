package ru.bikbaev.hw_4;

public class Employee {
  private   int reportCard;
  private   String phone;
  private   String name;
  private   double experience;

    public Employee(int reportCard, String phone, String name, double experience) {
        this.reportCard = reportCard;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public int getReportCard() {
        return reportCard;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "{" +
                "Табельный номер =" + reportCard +
                ", Номер телефона='" + phone + '\'' +
                ", Имя='" + name + '\'' +
                ", Опыт=" + experience +
                "}"
                ;
    }
}
