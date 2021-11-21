package by.petproject.tasklist.backendspringboot.controller;

import by.petproject.tasklist.backendspringboot.repo.PriorityRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/priority")
public class PriorityController {

    private PriorityRepository priorityRepository;

    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }
}
