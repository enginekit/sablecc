/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MAddPopToForest {

    private final String pElementName;

    private final String pIndex;

    private final MAddPopToForest mAddPopToForest = this;

    MAddPopToForest(
            String pElementName,
            String pIndex) {

        if (pElementName == null) {
            throw new NullPointerException();
        }
        this.pElementName = pElementName;
        if (pIndex == null) {
            throw new NullPointerException();
        }
        this.pIndex = pIndex;
    }

    String pElementName() {

        return this.pElementName;
    }

    String pIndex() {

        return this.pIndex;
    }

    private String rElementName() {

        return this.mAddPopToForest.pElementName();
    }

    private String rIndex() {

        return this.mAddPopToForest.pIndex();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("      trees.add(l");
        sb.append(rElementName());
        sb.append(".getNodes().get(");
        sb.append(rIndex());
        sb.append("));");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}