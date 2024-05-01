package com.artivisi.training.bestpractices;

public class CaseInsensitiveString {
    private final String x;

    public CaseInsensitiveString(String x) {
        this.x = x;
    }

    public boolean equals(Object o){
        if (o instanceof CaseInsensitiveString) {
            return this.x.equalsIgnoreCase(((CaseInsensitiveString) o).x);
        }

        if(o instanceof String) {
            return x.equalsIgnoreCase((String)o);
        }

        return false;
    }
}
