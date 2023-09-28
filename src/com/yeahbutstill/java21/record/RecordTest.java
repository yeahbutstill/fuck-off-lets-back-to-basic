package com.yeahbutstill.java21.record;

public class RecordTest {
    public static void main(String[] args) {
        Binatang binatang = new Binatang("Elang");
        System.out.println(binatang.name().equals("Elang"));
        System.out.println();

        RecordTest recordTest = new RecordTest();
        String createdUser = recordTest.respond(new UserCreatedEvent("yeahbutstill"));
        String deletedUser = recordTest.respond(new UserDeletedEvent(new User("yeahbutstill", 10L)));
        boolean resultCreated = createdUser.equals("the new user with username yeahbutstill has been created");
        boolean resultDeleted = deletedUser.equals("the user yeahbutstill has been deleted");
        System.out.println(resultCreated);
        System.out.println(resultDeleted);
    }

    public String respond(Object o) {
        return switch (o) {
            case UserDeletedEvent(User user) -> "the user " + user.username() + " has been deleted";
            case UserCreatedEvent(String username) -> "the new user with username " + username + " has been created";
            default -> null;
        };
    }
}
