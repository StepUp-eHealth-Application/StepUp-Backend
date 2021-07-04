package de.hskempten.stepupbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class WeightGoalDTO {

    private String id;
    private String description;
    private String patientId;
    private Date dueDate;
    private float weightGoal;

    public WeightGoalDTO(@JsonProperty("id") String id,
                         @JsonProperty("description") String description,
                         @JsonProperty("patientId") String patientId,
                         @JsonProperty("dueDate") Date dueDate,
                         @JsonProperty("weightGoal") float weightGoal) {
        this.id = id;
        this.description = description;
        this.patientId = patientId;
        this.dueDate = dueDate;
        this.weightGoal = weightGoal;
    }
}
