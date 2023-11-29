package com.mourid.contollers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mourid.entities.Employee;
import com.mourid.entities.Service;
import com.mourid.services.EmployeeService;
import com.mourid.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Service> getAll(){
        return serviceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getByID (@PathVariable Long id){
        Service service = serviceService.findById(id);
        if(service == null)
            return new ResponseEntity<Object>("service n'existe pas ", HttpStatus.NOT_FOUND);
        else
            return ResponseEntity.ok(service);
    }

    @PostMapping("/create")
    public Service crate(@RequestBody Service service){
        service.setId(0L);
        return serviceService.create(service);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateService(@PathVariable Long id, @RequestBody Service newsService) {

        Service oldSpecialite = serviceService.findById(id);
        if (oldSpecialite == null) {
            return new ResponseEntity<Object>("service avec id" + id + "nexiste pas ", HttpStatus.BAD_REQUEST);

        } else {
            newsService.setId(id);
            return ResponseEntity.ok(serviceService.update(newsService));
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteService(@PathVariable Long id) {

        Service service = serviceService.findById(id);
        if (service == null) {
            return new ResponseEntity<Object>("service avec id" + id + "nexiste pas ", HttpStatus.BAD_REQUEST);

        } else {
            serviceService.delete(service);
            return ResponseEntity.ok("service avec id " + id + " est supprime");
        }
    }


}
