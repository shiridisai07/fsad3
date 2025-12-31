package com.klu;
import javax.persistence.*;
@Entity
@Table(name="student") // here existing name table will be created
public class student {
  @Id //this is considered as a primary key
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;
  
  public student()
  {
    System.out.print(name);
  }
  public student(String name)
  {
    this.name=name;
  }
 

}