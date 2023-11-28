package F_Enums;

public class Person {

    private DocumentType documentType;
    private String documentNumber;

    public Person() {
    }

    public Person(DocumentType documentType, String documentNumber) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }
}
