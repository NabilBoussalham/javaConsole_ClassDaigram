package Generator.Models;

import java.util.List;

public class Class {
    private String className;
    private List<Relationship> relationships;

    public List<String> attributes;
    public List<String> methods;
    
    
    //#region constractor
    public Class() {
    }

    public Class(String className, List<String> attributes, List<String> methods, List<Relationship> relationships) {
        this.className = className;
        this.attributes = attributes;
        this.methods = methods;
        this.relationships = relationships;
    }
    //#endregion

    //#region getter and setter
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        if(className == null || className.isEmpty()){
            throw 
                new IllegalArgumentException("className is null");
        }
        this.className = className;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        if(relationships == null || relationships.isEmpty()){
            throw 
                new IllegalArgumentException("className is null");
        }
        this.relationships = relationships;
    }

    //#endregion
    
}
