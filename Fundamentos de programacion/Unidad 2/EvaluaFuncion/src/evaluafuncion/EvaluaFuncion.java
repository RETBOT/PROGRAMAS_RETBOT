package evaluafuncion;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EvaluaFuncion {
    public static void main(String[] args) throws ScriptException{
        ScriptEngineManager manager = new ScriptEngineManager();
        
        ScriptEngine engine = manager.getEngineByName("js");
        engine.put("X", 4);
        engine.put("Y", 2);
       
        String fun1= "5*(X*X)+3*X+2";
        
        Object operation = engine.eval(fun1);
        Object operation2 = engine.eval("(X+3)");
        Object operation3 = engine.eval("2*X+6*Y");
        
        System.out.println("Evaluado operacion 1: "+operation);
        System.out.println("Evaluado operacion 2: "+operation2);
        System.out.println("Evaluado operacion 3: "+operation3);
    }
    
}
