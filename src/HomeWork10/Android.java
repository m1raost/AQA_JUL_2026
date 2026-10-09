package HomeWork10;

public class Android {
    public String color;
    public String model;


    @Override
    public boolean equals(Object obj) {
        if (this.color == null || this.model == null) {
            throw new MyException("Model and color can not be null!");
        }
        if (obj instanceof Android) {
            Android and = (Android) obj;
            if (and.color == null || and.model == null) {
                throw new MyException("Model and color can not be null!");
            }
            boolean isEqual = this.color.equals(and.color)
                    && this.model.equals(and.model);
            return isEqual;
        }
        return false;
    }


    @Override
    public int hashCode() {
        if (this.color == null || this.model == null) {
            throw new MyException("Model and color can not be null");
        }
        return (this.color + this.model).hashCode();
    }

}
