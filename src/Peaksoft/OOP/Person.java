package Peaksoft.OOP;

public class Person {

  private String name;
  private String lastName;
  private byte age;
  private double height;
  private double weight;
  private char gender;
  private String nationality;
  private String status;
  private boolean education;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public byte getAge() {
    return age;
  }
  public void setAge(byte age) {
    this.age = age;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public double getWeight() {
    return weight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public char getGender() {
    return gender;
  }
  public void setGender(char gender) {
    this.gender = gender;
  }
  public String getNationality() {
    return nationality;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public boolean isEducation() {
    return education;
  }
  public void setEducation(boolean education) {
    this.education = education;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", height=" + height +
            ", weight=" + weight +
            ", gender=" + gender +
            ", nationality='" + nationality + '\'' +
            ", status='" + status + '\'' +
            ", education=" + education +
            '}';
  }
}


