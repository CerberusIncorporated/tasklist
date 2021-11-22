package by.petproject.tasklist.backendspringboot.service;

import org.springframework.stereotype.Service;
import by.petproject.tasklist.backendspringboot.entity.Stat;
import by.petproject.tasklist.backendspringboot.repo.StatRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class StatService {

    private final StatRepository repository;

    public StatService(StatRepository repository) {
        this.repository = repository;
    }

    public Stat findById(Long id){
        return repository.findById(id).get();
    }


}
