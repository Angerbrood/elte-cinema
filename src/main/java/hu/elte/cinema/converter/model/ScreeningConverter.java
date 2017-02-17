package hu.elte.cinema.converter.model;


import hu.elte.cinema.dto.ScreeningDto;
import hu.elte.cinema.model.Movie;
import hu.elte.cinema.model.Room;
import hu.elte.cinema.model.Screening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ScreeningConverter implements Converter<ScreeningDto, Screening>{

    @Autowired
    private ConversionService conversionService;

    @Override
    public Screening convert(ScreeningDto screeningDto) {
        Screening result = new Screening();
        result.setId(screeningDto.getId());
        result.setDate(screeningDto.getDate());
        result.setMovie(conversionService.convert(screeningDto.getMovie(), Movie.class));
        result.setRoom(conversionService.convert(screeningDto.getRoom(), Room.class));
        return result;
    }
}
