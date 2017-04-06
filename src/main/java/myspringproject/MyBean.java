package myspringproject;


import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
    
    @Value("${mycustom}")
    private String prop;
    
    
    
    @Value("#{${iassconfig.settings.mappings}}")
    private Map<String,String> mymaps;

    public String myValue()
    {
    	return prop;
    }
    
   
    
    public void mymapIterate()
    {
    	mymaps.forEach((k,v) -> System.out.println("key is :"+k+"Value is"+v));
    }
    
    
    
    
}
