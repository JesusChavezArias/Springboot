package dev.jesus.runnerz.run;


import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public record Run(Integer id,
                  @NotEmpty
                  String title,
                  LocalDateTime startedOn,
                  LocalDateTime completedOn,
                  @Positive
                  Integer miles,
                  Location location
                  )
{

    public Run {
        if(!startedOn.isBefore(completedOn)){
            throw new IllegalArgumentException("Completado antes de haber empezado!!!!!");
        }
    }

}
