package edu.uaslp.examen;

import java.util.List;

public class BookCollectionManager {
    private List<BookCollection> collections;

    public BookCollection createCollection(String name){
        BookCollection = new BookCollection(collections);
        return BookCollection;

    }

    public BookCollection getCollectionByName(String name){
        return collections.get(name);

    }

    public deleteCollectionByName(String name){


    }

    public void addBookToCollection(String collectionName, Book book){
        collections.add(book);

    }

    public List<String> getCollectionNames(){
        return collections.name;

    }
}
