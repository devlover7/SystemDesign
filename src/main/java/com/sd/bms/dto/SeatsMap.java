package com.sd.bms.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SeatsMap
{
Map<Seats,Integer> totalSeats;
List<Map<Seats,Integer>> seatsFilled;
}
