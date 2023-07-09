package com.hello.hello.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hello.hello.entity.Cita;


@RepositoryRestResource(collectionResourceRel = "citas", path="citas")


public interface CitaRepository extends PagingAndSortingRepository<Cita, Long>, CrudRepository<Cita, Long>
{
    //Mappings personalizados
}
