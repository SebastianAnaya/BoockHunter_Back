package com.Tiancho.BoockHunter.service;

import com.Tiancho.BoockHunter.modelo.Lector;
import com.Tiancho.BoockHunter.repository.LectorRepository;
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
public class LectorService implements LectorRepository{
    @Autowired
    private LectorRepository lectorRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends Lector> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Lector> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Lector> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Lector getOne(Long aLong) {
        return null;
    }

    @Override
    public Lector getById(Long aLong) {
        return null;
    }

    @Override
    public Lector getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Lector> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Lector> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Lector> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Lector> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Lector> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Lector> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Lector, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Lector> S save(S entity) {
        return lectorRepository.save(entity);
    }

    @Override
    public <S extends Lector> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Lector> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Lector> findAll() {
        return lectorRepository.findAll();
    }

    @Override
    public List<Lector> findAllById(Iterable<Long> longs) {
        return lectorRepository.findAllById(longs);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {
        lectorRepository.deleteById(aLong);
    }

    @Override
    public void delete(Lector entity) {
        lectorRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Lector> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Lector> findAll(Sort sort) {
        return lectorRepository.findAll();
    }

    @Override
    public Page<Lector> findAll(Pageable pageable) {
        return null;
    }
}
