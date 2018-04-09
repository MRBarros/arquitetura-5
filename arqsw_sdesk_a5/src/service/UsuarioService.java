package service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.UsuarioDAO;
import br.usjt.arqsw.entity.Usuario;


/**
 @Autora Marina Barros - RA 816155372
 
 */


@Service
public class UsuarioService {
	private UsuarioDAO dao;
	
	@Autowired
	public UsuarioService(UsuarioDAO dao) {
		this.dao = dao;
	}
	
	public Boolean validarLogin(Usuario usuario) throws IOException {
		return dao.validarLogin(usuario);
	}
	
	
}
