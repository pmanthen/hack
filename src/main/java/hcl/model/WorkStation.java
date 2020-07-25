package hcl.model;
// Generated Jul 25, 2020 1:27:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * WorkStation generated by hbm2java
 */
public class WorkStation  implements java.io.Serializable {


     private int workStationId;
     private Cateogory cateogory;
     private String name;
     private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

    public WorkStation() {
    }

	
    public WorkStation(int workStationId, String name) {
        this.workStationId = workStationId;
        this.name = name;
    }
    public WorkStation(int workStationId, Cateogory cateogory, String name, Set<OrderItem> orderItems) {
       this.workStationId = workStationId;
       this.cateogory = cateogory;
       this.name = name;
       this.orderItems = orderItems;
    }
   
    public int getWorkStationId() {
        return this.workStationId;
    }
    
    public void setWorkStationId(int workStationId) {
        this.workStationId = workStationId;
    }
    public Cateogory getCateogory() {
        return this.cateogory;
    }
    
    public void setCateogory(Cateogory cateogory) {
        this.cateogory = cateogory;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<OrderItem> getOrderItems() {
        return this.orderItems;
    }
    
    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }




}


