package application.serializableObject;

import java.io.Serializable;

public class SerUploadFile implements Serializable {

    private String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "SerUploadFile{" + "file='" + file + '\'' + '}';
    }
}
