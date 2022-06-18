 
package com.porfilio.sda.Controller;

import com.porfilio.sda.Entity.Persona;
import com.porfilio.sda.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
     public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequesBody Persona persona){
        ipersonaService.savePersona(persona);
        return "la persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "la persona fue eliminada correctamente";
    }
     
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                       @RequestParam("nombre")String nuevoNombre,
                       @RequestParam("apellido")String nuevoApellido,
                       @RequestParam("img")String nuevoImg,){
      Persona persona = ipersonaService.findPersona(id);
      
      persona.setNombre(nuevoNombre);
      persona.setApellido(nuevoApellido);
      persona.setImg(nuevoImg);
      
      ipersonaService.savePersona(persona);
      return persona;
    }
}

