package com.example;

import io.micronaut.data.mongodb.annotation.MongoFilter;
import io.micronaut.data.mongodb.annotation.MongoFindQuery;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.mongodb.annotation.MongoSort;
import io.micronaut.data.repository.CrudRepository;
import org.bson.types.ObjectId;

@MongoRepository(databaseName = "mnbooks")
public interface BookRepository extends CrudRepository<Book, ObjectId> {
    @MongoFindQuery("{author: {$eq: 'J. R. R. Tolkien'}}")
    Iterable<Book> findTolkienBooks();

    @MongoSort("{published: -1}")
    @MongoFindQuery("{author: {$eq: 'George R. R. Martin'}}")
    Iterable<Book> findMartinBooks();

    @MongoFilter("{published: {$lt: '2000'}}")
    @MongoFindQuery
    Iterable<Book> findOldBooks();

    @MongoFindQuery("{published: {$gte: :firstYear, $lt: :lastYear}}")
    Iterable<Book> findBooksPublishedBetween(String firstYear, String lastYear);
}