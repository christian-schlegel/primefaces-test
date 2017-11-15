package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.ByteArrayInputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;


@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {
    
    private String testString;

    private StreamedContent streamedContent;
    
    @PostConstruct  
    public void init() {
        testString = "Welcome to PrimeFaces!!!";
        streamedContent = new DefaultStreamedContent(new ByteArrayInputStream("Test".getBytes()), "text/plain", "test.txt");
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }    

    public StreamedContent getStreamedContent() {
        return streamedContent;
    }

}
