package org.generation.blogPessoal.Seguranca;

import java.util.Optional;

import org.generation.blogPessoal.Repository.UsuarioRepository;
import org.generation.blogPessoal.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> user=userRepository.findByUsuario(username);
		user.orElseThrow(()-> new UsernameNotFoundException(username+" not found."));
		return user.map(UserDetailsImpl :: new).get();
	}

}
