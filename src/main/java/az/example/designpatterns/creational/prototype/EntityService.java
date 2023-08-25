package az.example.designpatterns.creational.prototype;

public class EntityService {

    public DocumentType findDocumentTypeById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        DocumentType documentType = new DocumentType();
        documentType.setId(id);
        String name;
        if (id.compareTo(1L) == 0) {
            name = "personal";
        } else if (id.compareTo(2L) == 0) {
            name = "institutional";
        } else {
            name = "general";
        }
        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Category category = new Category();
        category.setId(id);
        String name;
        if (id.compareTo(1L) == 0) {
            name = "personal";
        } else if (id.compareTo(2L) == 0) {
            name = "work";
        } else {
            name = "general";
        }
        category.setName(name);
        return category;
    }

    public Document findDocumentById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Document document = new Document();
        document.setId(id);
        document.setCategory(findCategoryById(id));
        document.setType(findDocumentTypeById(id));
        String name;
        String data;
        if (id.compareTo(1L) == 0) {
            name = "letter";
            data = "Hello bro";
        } else if (id.compareTo(2L) == 0) {
            name = "report";
            data = "This is a report";
        } else {
            name = "Road rule";
            data = "This is a road rule";
        }
        document.setName(name);
        document.setData(data);
        return document;
    }
}
