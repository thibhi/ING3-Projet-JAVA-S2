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

///--- GENERIC ELEMENT OF DATABASE ---///
public abstract class DataElement {
    //protected String ElementType;
    //public String getElementType(){return ElementType;}
    public String getAddRequest(String Table){return "";}
}