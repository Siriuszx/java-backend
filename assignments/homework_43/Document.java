package homework_43;

public class Document {
    DocumentState documentState = DocumentState.DRAFT;

    public Document() {
    }

    public void publish() {
        switch (documentState) {
            case DRAFT: {
                documentState = DocumentState.PUBLISHED;
                System.out.println("Published: Document");
                break;
            }
            default: {
                System.err.println("Error: invalid document state.");
            }
        }
    }

    public void delete() {
        switch (documentState) {
            case DRAFT, PUBLISHED: {
                documentState = DocumentState.DELETED;
                System.out.println("Deleted: Document");
                break;
            }
            default: {
                System.err.println("Error: invalid document state.");
            }
        }
    }

    public void correct() {
        switch (documentState) {
            case PUBLISHED: {
                documentState = DocumentState.DRAFT;
                System.out.println("Edit: Document");
                break;
            }
            default: {
                System.err.println("Error: invalid document state.");
            }
        }
    }
}
