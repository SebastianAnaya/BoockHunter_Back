package com.Tiancho.BoockHunter.service;

import com.Tiancho.BoockHunter.modelo.Bibliotecario;
import com.Tiancho.BoockHunter.repository.BibliotecarioRepository;
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
public class BibliotecarioService implements BibliotecarioRepository{
    @Autowired
    private BibliotecarioRepository bibliotecarioRepository;
    @Override
    public void flush() {

    }

    @Override
    public <S extends Bibliotecario> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Bibliotecario> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Bibliotecario> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Bibliotecario getOne(Long aLong) {
        return null;
    }

    @Override
    public Bibliotecario getById(Long aLong) {
        return null;
    }

    @Override
    public Bibliotecario getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Bibliotecario> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Bibliotecario> List<S> findAll(Example<S> example) {
        return bibliotecarioRepository.findAll(example);
    }

    @Override
    public <S extends Bibliotecario> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Bibliotecario> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Bibliotecario> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Bibliotecario> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Bibliotecario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Bibliotecario> S save(S entity) {
        return bibliotecarioRepository.save(entity);
    }

    @Override
    public <S extends Bibliotecario> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Bibliotecario> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Bibliotecario> findAll() {
        return null;
    }

    @Override
    public List<Bibliotecario> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Bibliotecario entity) {
        bibliotecarioRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        bibliotecarioRepository.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Bibliotecario> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Bibliotecario> findAll(Sort sort) {
        return bibliotecarioRepository.findAll(sort);
    }

    @Override
    public Page<Bibliotecario> findAll(Pageable pageable) {
        return bibliotecarioRepository.findAll(pageable);
    }
}
