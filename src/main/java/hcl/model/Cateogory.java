package hcl.model;
// Generated Jul 25, 2020 1:27:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;


public class Cateogory  implements java.io.Serializable {


     private int categoryId;
     private String categoryName;
     private Set<WorkStation> workStations = new HashSet<WorkStation>(0);
     private Set<Item> items = new HashSet<Item>(0);

    public Cateogory() {
    }

	
    public Cateogory(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
    public Cateogory(int categoryId, String categoryName, Set<WorkStation> workStations, Set<Item> items) {
       this.categoryId = categoryId;
       this.categoryName = categoryName;
       this.workStations = workStations;
       this.items = items;
    }
   
    public int getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Set<WorkStation> getWorkStations() {
        return this.workStations;
    }
    
    public void setWorkStations(Set<WorkStation> workStations) {
        this.workStations = workStations;
    }
    public Set<Item> getItems() {
        return this.items;
    }
    
    public void setItems(Set<Item> items) {
        this.items = items;
    }




}


