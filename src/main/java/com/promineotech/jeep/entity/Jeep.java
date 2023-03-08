package com.promineotech.jeep.entity;

 
import java.math.BigDecimal;
import java.util.Comparator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@Data
@Builder
 @NoArgsConstructor
 @AllArgsConstructor

public class Jeep implements Comparable<Jeep> {

  private Long modelPK;
  
  private JeepModel modelId;
  
  private String trimLevel;
  
  private int numDoors;
  
  private int wheelSize;
  
  private String colorId;
  
  private BigDecimal basePrice;
  
  

  @JsonIgnore
  public Long getModelPK() {
    return modelPK;
  }
  
  @Override 
  public int compareTo(Jeep that) {
	   
	  // Formatter:off
	  return Comparator
			  .comparing(Jeep::getModelId)
			  .thenComparing(Jeep::getTrimLevel)
			  .thenComparing(Jeep::getNumDoors)
			  .compare(this,  that);
	  
	  // formatter:on
  }
  
}


