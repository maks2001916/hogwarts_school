-- liquibase formatted sql

-- changeset mmamonov:1
CREATE TABLE students(
    id   SERIAL,
    name TEXT
)