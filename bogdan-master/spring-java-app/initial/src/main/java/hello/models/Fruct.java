package hello;

import java.util.List;
import java.util.ArrayList;

public class Fruct {
  private String name;
  private int id;

  public Fruct() {}

  public Fruct(int id, String name) {
      this.name = name;
      this.id = id;
  }

  public String getName() {
      return this.name;
  }
  public void setName(String name){
	  this.name=name; 
  }
  public void setId(int id){
	  this.id=id; 
  }

  public int getId() {
    return this.id;
  }
}