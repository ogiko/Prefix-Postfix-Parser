class PrePostVisitor implements Visitor {

  public int visit(Exp e) {
    return e.accept(this);
  }
  public int visit(Plus e) {
	  int one=e.e1.accept(this);
	  int two=e.e2.accept(this);
	  int count=one+two;
	  System.out.println( one+" + " +two+" = "+count);
  	    return count;
  }
  public int visit(Minus e) {
	   int one=e.e1.accept(this);
	  int two=e.e2.accept(this);
	  int count=one-two;
	  System.out.println( one+" - " +two+" = "+count);

  	return count;
  }
  public int visit(Times e) {
	   int one=e.e1.accept(this);
	  int two=e.e2.accept(this);
	  int count=one*two;
	  System.out.println( one+" * " +two+" = "+count);
	  
  	return count;
  }
  public int visit(Divide e) {
	   int one=e.e1.accept(this);
	  int two=e.e2.accept(this);
	  int count=one/two;
	  System.out.println( one+" / " +two+" = "+count);
	   
  	return count;
  }
  public int visit(Power e) {
	    int one=e.e1.accept(this);
	  int two=e.e2.accept(this);
	  int count=(int)Math.pow(one,two);
	  System.out.println( one+" ^ " +two+" = "+count);
  	    return count;
  }
  public int visit(Num e) {
     return e.num;
  }
}