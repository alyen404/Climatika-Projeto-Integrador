package com.climatika.Climatika.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.climatika.Climatika.models.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	// containingIgnoreCase - provisorio
	public List<Usuario> findAllByCpfContainingIgnoreCase(String cpf);
	
	public List<Usuario> findAllByAdminContainingIgnoreCase(String admin);
}
