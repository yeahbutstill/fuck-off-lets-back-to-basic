package com.zamannow.testsoaljava.junior.day3.testrecord;

public class Test {
    public static <T> double toNumber(JSONPrimitive<T> v) {
        return switch (v) {
            case JSONNumber(var n) -> n;
            case JSONBoolean(var b) -> b ? 1 : 0;
            case JSONString(var s) -> {
                try {
                    yield Double.parseDouble(s);
                } catch (NumberFormatException __) {
                    yield Double.NaN;
                }
            }
        };
    }

    public static Object sum1(Pair<? extends JSONPrimitive<?>> pair) {
        return switch (pair) {
            case Pair(JSONNumber(var left), JSONNumber(var right)) -> left + right;
            case Pair(JSONBoolean(var left), JSONBoolean(var right)) -> left | right;
            case Pair(JSONString(var left), JSONString(var right)) -> left.concat(right);
            // Compiler correctly detects that the switch is not exhaustive
            // Comment out the following line to verify
            default -> null;
        };
    }

    public static <T extends JSONPrimitive<U>, U> Object sum2(Pair<T> pair) {
        return switch (pair) {
            case Pair(JSONNumber(var left), JSONNumber(var right)) -> left + right;
            case Pair(JSONBoolean(var left), JSONBoolean(var right)) -> left | right;
            case Pair(JSONString(var left), JSONString(var right)) -> left.concat(right);
            default -> throw new AssertionError(); // Sadly Java can't tell this won't happen
        };
    }

   /*
   public static <T extends JSONPrimitive<U>, U> Object sum3(Pair<T> pair) {
      return switch (pair) {
         // Error—these generic types do not match Pair<T>
         case Pair<JSONNumber>(JSONNumber(var left), JSONNumber(var right)) -> left + right;
         case Pair<JSONBoolean>(JSONBoolean(var left), JSONBoolean(var right)) -> left | right;
         case Pair<JSONString>(JSONString(var left), JSONString(var right)) -> left.concat(right);
      };
   }
   */

    public static CharSequence simplify(SubSequence seq) {
        return switch (seq) {
            case Initial(var cs, var e) when e == cs.length() -> cs;
            case Final(var cs, var s) when s == 0 -> cs;
            case Middle(var cs, var s, var e) when s == 0 && e == cs.length() -> cs;
            case Initial(Initial(var cs, var e1), var e2) ->
                    new Initial(cs, e2);
            case Initial(Middle(var cs, var s1, var e1), var e2) ->
                    new Middle(cs, s1, s1 + e2);
            case Initial(Final(var cs, var s1), var e2) ->
                    new Middle(cs, s1, s1 + e2);
            case Middle(Initial(var cs, var e1), var s2, var e2) ->
                    new Middle(cs, s2, e2);
            case Middle(Middle(var cs, var s1, var e1), var s2, var e2) ->
                    new Middle(cs, s1 + s2, s1 + e2);
            case Middle(Final(var cs, var s1), var s2, var e2) ->
                    new Middle(cs, s1 + s2, s1 + e2);
            case Final(Initial(var cs, var e1), var s2) ->
                    new Middle(cs, s2, e1);
            case Final(Middle(var cs, var s1, var e1), var s2) ->
                    new Middle(cs, s1 + s2, e1);
            case Final(Final(var cs, var s1), var s2) ->
                    new Final(cs, s1 + s2);
            default -> seq;
        };
    }
    public static void main(String[] args) {
//        CharSequence seq = new Final("Mississippi", 6);
//        System.out.println(seq.length());
//        System.out.println(seq.subSequence(0, 3));
//        System.out.println(seq.subSequence(0, 3).getClass().getName());

//        var result = simplify(new Final(
//                new Initial("Mississippi", 6), 3));
//        System.out.println(result + " " + result.getClass().getName());
        var p = new Pair<String>("Hello", "World");
        var p1 = "Hello";
        if (p instanceof Pair(var a, var b)) System.out.println(a + " " + b.toUpperCase());
        if (p instanceof Pair<String>(var a1, var b2)) System.out.println(a1 + " " + b2.toLowerCase());
        if (p instanceof Pair<String>(String a12, String b12)) System.out.println(a12 + " " + b12);
        if (p1 instanceof Object) System.out.println("betul");
        System.out.println("==============================");

        System.out.println(toNumber(new JSONString("42")));
        System.out.println(sum2(Pair.of(new JSONNumber(29), new JSONNumber(13))));
        // This won't compile, and it shouldn't
        // System.out.println(sum2(Pair.of(new JSONNumber(29), new JSONString("13"))));
    }
}
