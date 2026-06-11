package com.example.demo.Controller;

import com.example.demo.Entities.Vehicle;
import com.example.demo.service.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    VehicleManager vehicleManager;

    @PostMapping("add")
    public Vehicle save(@RequestBody Vehicle vehicle ){
        return vehicleManager.save(vehicle);
    }

    @GetMapping("getAll")
    public List<Vehicle> getAll(){
        return vehicleManager.getAll();
    }

    @GetMapping("getById/{id}")
    public Vehicle getById(@PathVariable Integer id){
        return vehicleManager.getById(id);
    }

    @GetMapping("getById/{vehicleModel}")
    public List<Vehicle> getByModel(@PathVariable String vehicleModel){
        return vehicleManager.getByModel(vehicleModel);
    }

    @PutMapping("update/{id}")
    public Vehicle update(@PathVariable Integer id , @RequestBody Vehicle vehicle) throws Exception{
        return vehicleManager.update(id,vehicle);
    }

    @DeleteMapping("delete/{id}")

    public Boolean delete(@PathVariable Integer id){
        return vehicleManager.delete(id);
    }

}