abstract class Exp {
  public abstract int accept(Visitor v);
}

class Plus extends Exp {
  Exp e1, e2;
  public Plus(Exp a, Exp b) {
  	e1 = a;
  	e2 = b;
  }
  public String toString() {
  	return "+ " + e1 + " " + e2;
  }
  public int accept(Visitor v) {
    return v.visit(this);
  }
}

class Minus extends Exp {
  Exp e1, e2;
  public Minus(Exp a, Exp b) {
  	e1 = a;
  	e2 = b;
  }
  public String toString() {
  	return "- " + e1 + " " + e2;
  }
  public int accept(Visitor v) {
    return v.visit(this);
  }
}

class Times extends Exp {
  Exp e1, e2;
  public Times(Exp a, Exp b) {
  	e1 = a;
  	e2 = b;
  }
  public String toString() {
  	return "* " + e1 + " " + e2;
  }
  public int accept(Visitor v) {
    return v.visit(this);
  }
}

class Divide extends Exp {
  Exp e1, e2;
  public Divide(Exp a, Exp b) {
  	e1 = a;
  	e2 = b;
  }
  public String toString() {
  	return "/ " + e1 + " " + e2;
  }
  public int accept(Visitor v) {
    return v.visit(this);
  }
}

class Power extends Exp {
  Exp e1, e2;
  public Power(Exp a, Exp b) {
  	e1 = a;
  	e2 = b;
  }
  public String toString() {
  	return "^ " + e1 + " " + e2;
  }
  public int accept(Visitor v) {
    return v.visit(this);
  }
}

class Num extends Exp {
  int num;
  public Num(int a) {
  	num = a;
  }
  public String toString() {
  	return "" + num;
  }
  public int accept(Visitor v) {
    return v.visit(this);
  }
}
