/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.vdab.entities.items;

import be.vdab.entities.Item;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Chi.Ng
 */
@Entity
@Table(name = "ladder")
public class Ladder extends Item {
    
    @Override
    public String getOmschrijving(){
        return "een ladder";
    }
    
}
