/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet.bdd.hopital.dataElements;

/**
 *
 * @author Charles
 */
public class Service extends DataElement {
    //specific data
    private int code_service;
    private String nom;
    private String batiment;
    private String directeur;
    //Constructor
    Service(int code)
    {
    code_service = code;
    }
    //Methods
    
    
}
