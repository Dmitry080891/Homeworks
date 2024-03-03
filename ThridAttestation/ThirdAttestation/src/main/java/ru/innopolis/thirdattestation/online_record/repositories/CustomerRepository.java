package ru.innopolis.thirdattestation.online_record.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.thirdattestation.online_record.models.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
