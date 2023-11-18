package id.toki.tlx.interfaces;

public interface Light {
    Boolean on();

    Boolean off();

    Integer brighten(Integer i);

    Integer dim(Integer i);
}
