package com.cydeo.Task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class Fox {


   private String name;
   private boolean wearsCoat;
   private boolean hasATorch;
   private String coatColor;
   protected int bagCount;

}
