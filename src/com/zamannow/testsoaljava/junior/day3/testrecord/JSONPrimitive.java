package com.zamannow.testsoaljava.junior.day3.testrecord;

public sealed interface JSONPrimitive<T> extends JSONValue permits JSONBoolean, JSONNumber, JSONString {
}
