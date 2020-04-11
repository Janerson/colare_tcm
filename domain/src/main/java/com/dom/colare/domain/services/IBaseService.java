package com.dom.colare.domain.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @param <T> Entity
 * @param <D> Dto
 */
public interface IBaseService<T, D> {



    default ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
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
