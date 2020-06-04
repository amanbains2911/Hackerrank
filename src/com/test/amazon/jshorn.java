/**
 * 
 */
package com.test.amazon;

/**
 * @author amanb
 *
 */
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class jshorn {

   public static void main(String args[]) {
      ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		
      String name = "Aman Bains";
      Integer result = 10/0;
      
      try {
         nashorn.eval("print('" + name + "')");
         result = (Integer) nashorn.eval("10 + 2");
         
      } catch(ScriptException e) {
    	  e=null;
         System.out.println("Error executing script: "+ e);
      }
      System.out.println(result.toString());
   }
}


