package kz.iitu.ex8.repository;


import kz.iitu.ex8.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
