package com.example.mywebapp.service;

import com.example.mywebapp.model.Usuario;
import com.example.mywebapp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public void guardarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
}
