package com.zamannow.oop.data;

class SocialMedia {
    String name;
}

final class Facebook extends SocialMedia {
    void login(String name, String pass) {
        System.out.println("hash + salt");
    }
}

// class FakeFacebook extends Facebook {} // Error karena class sudah di buat final

class Twitter extends SocialMedia {
    final void login(String name, String pass) {
        System.out.println("hash + salt");
    }
}

class FakeTwitter extends Twitter {
    //  @Override
    //  protected void finalize() throws Throwable { // error
    //    super.finalize();
    //  }
}
