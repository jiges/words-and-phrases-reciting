package com.ccr.wapr.server.common.service.impl;

import com.ccr.wapr.server.common.service.CrudService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.util.Streamable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AbstractCrudService<T,ID> implements CrudService<T,ID>{

    private CrudRepository<T,ID> repository;

    @Override
    public <S extends T> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        Iterable<S> result = repository.saveAll(entities);
        if (null == result) {
            return Collections.emptyList();
        }
        return Streamable.of(result).stream().collect(Collectors.toList());
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @Override
    public List<T> findAll() {
        Iterable<T> result = repository.findAll();
        if (null == result) {
            return Collections.emptyList();
        }
        return Streamable.of(result).stream().collect(Collectors.toList());
    }

    @Override
    public List<T> findAllById(Iterable<ID> ids) {
        Iterable<T> result = repository.findAllById(ids);
        if (null == result) {
            return Collections.emptyList();
        }
        return Streamable.of(result).stream().collect(Collectors.toList());
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }

    @Override
    public void deleteAll(Iterable<? extends T> entities) {
        repository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    protected void setRepository(CrudRepository repository) {
        this.repository = repository;
    }
}
