package org.apache.cxf.rs.examples;

/**
 * Indicates that the Person update request was invalid
 */
public class PersonUpdateException extends Exception {

    private static final long serialVersionUID = 1L;

    public PersonUpdateException() {

    }

    public PersonUpdateException(String message) {
        super(message);
    }

    public PersonUpdateException(Throwable cause) {
        super(cause);
    }
}
