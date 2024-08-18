package com.edu.ue.client.myfifthproject5.service;

import java.util.List;

import com.edu.ue.client.myfifthproject5.model.Municipio;

public interface MunicipioServiceI {
	List<Municipio> listMunicipios();
	List<Municipio> searchDepartamento(String name);
}
