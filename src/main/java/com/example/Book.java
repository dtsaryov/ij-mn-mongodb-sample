package com.example;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;
import org.bson.types.ObjectId;

@SuppressWarnings("unused")
@MappedEntity
public class Book {

    @Id
    private final ObjectId id;

    @MappedProperty
    private final String name;

    @MappedProperty
    private final String author;

    @MappedProperty
    private final String published;

    public Book(ObjectId id, String name, String author, String published) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.published = published;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublished() {
        return published;
    }

    @Override
    public String toString() {
        return name + " by " + author + " (" + published + ")";
    }
}
