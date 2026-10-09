package HomeWork10;

public class Apple {
    public String color;
    public String model;


    @Override
    public boolean equals(Object obj) {
        if (this.model == null || this.color == null) {
            throw new MyException("Model and color can not be null!");
        }
        if (obj instanceof Apple) {
            Apple a = (Apple) obj;
            if (a.model == null || a.color == null) {
                throw new MyException("Model and color can not be null!");
            }
            boolean isEqual = this.color.equals(a.color)
                    && this.model.equals(a.model);
            return isEqual;
        }
        return false;
    }


    @Override
    public int hashCode() {
        if (this.model == null || this.color == null) {
            throw new MyException("Model and color can not be null");
        }
        return (this.color + this.model).hashCode();
    }
}
