/* Generated By:JJTree: Do not edit this line. ASTInteger.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package tree;

import parser.Parser;

public
class ASTInteger extends SimpleNode {
  public ASTInteger(int id) {
    super(id);
  }

  public ASTInteger(Parser p, int id) {
    super(p, id);
  }

  private int value;

  public void setValue(String value) {
    this.value = Integer.valueOf(value);
  }

  @Override
  public String toString() {
    return super.toString() + ": " + value;
  }

}
/* JavaCC - OriginalChecksum=fa87fdc2d77e570d25c10eb177693eab (do not edit this line) */