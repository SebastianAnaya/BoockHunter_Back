package com.Tiancho.BoockHunter.service;


import com.Tiancho.BoockHunter.modelo.Ejemplar;
import com.Tiancho.BoockHunter.repository.EjemplarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class EjemplarService implements EjemplarRepository {
    @Autowired
    private EjemplarRepository ejemplarRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends Ejemplar> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Ejemplar> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Ejemplar> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Ejemplar getOne(Long aLong) {
        return null;
    }

    @Override
    public Ejemplar getById(Long aLong) {
        return null;
    }

    @Override
    public Ejemplar getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Ejemplar> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Ejemplar> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Ejemplar> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Ejemplar> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Ejemplar> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Ejemplar> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Ejemplar, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Ejemplar> S save(S entity) {
        return ejemplarRepository.save(entity);
    }

    @Override
    public <S extends Ejemplar> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Ejemplar> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Ejemplar> findAll() {
        return ejemplarRepository.findAll();
    }

    @Override
    public List<Ejemplar> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        ejemplarRepository.deleteById(aLong);
    }

    @Override
    public void delete(Ejemplar entity) {
        ejemplarRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Ejemplar> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Ejemplar> findAll(Sort sort) {
        return ejemplarRepository.findAll(sort);
    }

    @Override
    public Page<Ejemplar> findAll(Pageable pageable) {
        return null;
    }
}
