package ru.innopolis.thirdattestation.online_record.repositories;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.innopolis.thirdattestation.online_record.models.Customer;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();
    List<Customer> findAllById(Long id);
    Optional<Customer> findById();

    Optional<Customer> findByPhone(Long phone);

    void deleteById(Id id);



}
