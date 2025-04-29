package edu.icet.controller;

import edu.icet.dto.Employee;
import edu.icet.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employees")
@CrossOrigin
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService service;

    @PostMapping()
    public void addEmployee(@Valid @RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @GetMapping()
    public List<Employee> getAll(){
       return service.getAll();
    }

    @PutMapping("/update")
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);
    }

    @GetMapping("/search-by-id/{id}")
    public Employee searchById(@PathVariable Integer id){
        return  service.searchById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer  id){
        service.deleteEmployee(id);
    }


}
