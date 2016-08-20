package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.ArrayList;


@RestController
public class CetateanController {
  private List<Cetatean> cetateni = new ArrayList<Cetatean>();
	//int i=4;
	//String nume="";
  CetateanController() {
    Cetatean p1 = new Cetatean(1, "Maria");
    Cetatean p2 = new Cetatean(2, "Ion");
    Cetatean p3 = new Cetatean(3, "Elena");

    cetateni.add(p1);
    cetateni.add(p2);
    cetateni.add(p3);
  }

  @RequestMapping(value="/Cetatean", method = RequestMethod.GET)
  public List<Cetatean> index() {
    return this.cetateni;
  }
  
  @RequestMapping(value="/Cetatean/{nume}", method = RequestMethod.POST)
  public ResponseEntity create(@PathVariable("nume") String nume) {
		Cetatean n=new Cetatean( cetateni.size() +1,nume);
		cetateni.add(n);
		
        return new ResponseEntity<Cetatean>(n, new HttpHeaders(), HttpStatus.OK); 
  }

  @RequestMapping(value="/Cetatean/{id}", method = RequestMethod.GET)
  public ResponseEntity show(@PathVariable("id") int id) {
    for(Cetatean p : this.cetateni) {
      if(p.getId() == id) {
        return new ResponseEntity<Cetatean>(p, new HttpHeaders(), HttpStatus.OK);
      }
    }
    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
  }

    

@RequestMapping(value="/Cetatean/{id}", method = RequestMethod.PUT)
  public ResponseEntity update( @PathVariable("id") int id) {
	  
	  for(Cetatean p : this.cetateni) {
		if(p.getId() == id) {
			p.setName("Claudiu");
        return new ResponseEntity<Cetatean>(p, new HttpHeaders(), HttpStatus.OK); 
		}
	  }
	return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);	
  }


  @RequestMapping(value="/Cetatean/{id}", method = RequestMethod.DELETE)
  public ResponseEntity remove(@PathVariable("id") int id) {
    for(Cetatean p : this.cetateni) {
      if(p.getId() == id) {
        this.cetateni.remove(p);
        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
      }
    }
    return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
  }
}