package Generator.Models;

import java.util.List;

public class Diagram {
    private String className;
    private List<String> attributes;
    private List<String> methods;
    private List<Relationship> relationships;
    
    //#region constractor
    public Diagram() {
    }

    public Diagram(String className, List<String> attributes, List<String> methods, List<Relationship> relationships) {
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
        this.className = className;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    //#endregion
    
}
