package dcrispin.iu.ducksservice.controllers;

import dcrispin.iu.ducksservice.model.Duck;
import dcrispin.iu.ducksservice.model.Type;
import dcrispin.iu.ducksservice.repository.DucksRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.List;

public class DucksController {

    private DucksRepository ducksRepository;
    public DucksController(DucksRepository ducksRepository){
        this.ducksRepository = ducksRepository;
    }
    @PostMapping("/ducks")
    public boolean add(@RequestBody int id, @RequestBody Type type) {
        try {
            return ducksRepository.addDuck(id, type);
        } catch (IOException e){
            return false;
        }
    }

    @GetMapping("/ducks")
    public List<Duck> getAll(){
        try {
            return ducksRepository.getAllDucks;
        } catch (IOException e){
            return null;
        }
    }

    
}
