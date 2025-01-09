package dev.jesus.runnerz.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    @Autowired
    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = new RunRepository();
    }

    @GetMapping("")
    List<Run> findAll(){
        return runRepository.findAll();
    }

    @GetMapping("/1")
    Run findById() {
        return runRepository.findById(1);
    }
}
