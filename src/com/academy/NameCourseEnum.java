package com.academy;

public enum NameCourseEnum {
    BASH("Bash"), HASKELL("Haskell"), HAMILTON_C_SHELL("Hamilton C Shell");

    String label = null;

    NameCourseEnum(String label) {
        this.label = label;
    }
}
