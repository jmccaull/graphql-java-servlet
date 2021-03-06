package graphql.servlet.core;

public class SubscriptionException extends Exception {

    private Object payload;

    public SubscriptionException() {
    }

    public SubscriptionException(Object payload) {
        this.payload = payload;
    }

    public Object getPayload() {
        return payload;
    }

}
