package com.sd.bms.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ScreenDto
{
    int screenNo;
    List<LocalDate> timings;
    Movie movie;
    SeatsMap seatsMap;

}
