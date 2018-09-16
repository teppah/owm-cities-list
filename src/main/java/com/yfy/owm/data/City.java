package com.yfy.owm.data;

import com.yfy.owm.CityUtils;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(of = {"name", "country"})
/**
 * City class for OpenWeatherMap, used in conjunction with {@link CityUtils}
 *
 *
 */
public final class City {
    private int id;
    private String name;
    private String country;
    private Coord coord;
}
