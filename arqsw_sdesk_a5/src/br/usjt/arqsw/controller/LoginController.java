package br.usjt.arqsw.controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UsuarioService;

/**
 @Autora Marina Barros - RA 816155372

 */

@Transactional
@Controller
public class LoginController {
	private UsuarioService usuarioService;
	
	@Autowired
	public LoginController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	

	@RequestMapping("login")
	public String telaLogin() {
		return "login";
	}
	
	@RequestMapping("/fazer_login")
	public String efetuaLogin(br.usjt.arqsw.entity.Usuario usuario, HttpSession session) throws IOException{
		if(usuarioService.validarLogin(usuario)){
			session.setAttribute("usuarioLogado", usuario);
			return "index";
		}
		return "redirect:login";
	}
	
}
