package hcl.model;
// Generated Jul 25, 2020 1:27:08 PM by Hibernate Tools 4.3.1



/**
 * OrderItemId generated by hbm2java
 */
public class OrderItemId  implements java.io.Serializable {


     private int orderItemId;
     private int orderId;

    public OrderItemId() {
    }

    public OrderItemId(int orderItemId, int orderId) {
       this.orderItemId = orderItemId;
       this.orderId = orderId;
    }
   
    public int getOrderItemId() {
        return this.orderItemId;
    }
    
    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrderItemId) ) return false;
		 OrderItemId castOther = ( OrderItemId ) other; 
         
		 return (this.getOrderItemId()==castOther.getOrderItemId())
 && (this.getOrderId()==castOther.getOrderId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrderItemId();
         result = 37 * result + this.getOrderId();
         return result;
   }   


}


