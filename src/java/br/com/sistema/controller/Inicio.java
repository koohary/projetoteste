/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.controller;

import br.com.security.Criptografia;
import java.security.NoSuchAlgorithmException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Josue
 */
@Controller
public class Inicio {
    
    @RequestMapping("")
    public String iniciando() {

        return "index";
    }
    
    
    
    @RequestMapping(value = "enviando", method = RequestMethod.POST)
    public String resultado(HttpSession session, HttpServletRequest request) throws NoSuchAlgorithmException{
        
        String senha = Criptografia.criptografar(request.getParameter("nome"));
        
        System.out.println(senha);
        
        
        return "resultado";
    }

}
