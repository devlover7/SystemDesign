package com.sd.bms.dto;

import com.sd.bms.dto.enums.Certificate;
import com.sd.bms.dto.enums.Languages;

import java.util.List;

public class Movie {
    String name;
    Languages languages;
    List<String> actors;
    Certificate certificate;
}
