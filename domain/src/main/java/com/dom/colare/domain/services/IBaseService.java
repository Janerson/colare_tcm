package com.dom.colare.domain.services;

import org.modelmapper.Conditions;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MappingContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @param <T> Entity
 * @param <D> Dto
 */
public interface IBaseService<T, D> {

    default BCryptPasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    default ModelMapper modelMapper() {

        Converter<String, String> passwordConverter = new Converter<String, String>() {
            @Override
            public String convert(MappingContext<String, String> context) {
                String path = context.getMapping().getPath();
                return path.contains("password") ?
                        encoder().encode(context.getSource())
                        : context.getSource();
            }
        };

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT).setPropertyCondition(Conditions.isNotNull());
        modelMapper.addConverter(passwordConverter);
        return modelMapper;
    }

   /**
     * <p>Note: outClass object must have default constructor with no arguments</p>
     *
     * @param entity   entity that needs to be mapped.
     * @param outClass class of result object.
     * @return new object of <code>outClass</code> type.
     */
    default D mapToDTO(final T entity, Class<D> outClass) {
        return modelMapper().map(entity, outClass);
    }

    default T mapFromDTO(final D entityDTO, Class<T> outClass) {
        return modelMapper().map(entityDTO, outClass);
    }

    /**
     * @param dto    Object
     * @param entity Object
     * @return entity
     */
    default T mapFromDTO(final D dto, T entity) {
        modelMapper().map(dto, entity);
        return entity;
    }

    /**
     * @param entity Object
     * @param dto    Object
     * @return dto
     */
    default D mapToDTO(final T entity, D dto) {
        modelMapper().map(entity, dto);
        return dto;
    }


    /**
     * <p>Note: outClass object must have default constructor with no arguments</p>
     *
     * @param entityList list of entities that needs to be mapped
     * @param outCLass   class of result list element
     * @return list of mapped object with <code><D></code> type.
     */
    default List<D> mapAll(final Iterable<T> entityList, Class<D> outCLass) {
        Collection<T> tList = new ArrayList<>();
        entityList.forEach(tList::add);
        return tList.stream()
                .map(entity -> mapToDTO(entity, outCLass))
                .collect(Collectors.toList());
    }

    /**
     * Maps {@code source} to {@code destination}.
     *
     * @param source      object to map from
     * @param destination object to map to
     **/

    default <S> D map(final S source, D destination) {
        modelMapper().map(source, destination);
        return destination;
    }


  }

