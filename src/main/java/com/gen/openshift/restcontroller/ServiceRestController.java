package com.gen.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gen.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> ServiceTest(){
		List<Contatto> lista= new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","DoppiaM"));
		lista.add(new Contatto("Maria","Verdi","V"));
		lista.add(new Contatto("Carlo","Rossi","CR"));
		return lista;
	}
}
