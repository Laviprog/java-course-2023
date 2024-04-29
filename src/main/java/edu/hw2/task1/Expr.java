package edu.hw2.task1;

public interface Expr {
    double evaluate();

    record Constant(double num) implements Expr {
        @Override
        public double evaluate() {
            return num;
        }
    }

    record Negate(Expr expr) implements Expr {
        @Override
        public double evaluate() {
            return expr.evaluate() * -1;
        }
    }

    record Exponent(Expr expr, double stp) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(expr.evaluate(), stp);
        }
    }

    record Addition(Expr expr1, Expr expr2) implements Expr {
        @Override
        public double evaluate() {
            return expr1.evaluate() + expr2.evaluate();
        }
    }

    record Multiplication(Expr expr1, Expr expr2) implements Expr {
        @Override
        public double evaluate() {
            return expr1.evaluate() * expr2.evaluate();
        }
    }
}
