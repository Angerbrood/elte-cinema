package hu.elte.cinema.converter.dto;

import hu.elte.cinema.dto.MovieDto;
import hu.elte.cinema.dto.RoomDto;
import hu.elte.cinema.dto.ScreeningDto;
import hu.elte.cinema.model.Screening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ScreeingDtoConverter implements Converter<Screening, ScreeningDto> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public ScreeningDto convert(Screening screening) {
        ScreeningDto result = new ScreeningDto();
        result.setId(screening.getId());
        result.setDate(screening.getDate());
        result.setMovie(conversionService.convert(screening.getMovie(), MovieDto.class));
        result.setRoom(conversionService.convert(screening.getRoom(), RoomDto.class));
        return result;
    }
}
