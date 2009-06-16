/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MListH {

    public MListH() {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MHeader().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("#ifndef MList_H");
        sb.append(System.getProperty("line.separator"));
        sb.append("#define MList_H");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#include <stdlib.h>");
        sb.append(System.getProperty("line.separator"));
        sb.append("#include <string.h>");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#include \"MAbstractMacro.h\"");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("typedef struct MNode {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  void* _elem_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  struct MNode* _next_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  int _bool_MType_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("}MNode;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("typedef struct MList {");
        sb.append(System.getProperty("line.separator"));
        sb.append("  int _size_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  MNode* _first_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("  MNode* _last_;");
        sb.append(System.getProperty("line.separator"));
        sb.append("}MList;");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("MList* MList_init();");
        sb.append(System.getProperty("line.separator"));
        sb.append("void MList_free(MList* array);");
        sb.append(System.getProperty("line.separator"));
        sb.append("int MList_pushback(MList* array, void* _elem_);");
        sb.append(System.getProperty("line.separator"));
        sb
                .append("int MList_pushback_Mtype(MList* array, void* _elem_, int _bool_MType_);");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        sb.append("#endif");
        sb.append(System.getProperty("line.separator"));
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}