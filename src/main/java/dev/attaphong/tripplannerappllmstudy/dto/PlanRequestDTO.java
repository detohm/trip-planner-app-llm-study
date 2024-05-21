package dev.attaphong.tripplannerappllmstudy.dto;

import lombok.Data;

@Data
public class PlanRequestDTO {
    private String city;
    private Integer days;
    private String requirements;
}
