package br.com.dbserve.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dbserve.apirest.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}