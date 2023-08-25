package az.example.designpatterns.creational.prototype;

public class Document implements Cloneable {

    private Long id;
    private String name;
    private DocumentType type;
    private Category category;
    private String data;

    public Document() {

    }

    public Document(Long id, String name, DocumentType type, Category category, String data) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.category = category;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", category=" + category +
                ", data='" + data + '\'' +
                '}';
    }
//    /**
//     * Shallow copy
//     * @return
//     * @throws CloneNotSupportedException
//     * **/
//
//    @Override
//    protected Document clone() throws CloneNotSupportedException {
//        return (Document) super.clone();
//    }

    /**
     * Deep copy
     * @return
     * @throws CloneNotSupportedException
     **/

    @Override
    protected Document clone() throws CloneNotSupportedException {
        Document document = (Document) super.clone();
        Category category = (Category) document.getCategory().clone();
        DocumentType documentType = (DocumentType) document.getType().clone();
        document.setType(documentType);
        document.setCategory(category);
        return document;
    }


}
