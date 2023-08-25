package az.example.designpatterns.creational.prototype;

public class App  {

    public static void main(String[] args) throws CloneNotSupportedException {
        EntityService entityService = new EntityService();
        Document document = entityService.findDocumentById(1L);
        System.out.println(document);

        Document document2 = entityService.findDocumentById(2L);
        System.out.println(document2);
        Document clonedDocument = document.clone();
        clonedDocument.setData("Salam Asiman");
        System.out.println(clonedDocument);
    }
}
