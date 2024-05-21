package dev.attaphong.tripplannerappllmstudy.dto;

import lombok.Data;

import java.util.List;

@Data
public class TripDTO {
    List<ItineraryDTO> itineraries;
}
