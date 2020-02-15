package ru.airlightvt.onlinerecognition.shared.trasformer;

import ru.airlightvt.onlinerecognition.shared.dto.AdvertDto;
import ru.airlightvt.onlinerecognition.entity.Advert;

/**
 * Преобразование из сущности в DTO и обратно для объявлений
 */
public class AdvertConverter {
    public static Advert convert(AdvertDto source)
    {
        return source == null ? null : new Advert(source);
    }

    public static AdvertDto convert(Advert source)
    {
        return source == null ? null : AdvertDto.builder()
                .id(source.id())
                .title(source.getTitle())
                .breed(source.getBreed())
                .coatColor(source.getCoatColor())
                .description(source.getDescription())
                .height(source.getHeight())
                .weight(source.getWeight())
                .vaccinations(source.isVaccinations())
                .image(source.getImage())
                .build();
    }
}