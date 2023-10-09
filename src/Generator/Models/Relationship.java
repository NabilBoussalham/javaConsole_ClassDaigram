package Generator.Models;

public class Relationship {
    private Class targetClass;
    private String relationshipType;
    private String parentMultiplicit;
    private String childMultiplicit;

    //#region constractor
    public Relationship() {
    }

     public Relationship(Class targetClass, String relationshipType, String parentMultiplicit, String childMultiplicit) {
        this.targetClass = targetClass;
        this.relationshipType = relationshipType;
        this.parentMultiplicit = parentMultiplicit;
        this.childMultiplicit = childMultiplicit;
    }
    
    //#endregion

    //#region getter and setter
    public Class getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(Class targetClass) {
        if(targetClass == null)
        throw new IllegalArgumentException("className is null");
        this.targetClass = targetClass;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getParentMultiplicit() {
        return parentMultiplicit;
    }

    public void setParentMultiplicit(String parentMultiplicit) {
        this.parentMultiplicit = parentMultiplicit;
    }

    public String getChildMultiplicit() {
        return childMultiplicit;
    }

    public void setChildMultiplicit(String childMultiplicit) {
        this.childMultiplicit = childMultiplicit;
    }
    //#endregion
    
}
