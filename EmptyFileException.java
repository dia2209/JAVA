/*Create a custom exception EmptyFile and throw it when the user reads an empty file.*/
//Name:Diya Manandhar
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

