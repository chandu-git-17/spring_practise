package practise.streams;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

}