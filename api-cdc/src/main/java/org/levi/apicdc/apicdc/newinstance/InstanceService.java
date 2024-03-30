package org.levi.apicdc.apicdc.newinstance;

public interface InstanceService {

    BookInstance createInstance(String isbn, NewInstanceRequest request);
}
