package Generator.Models;

public class Relationship {
    private String targetClassName;
    private String relationshipType;
    private String multiplicity;
    

    //#region constractor
    public Relationship() {
    }

    public Relationship(String targetClassName, String relationshipType, String multiplicity) {
        this.targetClassName = targetClassName;
        this.relationshipType = relationshipType;
        this.multiplicity = multiplicity;
    }
    //#endregion

    //#region getter and setter
    public String getTargetClassName() {
        return targetClassName;
    }
    public void setTargetClassName(String targetClassName) {
        this.targetClassName = targetClassName;
    }
    public String getRelationshipType() {
        return relationshipType;
    }
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }
    public String getMultiplicity() {
        return multiplicity;
    }
    public void setMultiplicity(String multiplicity) {
        this.multiplicity = multiplicity;
    }
    //#endregion
    
}
