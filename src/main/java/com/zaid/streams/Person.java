package com.zaid.streams;

public class Person {
    private String name;
    private int age;
    private String nationality;
    
    public Person(String name, int age, String nationality){
      this.name = name;
      this.age = age;
      this.nationality=nationality;      
    }
    
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
    /**
     * @return the name
     */
    public String getName() {
      return name;
    }
    /**
     * @return the age
     */
    public int getAge() {
      return age;
    }
    /**
     * @return the nationality
     */
    public String getNationality() {
      return nationality;
    }
      
}
