package br.lippe.testDB;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Usuario, Long>{

}
