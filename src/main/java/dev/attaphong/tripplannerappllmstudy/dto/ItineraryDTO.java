package dev.attaphong.tripplannerappllmstudy.dto;

import lombok.Data;

import java.util.List;

@Data
public class ItineraryDTO {
    private Integer Day;
    private String summary;
    private String area;
    private List<AttractionDTO> morning;
    private List<AttractionDTO> afternoon;
    private List<AttractionDTO> evening;
    private List<AttractionDTO> night;
}
