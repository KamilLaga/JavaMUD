/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
    
package be.vdab.services;
    
import be.vdab.entities.HeeftItems;
import be.vdab.entities.Item;
import java.util.List;

/**
 *
 * @author Tim.Van den Langenbergh (tmtvl)
 * @version 1.0: 01-10-2013 (tmtvl): Initial version.
 */
public interface ItemService {
    void create(Item item);
    Item read(long id);
    void update(Item item);
    void delete(long id);
    List<Item> findByEigenaar(HeeftItems eigenaar);
}
