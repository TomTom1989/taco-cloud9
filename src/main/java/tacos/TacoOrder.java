package tacos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.userdetails.User;


import lombok.Data;

@Data
@Document
public class TacoOrder implements Serializable {
 private static final long serialVersionUID = 1L;
 @Id
 private String id;
 private Date placedAt = new Date();
 
 private User user;
 private String deliveryName;
 private String deliveryStreet;
 private String deliveryCity;
 private String deliveryState;
 private String deliveryZip;
 private String ccNumber;
 private String ccExpiration;
 private String ccCVV;
 private List<Taco> tacos = new ArrayList<>();
 public void addTaco(Taco taco) {
 this.tacos.add(taco);
}
}
