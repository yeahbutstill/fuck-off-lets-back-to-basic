package id.toki.tlx.interfaces.impl;

import id.toki.tlx.interfaces.Light;

public class LightImpl implements Light {

  @Override
  public Boolean on() {
    System.out.println("Nyala");
    return true;
  }

  @Override
  public Boolean off() {
    System.out.println("Mati");
    return false;
  }

  @Override
  public Integer brighten(Integer i) {
    return i;
  }

  @Override
  public Integer dim(Integer i) {
    return i;
  }
}
