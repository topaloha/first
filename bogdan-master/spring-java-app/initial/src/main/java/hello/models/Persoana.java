package hello;

import java.util.List;
import java.util.ArrayList;

public class Persoana {
  private String Denumire;
  private int id;

  public Persoana() {}

  public Persoana(int id, String Denumire) {
      this.Denumire = Denumire;
      this.id = id;
  }

  public String getDenumire() {
      return this.Denumire;
  }
  public void setDenumire(String Denumire){
	  this.Denumire=Denumire; 
  }
  public void setId(int id){
	  this.id=id; 
  }

  public int getId() {
    return this.id;
  }
}