package hello;

import java.util.List;
import java.util.ArrayList;

public class Cetatean {
  private String name;
  private int id;

  public Cetatean() {}

  public Cetatean(int id, String name) {
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