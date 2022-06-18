
package com.porfilio.sda.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
   private string nombre;
    
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
   private string apellido;
     
      
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
   private string img;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getApellido() {
        return apellido;
    }

    public void setApellido(string apellido) {
        this.apellido = apellido;
    }

    public string getImg() {
        return img;
    }

    public void setImg(string img) {
        this.img = img;
    }

   
    
    
   
}
