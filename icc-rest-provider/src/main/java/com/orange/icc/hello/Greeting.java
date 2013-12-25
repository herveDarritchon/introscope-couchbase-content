package com.orange.icc.hello;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 24/12/13
 * Time: 16:56
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
